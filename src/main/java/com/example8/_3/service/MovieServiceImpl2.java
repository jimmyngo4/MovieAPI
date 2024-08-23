package com.example8._3.service;

import com.example8._3.pojo.Movie;
import com.example8._3.pojo.MovieCount;
import com.example8._3.pojo.MoviePage;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MovieServiceImpl2 implements MovieService {
    @Override
    public MovieCount getMovieCountByYear(int year) {
        AtomicInteger count = new AtomicInteger(0);

        try (ExecutorService threadPool = Executors.newCachedThreadPool()) {
            threadPool.submit(() -> {
                for (int page = 1; page < lastPage; page++) {
                    for (Movie movie : restTemplate.getForObject(baseURI + page, MoviePage.class).getData()) {
                        if (movie.getYear() == year)
                            count.incrementAndGet();
                    }
                }
            });
        }

        return new MovieCount(year, count.get());
    }
}

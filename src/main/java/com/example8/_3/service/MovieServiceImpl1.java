package com.example8._3.service;

import com.example8._3.pojo.Movie;
import com.example8._3.pojo.MovieCount;
import com.example8._3.pojo.MoviePage;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl1 implements MovieService {

    @Override
    public MovieCount getMovieCountByYear(int year) {
        int count = 0;

        for (int page = 1; page <= lastPage; page++) {
            for (Movie movie : restTemplate.getForObject(baseURI + page, MoviePage.class).getData()) {
                if (movie.getYear() == year)
                    count++;
            }
        }

        return new MovieCount(year, count);
    }
}

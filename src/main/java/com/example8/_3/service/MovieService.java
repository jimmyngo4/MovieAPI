package com.example8._3.service;

import com.example8._3.pojo.MovieCount;
import com.example8._3.pojo.MoviePage;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public interface MovieService {

    final RestTemplate restTemplate = new RestTemplate();
    final String baseURI = "https://jsonmock.hackerrank.com/api/movies?page=";
    final int lastPage = restTemplate.getForObject(baseURI + 1, MoviePage.class).getTotal_pages();

    MovieCount getMovieCountByYear(int year);
}

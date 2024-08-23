package com.example8._3.controller;

import com.example8._3.pojo.MovieCount;
import com.example8._3.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(@Qualifier("movieServiceImpl2") MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public MovieCount getMovieCountByYear(@RequestParam("year") int year) {
        return movieService.getMovieCountByYear(year);
    }
}

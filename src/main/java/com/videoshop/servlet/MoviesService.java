package com.videoshop.servlet;

/**
 * Created with IntelliJ IDEA.
 * User: natalianavarro
 * Date: 11/6/14
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
import com.videoshop.movies.Movie;

import java.util.List;

public interface MoviesService {

    List<Movie> list();

    void add(Movie movie) throws MovieServiceException;

    void delete(Movie movie) throws MovieServiceException;

    void update(Movie movie) throws MovieServiceException;


    class MovieServiceException extends Exception{


    }

}

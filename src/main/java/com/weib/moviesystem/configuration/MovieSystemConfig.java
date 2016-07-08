/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.moviesystem.configuration;

import com.weib.moviesystem.movie.HistoryMovie;
import com.weib.moviesystem.movie.Movie;
import com.weib.moviesystem.movie.OtherMovie;
import com.weib.moviesystem.player.Player;
import com.weib.moviesystem.player.QQPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zhangjingwei
 */
@Configuration
//@ComponentScan(basePackageClasses={Player.class, Movie.class})
public class MovieSystemConfig {
    
    @Bean(name="historymovie")
    public Movie historyMovie(){
        return new HistoryMovie();
    }
    
    @Bean(name="othermovie")
    public Movie otherMovie(){
        return new OtherMovie();
    }
    
    @Bean
    public Player qqPlayer(){
        QQPlayer player = new QQPlayer(otherMovie());
        return player;
    }
}

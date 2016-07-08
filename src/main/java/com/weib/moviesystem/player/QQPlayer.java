/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.moviesystem.player;

import com.weib.moviesystem.movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
//@Component
public class QQPlayer implements Player {

    private Movie movie;
    
//    @Autowired
//    @Qualifier("historyMovie")    //自动装配时才有效
    public QQPlayer(Movie movie){
        this.movie = movie;
    }
    
    @Override
    public void play() {
        System.out.println("!!!!!!!!!Play with QQPlayer!!!!!!!!!!!!!");
        this.movie.play();
    }
    
}

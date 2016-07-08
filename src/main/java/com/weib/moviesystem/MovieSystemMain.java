/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.moviesystem;

import com.weib.moviesystem.configuration.MovieSystemConfig;
import com.weib.moviesystem.movie.OtherMovie;
import com.weib.moviesystem.player.QQPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangjingwei
 */
public class MovieSystemMain {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieSystemConfig.class);
        String[] x = context.getBeanDefinitionNames();
        QQPlayer player = context.getBean(QQPlayer.class); 
        player.play();
        context.close();
    }
}

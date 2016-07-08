/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.moviesystem.movie;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
//@Component
public class HistoryMovie implements Movie {

    @Override
    public void play() {
        System.out.println("#########################HistoryMovie");
    }
    
}

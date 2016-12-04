/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj.hw;

import javax.ejb.Stateless;

@Stateless
public class HelloWorld implements HelloWorldRemote {

    @Override
    public String sayHello(String msg) {
        return msg;
    }

  
}

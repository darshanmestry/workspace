/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj.hw;

import javax.ejb.Remote;

/**
 *
 * @author Lenovo
 */
@Remote
public interface HelloWorldRemote {

    String sayHello(String String);
    
}

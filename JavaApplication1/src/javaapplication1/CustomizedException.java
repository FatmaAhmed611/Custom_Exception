/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author A M
 */
public class CustomizedException extends Exception {
    public CustomizedException(){
        super();
    }
    
    public CustomizedException(String message){
        super(message);
    }
    
    public CustomizedException(String message ,Throwable cause){
        super(message,cause);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author omarh
 */
public class IPCutter {
    String ip;
    
    public IPCutter(String ip){
        this.ip = ip;
    }
    
    public int[] cutIP(){
        String numbers[] = ip.split("\\.");
        int intNumbers[] = new int[4];
        if (numbers.length != 4){
            return null;
        }
        else {
            for (int i=0; i<4; i++){
                intNumbers[i] = Integer.parseInt(numbers[i]);
            }
            return intNumbers;
        }
    }
}

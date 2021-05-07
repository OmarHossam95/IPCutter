package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        IPCutter ipcutter = new IPCutter("163.121.12.30");
        int ipNumbers[] = ipcutter.cutIP();
        if (ipNumbers != null) {
            for (int n : ipNumbers) {
                System.out.println(n);
            }
        }
    }
}
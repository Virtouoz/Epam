package com.company.maintask;

public class MainTask {

    public static void mainTask(String[] args){
        System.out.println("Hello " + args[0]);

        for(int i=args.length-1; i>=0; i--)
            System.out.println("args[" + i + "] : " + args[i]);
    }
}

package com.zitian.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{

        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        
        numbers.print();
        
        numbers.insertAt(99, 0);

        
        numbers.print();

        numbers.insert(40);

        numbers.print();



    }
}

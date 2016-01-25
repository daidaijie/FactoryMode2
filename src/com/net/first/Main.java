package com.net.first;

import com.net.first.factory.IFactory;
import com.net.first.factory.LeiFeng;
import com.net.first.factory.UndergraduateFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}

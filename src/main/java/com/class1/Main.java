package com.class1;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 4 ; i++) {
            System.out.println("Hello world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

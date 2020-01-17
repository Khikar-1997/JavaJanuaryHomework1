package com.company;

public class Main {

    public static void main(String[] args) {
        Tv tvSumsung = new Tv(10, 15, true);
        Tv tvLg = new Tv(25, 30, false);
        tvSumsung.turnOnOrOffTv();
        tvLg.turnOnOrOffTv();
    }
}

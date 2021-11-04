package com.company;

public class Main {

    public static void main(String[] args) {

        double[] sst = { 3.4, -4.6, 5.5, -6.4, 7.7, -4.4, 8.2, -9.3, 3.3,-7.9, 2.2, -6.9, 4.9, -9.8, 8.7};

        double summa = 0;
        double kol = 0;
        boolean isOtr = false;
        for (double i : sst){
            if (i < 0){
                isOtr = true;
            }else if (isOtr) {
                kol++;
                summa += i;
            }
        }
        System.out.println(summa/kol);

    }


}

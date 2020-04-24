package com.company;

import java.util.Scanner;

public class Main {
    static double tax(double x){
        if (x>150_000){
            if (x>=5_000_001){
                return x=x*0.35;
            }
            else if (x>=2_000_001){
                return x=x*0.30;
            }
            else if (x>=1_000_001){
                return x=x*0.25;
            }
            else if (x>=750_001){
                return x=x*0.20;
            }
            else if (x>=500_001){
                return x=x*0.15;
            }
            else if (x>=300_001){
                return x=x*0.1;
            }
            else {
                return x=x*0.05;
            }
        }
        else {
            return x=0;
        }
    }
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println(tax(in.nextDouble()));
    }
}
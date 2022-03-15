package com.company;
import java.util.Scanner;

public class Main {
    public static boolean divided(int number) {
        if(number %2==0 && number!=2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     int weight=inp.nextInt();
     boolean z=divided(weight);
     if(z==true){
         System.out.println("yes");
     }
     else{
         System.out.println("no");
     }
    }
}

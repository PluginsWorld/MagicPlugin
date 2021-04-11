package com.github.ukraine1449.magicplugin.Utilities;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int nr = random.nextInt(100);
        if(nr < 50){
            System.out.println("Armor has been chosen");
            int rn = random.nextInt(3);
            if(rn == 0){
                System.out.println("Head");
            }else if(rn == 1){
                System.out.println("Chestplate");
            }else if(rn == 2){
                System.out.println("Leggings");
            }else{
                System.out.println("Boots");
            }
            int rtwo = random.nextInt(2);
            if(rtwo == 0){
                System.out.println("Attack");
                int rt = random.nextInt(1);
                if(rt == 0){
                    System.out.println("Visual");
                }else{
                    System.out.println("Others");
                }
            }else if(rtwo == 1){
                System.out.println("Defence");
                int rt = random.nextInt(1);
                if(rt == 0){
                    System.out.println("Visual");
                }else{
                    System.out.println("Others");
                }
            }else if(rtwo == 3){
                System.out.println("Utility");
                int rt = random.nextInt(1);
                if(rt == 0){
                    System.out.println("Visual");
                }else{
                    System.out.println("Others");
                }
            }
        }
        else{
            System.out.println("an Item has been chosen");
            Random ran = new Random();
            int rn = random.nextInt(100);
            if(rn < 50){
                System.out.println("attack");
            }else{
                System.out.println("utillity");
            }
        }
    }
}

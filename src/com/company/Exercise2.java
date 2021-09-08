package com.company;

public class Exercise2 {

    public static void main(String[] args) {
        zippo("rattle", 13); //1
    }

    public static void baffle(String blimp) { //5
        System.out.println(blimp); //6 (the value of blimp, when baffle gets invoked, will be rattle)
        zippo("ping", -5); //7
    }

    public static void zippo(String quince, int flag) { //2, 8
        if (flag < 0) {
            System.out.println(quince + " zoop"); //9
        } else {
            System.out.println("ik"); //3
            baffle(quince); //4
            System.out.println("boo-wa-ha-ha"); //10
        }
    }
    /* The output of this program will be:
    ik
    rattle
    ping zoop
    boo-wa-ha-ha
     */
}

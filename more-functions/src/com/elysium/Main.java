package com.elysium;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class Main {

    public static Scanner inputScan = new Scanner(System.in);
    //public static CaseInsensitiveMap


    public static void main(String[] args) {

        // MAGIC 8 BALL

        //randomNum();
        shakeBall();

    }

    public static void shakeBall() {

        // Shake menu

        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("//////                                                   //////");
        System.out.println("//////                ADI Macaron:                       //////");
        System.out.println("//////       and the Magic Eight Ball of Doom            //////");
        System.out.println("//////                                                   //////");
        System.out.println("//////     ####    #    #    ##   #    #   ######        //////");
        System.out.println("//////     #       #    #   #  #  #   #    ##            //////");
        System.out.println("//////     ####    ######  #****# ####     ####          //////");
        System.out.println("//////        #    #    #  #    # #   #    ##            //////");
        System.out.println("//////     ####    #    #  #    # #    #   ######        //////");
        System.out.println("//////                                                   //////");
        System.out.println("//////                     Y/N                           //////");
        System.out.println("//////                                                   //////");
        System.out.println("//////                                                   //////");
        System.out.println("///////////////////////////////////////////////////////////////");

        String choice = inputScan.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Close your eyes, and focus on your question...");

            // countdownTimer BONUS - ** can't seem to get the timer to act "normally" instead of just printing every number at once **
            for (int i = 10; i > 0; i--) {
                System.out.println();
                countdownTimer(i);
                System.out.println("");

            }
            randomNum();

        }if (choice.equalsIgnoreCase("N"));
            System.out.println("RUN AWAY!!");
            System.out.println("");
            System.exit(0);

        }
        //randomNum();


    // random cpu answers

    private static String randomNum() {

        int comp = (int) Math.round(Math.random() * 20);

        switch (comp) {
            case 0:
                System.out.println("It is certain");
                System.out.println("");
                break;
            case 1:
                System.out.println("It is decidedly so");
                System.out.println("");
                break;
            case 2:
                System.out.println("Without a doubt");
                System.out.println("");
                break;
            case 3:
                System.out.println("Yes, definitely");
                System.out.println("");
                break;
            case 4:
                System.out.println("You may rely on it");
                System.out.println("");
                break;
            case 5:
                System.out.println("As I see it, yes");
                System.out.println("");
                break;
            case 6:
                System.out.println("Most likely");
                System.out.println("");
                break;
            case 7:
                System.out.println("Outlook good");
                System.out.println("");
                break;
            case 8:
                System.out.println("Yes");
                System.out.println("");
                break;
            case 9:
                System.out.println("Signs point to yes");
                System.out.println("");
                break;
            case 10:
                System.out.println("Outlook uncertain... Honestly, I don't know why I bother.");
                System.out.println("");
                break;
            case 11:
                System.out.println("Outlook hazy - try again");
                System.out.println("");
                break;
            case 12:
                System.out.println("What's with these ridiculous questions?");
                System.out.println("");
                break;
            case 13:
                System.out.println("How the hell should I know?");
                System.out.println("");
                break;
            case 14:
                System.out.println("Nobody's perfect.");
                System.out.println("");
                break;
            case 15:
                System.out.println("Don't count on it");
                System.out.println("");
                break;
            case 16:
                System.out.println("Let me think. Uhhhhhhh....No");
                System.out.println("");
                break;
            case 17:
                System.out.println("Argo f*** yourself.");
                System.out.println("");
                break;
            case 18:
                System.out.println("Outlook not so good");
                System.out.println("");
                break;
            case 19:
                System.out.println("Very doubtful");
                System.out.println("");
                break;
            default:
                System.out.println("No, now go away, or I shall taunt you a second time");
                System.out.println("");
                break;
        }
        shakeBall();
        return randomNum();
    }

    // Timer Bonus
    public static void countdownTimer(int seconds) {

        switch (seconds) {
            case 10:
                System.out.println("10..........");
                break;
            case 9:
                System.out.println("9.........");
                break;
            case 8:
                System.out.println("8........");
                break;
            case 7:
                System.out.println("7.......");
                break;
            case 6:
                System.out.println("6......");
                break;
            case 5:
                System.out.println("5.....");
                break;
            case 4:
                System.out.println("4....");
                break;
            case 3:
                System.out.println("3...");
                break;
            case 2:
                System.out.println("2..");
                break;
            case 1:
                System.out.println("1.");
        }


    }
}


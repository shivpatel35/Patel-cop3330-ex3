package org.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {
        Scanner quote = new Scanner(System.in);
        Scanner author = new Scanner(System.in);
        String str1;
        String str2;

        System.out.println("What is the quote?");
        str1 = quote.nextLine();

        System.out.println("Who said it?");
        str2 = author.nextLine();

        System.out.println("" + str2 +" said, " + "\"" +str1 +"\"");
    }

}

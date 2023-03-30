/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author ener2
 */
import java.util.Scanner;

public class DegreeOfFreedom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the observation values from the user
        System.out.println("Enter the number of females who deposit:");
        int femaleDeposit = input.nextInt();
        System.out.println("Enter the number of females who do not deposit:");
        int femaleNoDeposit = input.nextInt();
        System.out.println("Enter the number of females who litter:");
        int femaleLitter = input.nextInt();
        System.out.println("Enter the number of females who do not litter:");
        int femaleNoLitter = input.nextInt();
        System.out.println("Enter the number of males who deposit:");
        int maleDeposit = input.nextInt();
        System.out.println("Enter the number of males who do not deposit:");
        int maleNoDeposit = input.nextInt();
        System.out.println("Enter the number of males who litter:");
        int maleLitter = input.nextInt();
        System.out.println("Enter the number of males who do not litter:");
        int maleNoLitter = input.nextInt();

        // Calculate the totals for each category
        int totalDeposit = femaleDeposit + maleDeposit;
        int totalNoDeposit = femaleNoDeposit + maleNoDeposit;
        int totalLitter = femaleLitter + maleLitter;
        int totalNoLitter = femaleNoLitter + maleNoLitter;

        // Calculate the percentages of each category
        double percFemaleNoDeposit = (double) femaleNoDeposit / totalNoDeposit * 100;
        double percMaleNoDeposit = (double) maleNoDeposit / totalNoDeposit * 100;
        double percFemaleNoLitter = (double) femaleNoLitter / totalNoLitter * 100;
        double percMaleNoLitter = (double) maleNoLitter / totalNoLitter * 100;

        // Output the results
        System.out.println("Total number of people who deposit: " + totalDeposit);
        System.out.println("Total number of people who do not deposit: " + totalNoDeposit);
        System.out.println("Total number of people who litter: " + totalLitter);
        System.out.println("Total number of people who do not litter: " + totalNoLitter);
        System.out.println("Percentage of females who do not deposit: " + percFemaleNoDeposit + "%");
        System.out.println("Percentage of males who do not deposit: " + percMaleNoDeposit + "%");
        System.out.println("Percentage of females who do not litter: " + percFemaleNoLitter + "%");
        System.out.println("Percentage of males who do not litter: " + percMaleNoLitter + "%");
    }
}


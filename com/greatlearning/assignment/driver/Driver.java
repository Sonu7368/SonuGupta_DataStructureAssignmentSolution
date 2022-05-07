package com.greatlearning.assignment.driver;

import com.greatlearning.assignment.architect.model.ArchitectDriver;
import com.greatlearning.assignment.bstflatten.model.BSTDriver;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Choose a problem: \n 1. Architect Plan \n 2. BST Flattening ");

        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1:
                ArchitectDriver.main(args);
                break;
            case 2:
                BSTDriver.main(args);
                break;
            default:
                System.out.println("Invalid option. ");
                break;
        }

        sc.close();
    }
}

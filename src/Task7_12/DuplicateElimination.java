package com.company.Task7_12;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner for data reading

        int array[] = {0, 0, 0, 0, 0};

        System.out.println("Input numbers between 10 and 100");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            boolean duplicateYN = false;
            int j = 0;


            while (array[j] != 0) {
                if (array[j] == number) {
                    duplicateYN = true;
                }
                j++;
            }

            if (duplicateYN == true) {
                System.out.println("Duplicate");
                for (int k = 0; k < 5; k++)
                    if (array[k] != 0)
                        System.out.print(array[k] + " ");
            } else {
                array[j] = number;
                for (int k = 0; k < 5; k++)
                    if (array[k] != 0)
                        System.out.print(array[k] + " ");
            }
            System.out.println();

        }


package com.company.Task7_15;

public class CommandLineArgument {
    public static void main(String[] args) {

        int arrayLength;

        System.out.println();

        if(args.length != 1){
            System.out.println("By default array Lenght is 10 ");
            arrayLength = 10;
            sumOfInteger(arrayLength);
        }else
        {
            arrayLength = Integer.parseInt(args[0]);
            sumOfInteger(arrayLength);
        }
    }
    public static int sumOfInteger(int arLengh){
        int[] array = new int[arLengh];
        int sum = 0;
        System.out.printf("%s%8s%n", "Index", "Value");

        for(int i = 0; i < array.length; i++){
            sum += i ;
            System.out.printf("%5d%8d%n", (i+1), sum);
        }
        return sum;
    }
}
©
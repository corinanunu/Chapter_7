package com.company.Task7_14;

public class VariableLengthArgumentLis {
    public static void main(String[] args) {

        int arrayInt[] = {9, 4, 7, 1, 8, 4};
        System.out.println("Product of 2 numbers is --> "+productOfInt(arrayInt[0], arrayInt[1]));
        System.out.println("Product of 3 numbers is --> "+productOfInt(arrayInt[0], arrayInt[1], arrayInt[2]));
        System.out.println("Product of 4 numbers is --> "+productOfInt(arrayInt[0], arrayInt[1], arrayInt[2], arrayInt[3]));
        System.out.println("Product of 5 numbers is --> "+productOfInt(arrayInt[0], arrayInt[1], arrayInt[2], arrayInt[3],
                arrayInt[4]));
        System.out.println("Product of 6 numbers is --> "+productOfInt(arrayInt[0], arrayInt[1], arrayInt[2], arrayInt[3],
                arrayInt[4], arrayInt[5]));
    }
    public static int productOfInt(int ... numbers){
        int product = 1;
        for (int no: numbers) {
            product *= no;
        }
        return product;
    }

}
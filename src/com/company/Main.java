package com.company;

public class Main {
    public static int[] shift(int[] array,int n){

        int buffer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1){
                array[i] = array[i+1];
            }else {
                array[i] = buffer;
            }
        }
        return array;
    }
    public static int[] shift2(int[] array,int n){

        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1){
                array2[i] = array[i+1];
            }else {
                array2[i] = array[0];
            }
        }
        return array2;
    }
    public static void main(String[] args) {
	int[] array = {10,20,30,40,50};
	int[] array2 = shift2(array, 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}

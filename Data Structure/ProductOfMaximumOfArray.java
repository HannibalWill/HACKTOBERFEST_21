package com.company;

import java.util.Arrays;

public class ProductOfMaximumOfArray {

    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long result = 1;
        int count = 0;
        for(int i=numbers.length-1; i>=0; i--){
            if(count < sub_size){
                result *= numbers[i];
                count++;
            }else{
                break;
            }
        }
        return result; // Do your magic!
    }
}

package com.company.cycles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(234, 8768, 9, 54, 108);
        List<Integer> outputList = new ArrayList<>();

        for(int i = inputList.size() - 1; i >= 0; i--) {
            outputList.add(inputList.get(i));
        }
        for(int i = 0; i < outputList.size(); i++) {
            System.out.print(outputList.get(i) + " ");
        }
        int max = inputList.get(0);
        for(int i = 1; i < inputList.size(); i++) {
            if (max < inputList.get(i)) {
                max = inputList.get(i);
            }
        }
        System.out.println(max);
        int min = inputList.get(0);
        for(int i = 1; i < inputList.size(); i++){
            if(min > inputList.get(i)){
                min = inputList.get(i);
            }
        }
        System.out.println(min);
    }
}

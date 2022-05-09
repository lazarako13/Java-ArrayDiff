package com.helloworld;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Kata {
    
    public static int[]arrayDiff(int[]a,int[]b){
        ArrayList<Integer>listOfA= new ArrayList<>();
        ArrayList<Integer>listOfB= new ArrayList<>();

        for(int element:a){
            listOfA.add(element);
        }
        for(int element:b){
            listOfB.add(element);
        }
        listOfA.removeAll(listOfB);

        return listOfA.stream().mapToInt(valeur->valeur).toArray();
    }
}

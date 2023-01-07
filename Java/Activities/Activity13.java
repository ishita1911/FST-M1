package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random indexGen = new Random();

        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter number:");
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        Integer num[]= list.toArray(new Integer[0]);
        int index= indexGen.nextInt(num.length);
        System.out.println("Index:"+index);
        System.out.println("num at that index:"+num[index]);

        sc.close();


    }
}

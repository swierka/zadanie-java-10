package Zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe dodatnia: ");
        Double userInput = scan.nextDouble();
        int i = 0;
        while (userInput >= i) {
            numbers.add(userInput);
            System.out.println("Podaj kolejna liczbe: ");
            userInput = scan.nextDouble();
        }

        //wyswietlanie w odwrotnej kolejnosci
        Collections.reverse(numbers);
        System.out.println(numbers);

        //suma
        Collections.reverse(numbers);
        double sum = 0;

        for(Double num: numbers){
            System.out.print(num+"+");
            sum += num;
        }
        System.out.println("="+sum);

        //max i min
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));
    }
}

package com.anish.day4;

//import in.kncsolutions.dhelm.mathcal.CandleFacts;
//
//import java.util.ArrayList;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
      Justplay(new Football());

//        List<String> names = new ArrayList<>();
//
//        names.add("Chaudhary");
//        names.add("Anish");
//
//       names  = CandleFacts.reverseString(names);
//        System.out.println(names);
//
//        List<Double> numbers = new ArrayList<>();
//        numbers.add(5D);
//        numbers.add(1D);
//
//        List<Double> nbr = CandleFacts.reverseDouble(numbers);
//
//        System.out.println(nbr);
    }
    public static void Justplay(Playable playable){
        playable.play();
    }
}

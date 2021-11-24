package com.example.codingdojo202111;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.util.ArrayList;
import java.util.List;

public class Russian {

  public static int Mul(int x, int y) {
    return -1;
  }

  public static List<Tuple2<Integer, Integer>> divideAndMultiply(int x, int y) {
    var result = new ArrayList<Tuple2<Integer, Integer>>();
    result.add(Tuple.of(x, y));
    while(x > 1) {
      x = x/2;
      y = y*2;
      result.add(Tuple.of(x, y));
    }
    return result;
  }

  public static List<Tuple2<Integer, Integer>> removeEvenLeft(List<Tuple2<Integer, Integer>> painList) {
    return painList
        .stream()
        .filter(item -> item._1 % 2 != 0)
        .toList();
  }


  public static int sumRight(List<Tuple2<Integer, Integer>> plainList) {
    return plainList
        .stream()
        .mapToInt(item -> item._2)
        .sum();
  }
}

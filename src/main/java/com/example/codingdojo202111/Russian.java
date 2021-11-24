package com.example.codingdojo202111;

import io.vavr.Tuple;
import java.util.stream.Stream;

public class Russian {

  public static int Mul(int x, int y) {
    return Stream.iterate(
            Tuple.of(x, y),
            it -> it._1 >= 1,
            it -> it.map(left -> left / 2, right -> right * 2))
        .filter(item -> item._1 % 2 != 0)
        .mapToInt(item -> item._2)
        .sum();
  }
}

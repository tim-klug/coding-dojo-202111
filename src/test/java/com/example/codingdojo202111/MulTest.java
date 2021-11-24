package com.example.codingdojo202111;

import static org.assertj.core.api.Assertions.assertThat;

import io.vavr.Tuple;
import java.util.List;
import org.junit.jupiter.api.Test;

class MulTest {

  @Test
  void callMethod() {
    assertThat(Russian.Mul(2, 4)).isNotNull();
  }

  @Test
  void divideAndMultiplyByTwo() {
    assertThat(Russian.divideAndMultiply(67, 52)).isEqualTo(List.of(
        Tuple.of(67, 52),
        Tuple.of(33, 104),
        Tuple.of(16, 208),
        Tuple.of(8, 416),
        Tuple.of(4, 832),
        Tuple.of(2, 1664),
        Tuple.of(1, 3328)
    ));
  }

  @Test
  void removeEvenLeft() {
    assertThat(Russian.removeEvenLeft(List.of(
        Tuple.of(67, 52),
        Tuple.of(33, 104),
        Tuple.of(16, 208),
        Tuple.of(8, 416),
        Tuple.of(4, 832),
        Tuple.of(2, 1664),
        Tuple.of(1, 3328)
    ))).isEqualTo(List.of(
        Tuple.of(67, 52),
        Tuple.of(33, 104),
        Tuple.of(1, 3328)
    ));
  }
}

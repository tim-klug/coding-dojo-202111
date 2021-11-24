package com.example.codingdojo202111;

import static org.assertj.core.api.Assertions.assertThat;

import io.vavr.Tuple;
import java.util.List;
import org.junit.jupiter.api.Test;

class MulTest {

  @Test
  void callMethod() {
    assertThat(Russian.Mul(67, 52)).isEqualTo(3484);
  }
}

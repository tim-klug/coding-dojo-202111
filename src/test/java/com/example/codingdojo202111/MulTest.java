package com.example.codingdojo202111;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MulTest {

  @Test
  void callMethod() {
    assertThat(Russian.Mul(2, 4)).isNotNull();
  }
}

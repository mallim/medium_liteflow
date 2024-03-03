package org.example.liteflow.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record Fact(int number,
                   String result) {
  public boolean isDivisibleBy(int divisor) {
    return number % divisor == 0;
  }

  public Fact computeOwnResult() {
    return this.toBuilder().result(String.valueOf(number())).build();
  }
}

package org.example.liteflow.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Context {

  private List<Fact> result = new ArrayList<>();

  public void putResult(Fact fact) {
    this.result.add(fact);
  }

  public String extractFact(int i) {
    return result.stream()
        .filter(fact -> fact.number() == i)
        .map(Fact::result)
        .findFirst()
        .orElse("");
  }
}

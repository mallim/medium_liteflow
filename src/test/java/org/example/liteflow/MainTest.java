package org.example.liteflow;

import org.example.liteflow.model.Context;
import org.example.liteflow.service.FizzBuzzService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MainTest {

  @Autowired
  private FizzBuzzService service;

  @Test
  void contextLoads() {
    Context context = service.calculate( 100 );
    assertThat( context.extractFact( 1 ) ).isEqualTo( "1" );
    assertThat( context.extractFact( 3 ) ).isEqualTo( "Fizz" );
    assertThat( context.extractFact( 5 ) ).isEqualTo( "Buzz" );
    assertThat( context.extractFact( 6 ) ).isEqualTo( "Fizz" );
    assertThat( context.extractFact( 10 ) ).isEqualTo( "Buzz" );
    assertThat( context.extractFact( 15 ) ).isEqualTo( "FizzBuzz" );
  }
}

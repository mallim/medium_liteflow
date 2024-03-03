package org.example.liteflow.service;

import com.yomahub.liteflow.core.FlowExecutor;
import lombok.RequiredArgsConstructor;
import org.example.liteflow.model.Context;
import org.example.liteflow.model.Fact;

@RequiredArgsConstructor
public class FizzBuzzService {

  private final FlowExecutor flowExecutor;

  public Context calculate( int limit ) {
    Context context = new Context();
    for( int i = 0; i < limit; i ++ ){
      var fact = Fact.builder().number( i + 1).build();
      flowExecutor.execute2Resp( "fizzbuzz_chain", fact, context );
    }

    return context;
  }
}

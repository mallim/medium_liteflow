package org.example.liteflow.config;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.FlowExecutor;
import org.example.liteflow.component.BuzzRule;
import org.example.liteflow.component.FizzBuzzRule;
import org.example.liteflow.component.FizzRule;
import org.example.liteflow.component.NonFizzBuzzRule;
import org.example.liteflow.service.FizzBuzzService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfig {

  @Bean
  public FizzBuzzService fizzBuzzService( FlowExecutor flowExecutor ) {
    return new FizzBuzzService( flowExecutor );
  }

  @Bean(name="FizzRule")
  public FizzRule fizzRule() {
    return new FizzRule();
  }

  @Bean(name="BuzzRule")
  public BuzzRule buzzRule() {
    return new BuzzRule();
  }

  @Bean(name="FizzBuzzRule")
  public FizzBuzzRule fizzBuzzRule() {
    return new FizzBuzzRule();
  }

  @Bean(name="NonFizzBuzzRule")
  public NonFizzBuzzRule nonFizzBuzzRule() {
    return new NonFizzBuzzRule();
  }
}

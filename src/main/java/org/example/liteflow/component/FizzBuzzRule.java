package org.example.liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.example.liteflow.model.Context;
import org.example.liteflow.model.Fact;

public class FizzBuzzRule extends NodeComponent {

  @Override
  public void process() {
    Fact fact = this.getRequestData();
    var context = this.getContextBean(Context.class);
    context.putResult(fact.toBuilder().result("FizzBuzz").build());
  }

  @Override
  public boolean isAccess() {
    Fact fact = this.getRequestData();
    return fact.isDivisibleBy(3) && fact.isDivisibleBy(5);
  }
}

package org.example.liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import lombok.RequiredArgsConstructor;
import org.example.liteflow.model.Context;
import org.example.liteflow.model.Fact;

public class NonFizzBuzzRule extends NodeComponent {
  @Override
  public void process() {
    Fact fact = this.getRequestData();
    var context = this.getContextBean(Context.class);
    context.putResult(fact.computeOwnResult());
  }

  @Override
  public boolean isAccess() {
    Fact fact = this.getRequestData();
    return ! fact.isDivisibleBy(3) && ! fact.isDivisibleBy(5);
  }
}

package gl.js.jhex.infrastructure.inputport;

import java.math.BigDecimal;

import gl.js.jhex.domain.Orders;

public interface OrderInputPort {
  public Orders createOrder(String customerId, BigDecimal total);
}
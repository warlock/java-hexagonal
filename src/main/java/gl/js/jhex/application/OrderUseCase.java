package gl.js.jhex.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gl.js.jhex.domain.Orders;
import gl.js.jhex.infrastructure.inputport.OrderInputPort;
import gl.js.jhex.infrastructure.outputport.EntityRepository;

@Component
public class OrderUseCase implements OrderInputPort {

  @Autowired
  EntityRepository entityRepository;

  @Override
  public Orders createOrder(String customerId, BigDecimal total) {
    Orders order = Orders.builder()
        .id(UUID.randomUUID().toString())
        .customerId(customerId)
        .total(total)
        .build();

    return entityRepository.save(order);
  }

}

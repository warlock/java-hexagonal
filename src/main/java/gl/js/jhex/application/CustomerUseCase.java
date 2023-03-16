package gl.js.jhex.application;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gl.js.jhex.domain.Customer;
import gl.js.jhex.domain.inputport.CustomerInputPort;
import gl.js.jhex.domain.outputport.EntityRepository;

@Component
public class CustomerUseCase implements CustomerInputPort {

  @Autowired
  EntityRepository entityRepository;

  @Override
  public Customer createCustomer(String name, String country) {
    Customer customer = Customer.builder()
        .id(UUID.randomUUID().toString())
        .name(name)
        .country(country)
        .build();

    return entityRepository.save(customer);
  }

  @Override
  public Customer getById(String customerId) {
    return entityRepository.getById(customerId, Customer.class);
  }

  @Override
  public List<Customer> getAll() {
    return entityRepository.getAll(Customer.class);
  }

}
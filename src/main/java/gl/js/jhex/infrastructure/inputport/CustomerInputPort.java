package gl.js.jhex.infrastructure.inputport;

import java.util.List;

import gl.js.jhex.domain.Customer;

public interface CustomerInputPort {

  public Customer createCustomer(String name, String country);

  public Customer getById(String customerId);

  public List<Customer> getAll();

}
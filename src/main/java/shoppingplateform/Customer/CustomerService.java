package shoppingplateform.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    public Optional<Customer> login(String usernameEmail) {
        Optional<Customer> customer = customerRepository.findByUsername(usernameEmail);
        if (customer.isPresent()) {
            return customer;
        } else {
            customer = customerRepository.findByEmail(usernameEmail);
            return customer;
        }
    }

    public boolean register(Customer customer) {
        if (!customerRepository.findByUsername(customer.getUsername()).isPresent()) {
            customerRepository.save(customer);
            return true;
        }
        return false;
    }

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

}

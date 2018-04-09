package shoppingplateform.Customer;



import org.springframework.stereotype.Service;
import shoppingplateform.User.UserService;
import javax.annotation.Resource;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CustomerService extends UserService {

    @Resource
    private CustomerRepository customerRepository;


    public boolean register(Customer customer) {
        if (!customerRepository.findByUsername(customer.getUsername()).isPresent()) {
            Random RANDOM = new SecureRandom();
            byte[] key = new byte[8];
            RANDOM.nextBytes(key);
            String salt = new String(key);
            String originalPass = customer.getPassword();
            String hashedPass = hashPassword(originalPass, salt);
            customer.setPassword(hashedPass);
            customer.setSalt(salt);
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


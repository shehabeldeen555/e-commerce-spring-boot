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

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

}


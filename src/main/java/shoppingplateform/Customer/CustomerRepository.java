package shoppingplateform.Customer;

import org.springframework.data.repository.CrudRepository;
import shoppingplateform.User.UserBaseRepository;

import java.util.Optional;

public interface CustomerRepository extends UserBaseRepository<Customer, Integer> {

}

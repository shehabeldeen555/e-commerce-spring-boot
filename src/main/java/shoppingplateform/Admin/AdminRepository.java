package shoppingplateform.Admin;

import org.springframework.data.repository.CrudRepository;
import shoppingplateform.User.UserBaseRepository;

import java.util.Optional;

public interface AdminRepository extends UserBaseRepository<Admin, Integer> {

}

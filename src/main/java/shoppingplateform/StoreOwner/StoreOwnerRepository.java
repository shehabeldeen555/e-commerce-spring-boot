package shoppingplateform.StoreOwner;

import org.springframework.data.repository.CrudRepository;
import shoppingplateform.User.UserBaseRepository;

import java.util.List;
import java.util.Optional;

public interface StoreOwnerRepository extends UserBaseRepository<StoreOwner, Integer> {

}

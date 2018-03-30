package shoppingplateform.Store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface StoreRepository extends CrudRepository<Store, Integer> {
    public List<Store> findByAdded(boolean added);
    public List<Store> findByStoreOwnerAndAdded(String username,boolean added);

}

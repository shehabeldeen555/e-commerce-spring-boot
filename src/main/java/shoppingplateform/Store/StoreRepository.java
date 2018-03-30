package shoppingplateform.Store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface StoreRepository extends CrudRepository<Store, Integer> {
    public List<Store> findByAdded(boolean added);
}

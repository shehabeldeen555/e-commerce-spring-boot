package shoppingplateform.Store_products;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface Store_productsRepository extends CrudRepository<Store_products, Integer> {
    public List<Store_products> findByStoreID(Integer id);
    public Optional<Store_products> findByStoreIDAndProductID(Integer storeID,Integer productID);
    public void deleteByStoreIDAndProductID(Integer storeID,Integer productID);
}

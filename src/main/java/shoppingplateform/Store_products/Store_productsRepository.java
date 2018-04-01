package shoppingplateform.Store_products;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface Store_productsRepository extends CrudRepository<Store_products, Integer> {
    public List<Integer> findByStoreID(Integer id);
}

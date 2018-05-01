package shoppingplateform.Store_product_history;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StoreProductHistoryRepository extends CrudRepository<StoreProductHistory, Integer> {
    public Optional<StoreProductHistory> findByStoreIDAndProductID(Integer storeID, Integer productID);
}

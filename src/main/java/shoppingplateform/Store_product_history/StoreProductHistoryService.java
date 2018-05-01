package shoppingplateform.Store_product_history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreProductHistoryService {

    @Autowired
    private StoreProductHistoryRepository storeProductHistoryRepository;

    public void add(StoreProductHistory storeProductHistory) {
        storeProductHistoryRepository.save(storeProductHistory);
    }

    public Optional<StoreProductHistory> getProductHistory(Integer storeID, Integer productID) {
        return storeProductHistoryRepository.findByStoreIDAndProductID(storeID, productID);
    }

    public List<StoreProductHistory> getAll(){
        List<StoreProductHistory> productHistory = new ArrayList<>();
        storeProductHistoryRepository.findAll().forEach(productHistory::add);
        return productHistory;
    }

}

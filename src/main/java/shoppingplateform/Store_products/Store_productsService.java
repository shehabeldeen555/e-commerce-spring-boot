package shoppingplateform.Store_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Store_productsService {

    @Autowired
    private Store_productsRepository store_productsRepository;

    public List<Store_products> getAll(Integer id){
        return store_productsRepository.findByStoreID(id);
    }

    public void addProduct(Store_products store_products){
        store_productsRepository.save(store_products);
    }

    public void view(Integer storeID, Integer productID){
        Store_products product=store_productsRepository.findByStoreIDAndProductID(storeID,productID).get();
        product.increaseView();
        store_productsRepository.save(product);
    }

}

package shoppingplateform.Store_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Store_productsService {

    @Autowired
    private Store_productsRepository store_productsRepository;

    public List<Store_products> getAll(Integer id) {
        return store_productsRepository.findByStoreID(id);
    }

    public Optional<Store_products> getProduct(Integer storeID,Integer productID){
        return store_productsRepository.findByStoreIDAndProductID(storeID, productID);
    }

    public void addProduct(Store_products store_products) {
        Optional<Store_products> product = store_productsRepository.findByStoreIDAndProductID(store_products.getStoreID(), store_products.getProductID());
        if (product.isPresent()) {
            product.get().setQuantity(product.get().getQuantity() + store_products.getQuantity());
            store_products = product.get();
        }
        store_productsRepository.save(store_products);
    }

    public void delete(Integer storeID,Integer productID){
        store_productsRepository.deleteByStoreIDAndProductID(storeID, productID);
    }

    public void view(Integer storeID, Integer productID) {
        Store_products product = store_productsRepository.findByStoreIDAndProductID(storeID, productID).get();
        product.increaseView();
        store_productsRepository.save(product);
    }

    public void buy(Integer storeID, Integer productID, Integer quantity, String address) {
        Store_products product = store_productsRepository.findByStoreIDAndProductID(storeID, productID).get();
        if (product.getQuantity() >= quantity) {
            product.increaseSold();
            product.increaseView();
            product.setQuantity(product.getQuantity() - quantity);
            store_productsRepository.save(product);
        }
    }

}

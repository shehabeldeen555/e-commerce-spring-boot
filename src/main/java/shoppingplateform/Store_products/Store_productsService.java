package shoppingplateform.Store_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Store_productsService {

    @Autowired
    private Store_productsRepository store_productsRepository;

    public List<Integer> getAll(Integer id){
        return store_productsRepository.findByStoreID(id);
    }


}

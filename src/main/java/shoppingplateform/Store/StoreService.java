package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public void addStore(Store store){
        storeRepository.save(store);
    }
}

package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public void addStore(Store store){
        storeRepository.save(store);
    }

    public List<Store> getRequests(){
        return storeRepository.findByAdded(false);
    }
}

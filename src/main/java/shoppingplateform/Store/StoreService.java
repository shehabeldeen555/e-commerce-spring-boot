package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingplateform.StoreOwner.StoreOwnerController;
import shoppingplateform.StoreOwner.StoreOwnerService;

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

    public List<Store> getAll(){
        return storeRepository.findByAdded(true);
    }

    public void acceptStore(Integer id){
       Optional<Store> store= storeRepository.findById(id);
       if(store.isPresent()){
          Store store1= store.get();
          store1.setAdded(true);
          storeRepository.save(store1);
       }
    }

    public void deleteStore(Integer id){
        Optional<Store> store= storeRepository.findById(id);
        if(store.isPresent()){
            storeRepository.delete(store.get());
        }
    }

    public List<Store> getStores(String username){
        return storeRepository.findByStoreOwnerAndAdded(username,true);
    }

    public Optional<Store> getStore(Integer storeID){
        return storeRepository.findById(storeID);
    }

}

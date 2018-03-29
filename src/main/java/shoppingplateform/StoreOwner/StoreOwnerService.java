package shoppingplateform.StoreOwner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreOwnerService {

    @Autowired
    private StoreOwnerRepository storeOwnerRepository;

    public boolean login(StoreOwner owner) {
        Optional<StoreOwner> storeOwner=storeOwnerRepository.findByUsername(owner.getUsername());
        if(storeOwner.isPresent()){
            if(storeOwner.get().getPassword().equals(owner.getPassword()))
                return true;
        }else{
            storeOwner=storeOwnerRepository.findByEmail(owner.getUsername());
            if(storeOwner.isPresent()){
                if(storeOwner.get().getPassword().equals(owner.getPassword()))
                    return true;
            }
        }
        return false;
    }

    public boolean register(StoreOwner storeOwner) {
        if(!storeOwnerRepository.findByUsername(storeOwner.getUsername()).isPresent()){
            storeOwnerRepository.save(storeOwner);
            return true;
        }
        return false;
    }

    public List<StoreOwner> getAll(){
        List<StoreOwner> storeOwners=new ArrayList<>();
        storeOwnerRepository.findAll().forEach(storeOwners::add);
        return storeOwners;
    }

}

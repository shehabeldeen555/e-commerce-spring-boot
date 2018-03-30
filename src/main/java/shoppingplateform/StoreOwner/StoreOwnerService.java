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

    public Optional<StoreOwner> login(String usernameEmail) {
        Optional<StoreOwner> storeOwner=storeOwnerRepository.findByUsername(usernameEmail);
        if(storeOwner.isPresent()){
            return storeOwner;
        }else{
            storeOwner=storeOwnerRepository.findByEmail(usernameEmail);
            return  storeOwner;
        }

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

package shoppingplateform.StoreOwner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingplateform.Store.Store;
import shoppingplateform.User.UserService;

import javax.annotation.Resource;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class StoreOwnerService extends UserService {

    @Resource
    private StoreOwnerRepository storeOwnerRepository;

    public List<StoreOwner> getAll(){
        List<StoreOwner> storeOwners=new ArrayList<>();
        storeOwnerRepository.findAll().forEach(storeOwners::add);
        return storeOwners;
    }

}

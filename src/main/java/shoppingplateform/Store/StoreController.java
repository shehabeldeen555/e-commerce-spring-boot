package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "/addStore",method = RequestMethod.POST)
    public void addBrand(@RequestBody Store store){
        storeService.addStore(store);
    }

    @RequestMapping(value = "/getRequests",method = RequestMethod.GET)
    public List<Store> request(){
        return storeService.getRequests();
    }

    @RequestMapping(value = "/acceptStore/{id}",method = RequestMethod.GET)
    public void acceptStore(@PathVariable Integer id){
        storeService.acceptStore(id);
    }

    @RequestMapping(value = "/deleteStore/{id}",method = RequestMethod.DELETE)
    public void deleteStore(@PathVariable Integer id){
        storeService.deleteStore(id);
    }

    @RequestMapping(value = "/getStores/{username}",method = RequestMethod.GET)
    public List<Store> getStores(@PathVariable String username){
        return storeService.getStores(username);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Store> getAll(){
        return storeService.getAll();
    }


}

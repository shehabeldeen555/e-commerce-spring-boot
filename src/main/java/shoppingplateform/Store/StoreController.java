package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "/addStore",method = RequestMethod.POST)
    public void addBrand(@RequestBody Store store){
        storeService.addStore(store);
    }



}

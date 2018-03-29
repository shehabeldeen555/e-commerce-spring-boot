package shoppingplateform.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StoreController {

    @Autowired
    private StoreService storeService;

}

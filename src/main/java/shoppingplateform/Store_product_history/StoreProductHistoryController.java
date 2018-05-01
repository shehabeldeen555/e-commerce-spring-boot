package shoppingplateform.Store_product_history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/StoreProductHistory")
public class StoreProductHistoryController {

    @Autowired
    private StoreProductHistoryService storeProductHistoryService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody StoreProductHistory storeProductHistory) {
        storeProductHistoryService.add(storeProductHistory);
    }

    @RequestMapping(value = "/getProduct/{storeID}/{productID}", method = RequestMethod.GET)
    public Optional<StoreProductHistory> getProductHistory(@PathVariable Integer storeID, @PathVariable Integer productID) {
        return storeProductHistoryService.getProductHistory(storeID, productID);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<StoreProductHistory> getAll(){
        return storeProductHistoryService.getAll();
    }

}

package shoppingplateform.Store_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Store_products")
public class Store_productsController {

    @Autowired
    private Store_productsService store_productsService;

    @RequestMapping(value = "/getAll/{id}", method = RequestMethod.GET)
    public List<Store_products> getAll(@PathVariable Integer id) {
        return store_productsService.getAll(id);
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public void addProduct(@RequestBody Store_products store_products) {
        store_productsService.addProduct(store_products);
    }

    @RequestMapping(value = "/view/{storeID}/{productID}",method = RequestMethod.GET)
    public void view(@PathVariable Integer storeID, @PathVariable Integer productID){
        store_productsService.view(storeID, productID);
    }

    @RequestMapping(value = "/buy/{storeID}/{productID}/{quantity}/{address}",method = RequestMethod.GET)
    public void buy(@PathVariable Integer storeID, @PathVariable Integer productID, @PathVariable Integer quantity,
                    @PathVariable String address){
        store_productsService.buy(storeID, productID, quantity, address);
    }

}

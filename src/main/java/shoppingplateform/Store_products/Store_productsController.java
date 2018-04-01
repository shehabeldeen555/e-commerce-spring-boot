package shoppingplateform.Store_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Store_products")
public class Store_productsController {

    @Autowired
    private Store_productsService store_productsService;

    @RequestMapping(value = "/getAll/{id}",method = RequestMethod.GET)
    public List<Integer> getAll(@PathVariable Integer id){
        return store_productsService.getAll(id);
    }



}

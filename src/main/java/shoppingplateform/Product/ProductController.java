package shoppingplateform.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/Products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productService.getAll();
    }

    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public void view(@PathVariable Integer id){
        productService.view(id);
    }

}

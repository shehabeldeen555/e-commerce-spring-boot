package shoppingplateform.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shoppingplateform.Product.Product;

import java.util.List;

@RestController
@RequestMapping("/api/Brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @RequestMapping(value = "/addBrand",method = RequestMethod.POST)
    public void addBrand(@RequestBody Brand brand){
        brandService.addBrand(brand);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Brand> getAll(){
        return brandService.getAll();
    }

}

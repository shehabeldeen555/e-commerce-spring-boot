package shoppingplateform.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingplateform.Customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> getAll(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public void view(Integer id){
        Product product=productRepository.findById(id).get();
        product.increaseView();
        productRepository.save(product);
    }
}

package shoppingplateform.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public void addBrand(Brand brand){
        brandRepository.save(brand);
    }

    public List<Brand> getAll(){
        List<Brand> brands = new ArrayList<>();
        brandRepository.findAll().forEach(brands::add);
        return brands;
    }

}

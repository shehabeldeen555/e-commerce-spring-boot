package shoppingplateform.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public void addBrand(Brand brand){
        brandRepository.save(brand);
    }

}

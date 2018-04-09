package shoppingplateform.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class AdminService {

    @Resource
    private AdminRepository adminRepository;

}

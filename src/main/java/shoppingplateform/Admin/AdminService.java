package shoppingplateform.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class AdminService {

    @Resource
    private AdminRepository adminRepository;

    public Optional<Admin> login(String usernameEmail) {
        Optional<Admin> admin= adminRepository.findByUsername(usernameEmail);
        if(admin.isPresent()){
            return admin;
        } else {
            admin = adminRepository.findByEmail(usernameEmail);
            return admin;
        }
    }
}

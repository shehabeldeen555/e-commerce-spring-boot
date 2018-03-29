package shoppingplateform.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/login/{usernameEmail}", method = RequestMethod.GET)
    Optional<Customer> login(@PathVariable String usernameEmail) {
        return customerService.login(usernameEmail);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    boolean register(@RequestBody Customer customer) {
        return customerService.register(customer);
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}




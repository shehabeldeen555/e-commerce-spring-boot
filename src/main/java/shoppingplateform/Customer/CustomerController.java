package shoppingplateform.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shoppingplateform.User.User;

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

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}




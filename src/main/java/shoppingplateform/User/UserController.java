package shoppingplateform.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Optional<User> login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    boolean register(@RequestBody User user) {
        return userService.register(user);
    }
}

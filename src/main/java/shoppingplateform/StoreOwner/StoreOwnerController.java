package shoppingplateform.StoreOwner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/StoreOwner")
public class StoreOwnerController {
    @Autowired
    private StoreOwnerService storeOwnerService;

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    void login(@RequestBody StoreOwner storeOwner) {
        storeOwnerService.login(storeOwner);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    void register(@RequestBody StoreOwner storeOwner) {
        storeOwnerService.register(storeOwner);
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<StoreOwner> getAll() {
        return storeOwnerService.getAll();
    }
}

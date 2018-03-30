package shoppingplateform.Admin;

import shoppingplateform.Store.Store;
import shoppingplateform.User.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Admin extends User {


    private ArrayList<Store> storesRequest;
    public Admin() {
    }

    public Admin(String username, String password, String firstname, String lastname, String email) {
        super(username, password, firstname, lastname, email);
        storesRequest =new ArrayList<>();
    }
}

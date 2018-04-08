package shoppingplateform.Admin;

import shoppingplateform.Store.Store;
import shoppingplateform.User.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@DiscriminatorValue(value = "Admin")
public class Admin extends User {


    public Admin() {
    }

    public Admin(String username, String password, String firstname, String lastname, String email) {
        super(username, password, firstname, lastname, email);
    }
}

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

    public Admin(String username, String password, String email, String firstname, String lastname, String salt, String type) {
        super(username, password, email, firstname, lastname, salt, type);
    }

    public Admin(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.salt = user.getSalt();
        this.type = user.getType();
    }
}

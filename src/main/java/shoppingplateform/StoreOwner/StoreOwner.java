package shoppingplateform.StoreOwner;

import shoppingplateform.Store.Store;
import shoppingplateform.User.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "StoreOwner")
public class StoreOwner extends User {

    public StoreOwner(){}

    public StoreOwner(String username, String password, String email, String firstname, String lastname, String salt, String type) {
        super(username, password, email, firstname, lastname, salt, type);
    }

    public StoreOwner(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.salt = user.getSalt();
        this.type = user.getType();
    }
}

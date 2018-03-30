package shoppingplateform.StoreOwner;

import shoppingplateform.Store.Store;
import shoppingplateform.User.User;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="StoreOwner")
public class StoreOwner extends User {

    public StoreOwner(){}

    public StoreOwner(String username, String password, String firstname, String lastname, String email) {
        super(username, password, firstname, lastname, email);
    }


}

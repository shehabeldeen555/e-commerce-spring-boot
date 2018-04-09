package shoppingplateform.Customer;

import shoppingplateform.User.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Customer")
public class Customer extends User {

    public Customer() {
    }

    public Customer(String username, String password, String email, String firstname, String lastname, String salt, String type) {
        super(username, password, email, firstname, lastname, salt, type);
    }
}

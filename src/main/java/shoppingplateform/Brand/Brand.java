package shoppingplateform.Brand;

import shoppingplateform.Product.Product;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Integer id;
    private String name;
    private String company;

    public Brand(){

    }

    public Brand(String name, String company) {
        this.name = name;
        this.company = company;
        //products=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

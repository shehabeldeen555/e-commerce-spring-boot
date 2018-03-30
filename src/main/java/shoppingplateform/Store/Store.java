package shoppingplateform.Store;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Integer id;
    private String name;
    private String location;
    private String type;
    private boolean added = false;

    public Store() {
    }

    public Store(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.added=false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

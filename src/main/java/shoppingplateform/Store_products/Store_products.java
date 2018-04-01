package shoppingplateform.Store_products;

import javax.persistence.Entity;

@Entity
public class Store_products {

    private Integer storeID;
    private Integer productID;

    public Store_products() {
    }

    public Store_products(Integer storeID, Integer productID) {
        this.storeID = storeID;
        this.productID = productID;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }
}

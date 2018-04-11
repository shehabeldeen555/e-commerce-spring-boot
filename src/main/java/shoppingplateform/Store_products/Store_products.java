package shoppingplateform.Store_products;

import javax.persistence.*;

@Entity
@IdClass(MyKey.class)
public class Store_products {

    @Id
    private Integer storeID;
    @Id
    private Integer productID;
    private Integer views;
    private Integer sold;
    private Integer quantity;

    public Store_products() {
        views = 0;
        sold = 0;
        quantity=0;
    }

    public Store_products(Integer storeID, Integer productID, Integer views, Integer sold, Integer quantity) {
        this.storeID = storeID;
        this.productID = productID;
        this.views = views;
        this.sold = sold;
        this.quantity = quantity;
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

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void increaseView(){
        views++;
    }

    public void increaseSold(){
        sold++;
    }
}

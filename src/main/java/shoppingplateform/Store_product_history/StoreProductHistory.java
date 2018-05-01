package shoppingplateform.Store_product_history;

import javax.persistence.*;

@Entity
public class StoreProductHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    private Integer storeID;
    private Integer productID;
    private Integer quantity;
    private String collaborator;

    public StoreProductHistory() {
    }

    public StoreProductHistory(Integer storeID, Integer productID, Integer quantity, String collaborator) {
        this.storeID = storeID;
        this.productID = productID;
        this.quantity = quantity;
        this.collaborator = collaborator;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(String collaborator) {
        this.collaborator = collaborator;
    }
}

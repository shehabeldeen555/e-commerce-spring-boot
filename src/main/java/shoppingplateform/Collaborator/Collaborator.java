package shoppingplateform.Collaborator;

import javax.persistence.*;


@Entity
@IdClass(coll_store.class)
public class Collaborator {
    @Id
    private Integer storeID;
    @Id
    private String collaborator;

    public Collaborator() {
    }

    public Collaborator(Integer storeID, String collaborator) {
        this.storeID = storeID;
        this.collaborator = collaborator;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public String getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(String collaborator) {
        this.collaborator = collaborator;
    }
}

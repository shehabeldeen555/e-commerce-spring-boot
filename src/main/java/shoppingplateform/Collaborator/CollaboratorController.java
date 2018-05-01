package shoppingplateform.Collaborator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Collaborator")
public class CollaboratorController {

    @Autowired
    private CollaboratorService collaboratorService;

    @RequestMapping(value = "/Add/{storeID}/{collaborator}", method = RequestMethod.GET)
    public void addCollaborator(@PathVariable Integer storeID, @PathVariable String collaborator){
        Collaborator collaborator1=new Collaborator(storeID,collaborator);
        collaboratorService.add(collaborator1);
    }

    @RequestMapping(value = "/getStores/{collaborator}", method = RequestMethod.GET)
    public List<Collaborator> getStores(@PathVariable String collaborator){
        return collaboratorService.getStores(collaborator);
    }
}

package shoppingplateform.Collaborator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboratorService {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    public void add(Collaborator collaborator){
        collaboratorRepository.save(collaborator);
    }

    public List<Collaborator> getStores(String collaborator){
        return collaboratorRepository.findByCollaborator(collaborator);
    }
}

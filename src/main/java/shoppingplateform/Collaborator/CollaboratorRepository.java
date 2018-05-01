package shoppingplateform.Collaborator;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
public interface CollaboratorRepository extends CrudRepository<Collaborator, Integer> {

    public List<Collaborator> findByCollaborator(String name);

}

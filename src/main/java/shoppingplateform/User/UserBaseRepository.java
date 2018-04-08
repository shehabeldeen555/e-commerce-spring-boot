package shoppingplateform.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface UserBaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    public Optional<T> findByUsername(String username);
    public Optional<T> findByEmail(String email);

}

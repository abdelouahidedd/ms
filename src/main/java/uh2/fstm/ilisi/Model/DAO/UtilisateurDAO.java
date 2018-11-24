package uh2.fstm.ilisi.Model.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uh2.fstm.ilisi.Model.BO.Utilisateur;

/**
 * Created by AbdoWork on 24/11/2018.
 */
@RepositoryRestResource
public interface UtilisateurDAO extends CrudRepository<Utilisateur, Long> {
}

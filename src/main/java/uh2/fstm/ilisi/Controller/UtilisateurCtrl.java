package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import uh2.fstm.ilisi.Model.BO.Utilisateur;
import uh2.fstm.ilisi.Model.DAO.UtilisateurDAO;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/user")
public class UtilisateurCtrl {
    @Autowired
    private UtilisateurDAO ustilisateurDao;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Utilisateur> getAll()
    {
        return (List<Utilisateur>) ustilisateurDao.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Utilisateur user)
    {
        ustilisateurDao.save(user);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        ustilisateurDao.delete(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody Utilisateur user)
    {
        ustilisateurDao.save(user);
    }

}

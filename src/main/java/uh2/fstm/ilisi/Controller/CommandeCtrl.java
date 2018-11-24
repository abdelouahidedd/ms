package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.Commande;
import uh2.fstm.ilisi.Model.DAO.CommandeDAO;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/cmd")
public class CommandeCtrl {
    @Autowired
    private CommandeDAO commandeDao;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Commande> getAll()
    {
        return (List<Commande>) commandeDao.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Commande cmd)
    {
        commandeDao.save(cmd);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        commandeDao.delete(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody Commande cmd)
    {
        commandeDao.save(cmd);
    }

}

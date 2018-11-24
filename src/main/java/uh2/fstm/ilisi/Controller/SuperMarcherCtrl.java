package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.SuperMarcher;
import uh2.fstm.ilisi.Model.DAO.SuperMarcherDAO;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/marcher")
public class SuperMarcherCtrl {
    @Autowired
    private SuperMarcherDAO SuperMarcherDao;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<SuperMarcher> getAll()
    {
        return (List<SuperMarcher>) SuperMarcherDao.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody SuperMarcher sup)
    {
        SuperMarcherDao.save(sup);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable Long id)
    {
        SuperMarcherDao.delete(id);
    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody SuperMarcher sup)
    {
        SuperMarcherDao.save(sup);
    }

}

package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.Livreur;
import uh2.fstm.ilisi.Model.DAO.LivreurDAO;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/livreur")
public class LivreurCtrl {
    @Autowired
    private LivreurDAO livreurDao;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Livreur> getAll()
    {
        return (List<Livreur>) livreurDao.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Livreur liv)
    {
        livreurDao.save(liv);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        livreurDao.delete(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody Livreur liv)
    {
        livreurDao.save(liv);
    }

}

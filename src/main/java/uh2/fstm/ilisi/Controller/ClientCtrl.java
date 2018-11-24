package uh2.fstm.ilisi.Controller;

/**
 * Created by AbdoWork on 24/11/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uh2.fstm.ilisi.Model.BO.Client;
import uh2.fstm.ilisi.Model.DAO.ClientDAO;

import java.util.List;

/**
 * Created by For work on 08/07/2018.
 */
@RestController
@RequestMapping("/app/client")
public class ClientCtrl {
    @Autowired
    private ClientDAO clientDao;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Client> getAll()
    {
        return (List<Client>) clientDao.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public void create(@RequestBody Client cli)
    {
        clientDao.save(cli);
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        clientDao.delete(id);

    }
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody Client cli)
    {
        clientDao.save(cli);
    }

}

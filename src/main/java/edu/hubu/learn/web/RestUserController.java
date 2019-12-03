package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.hubu.learn.entity.Llz;
import edu.hubu.learn.service.LlzService;

@RestController

@RequestMapping("/rest/llz")
public class RestUserController {
    @Autowired
    private LlzService llzService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Object getById(@PathVariable("id") long id){
        return llzService.getLlz(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object getAll() {
        return llzService.getLlzs();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Object addUser(@RequestBody Llz user) {
        llzService.addUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Object modifyUser(@RequestBody Llz user) {
        llzService.modifyUser(user);
        return user;
    }


    @RequestMapping(value = "/search/{key}", method = RequestMethod.GET)
    public Object searchUser(String key) {
        return llzService.searchLlzs(key);
    }
    
    
}
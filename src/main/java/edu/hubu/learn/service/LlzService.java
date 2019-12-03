package edu.hubu.learn.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.LlzDao;
import edu.hubu.learn.entity.Llz;

@Service
public class LlzService {
    @Autowired
    private LlzDao llzDao;

    public Llz getLlz(Long id){
        return llzDao.findById(id).get();
    }

    public List<Llz> getLlzs(){
        return llzDao.findAll(new Sort(Direction.DESC, "id"));
    }

    public List<Llz> searchLlzs(String keyword) {
        Llz llz = new Llz();
        llz.setLlzname(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("llzname", match->match.contains());
        Example<Llz> example = Example.of(llz, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return llzDao.findAll(example, sort);
    }

    public Llz addUser(Llz user) {
        return llzDao.save(user);
    }

    public void deleteUser(Long id) {
        llzDao.deleteById(id);
    }

    public void modifyUser(Llz user) {
        llzDao.save(user);
    }
}
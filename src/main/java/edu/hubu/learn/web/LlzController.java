package edu.hubu.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.Llz;
import edu.hubu.learn.service.LlzService;

@Controller
@RequestMapping("/llz")
public class LlzController {
    @Autowired
    private LlzService llzService;

    @RequestMapping("/{id}")
    public ModelAndView user(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Llz llz = llzService.getLlz(id);
        mav.addObject("llz", llz);
        mav.setViewName("llz");
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        llzService.deleteUser(id);
        ModelAndView mav = new ModelAndView("redirect:/llz/list");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView users() {
        ModelAndView mav = new ModelAndView();
        List<Llz> llzs = llzService.getLlzs();
        mav.addObject("llzs", llzs);
        mav.setViewName("llzs");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView addUser() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("llz_add");
        return mav;
    }

    @RequestMapping("/do_add")
    public ModelAndView doAddUser(Llz user) { 
        llzService.addUser(user);
        ModelAndView mav = new ModelAndView("redirect:/llz/list");
        return mav;
    }

    @RequestMapping("/modify/{id}")
    public ModelAndView modifyUser(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("llz", llzService.getLlz(id));
        mav.setViewName("llz_modify");
        return mav;
    }

    @RequestMapping("/do_modify")
    public ModelAndView doModifyUser(Llz user) {
        llzService.modifyUser(user);
        ModelAndView mav = new ModelAndView("redirect:/llz/list");
        return mav;
    }

    @RequestMapping("/search")
    public ModelAndView searchUser() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("llz_search");
        return mav;
    }

    @RequestMapping("/do_search")
    public ModelAndView doSearchUser(HttpServletRequest httpRequest) {
        ModelAndView mav = new ModelAndView();
        String keyword = httpRequest.getParameter("keyword");
        List<Llz> users = llzService.searchLlzs(keyword);
        mav.addObject("llzs", users);
        mav.setViewName("llzs");
        return mav;
    }


}
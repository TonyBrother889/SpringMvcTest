package test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import test.entity.User;
import test.service.UserService;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService){

        this.userService=userService;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
    public String submitLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {

        System.out.println("userName"+userName);
        System.out.println("password"+password);



        return "TEST";
    }

}

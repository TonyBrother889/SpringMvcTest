package test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import test.base.BaseResultEntity;
import test.entity.User;
import test.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {

        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
    @ResponseBody
    BaseResultEntity submitLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {

        System.out.println("用户存在：" + userService.hasMatch(userName, password));


        if (userService.hasMatch(userName, password)) {

            User user = userService.getUserInfo(userName, password);

            return new BaseResultEntity<User>().setData(user).setMsg("登录成功").setCode(200).setResult("success");
        } else {

            return new BaseResultEntity<User>().setMsg("登录失败").setCode(201).setResult("fail");
        }
    }

}

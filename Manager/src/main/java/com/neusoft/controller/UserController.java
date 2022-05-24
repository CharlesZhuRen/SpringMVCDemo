package com.neusoft.controller;

import com.neusoft.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

//    @PostMapping("/checkUser")   //use POJO to get information   200 columns
//    public String checkUser(User user, Model model) {
//        Map<String, String> map = new HashMap<>();
//        map.put("username", user.getUname());  //request\session\application\page
//        model.addAttribute("age", user.getAge());
//        model.mergeAttributes(map);
//        System.out.println(user);
//
//        return "pages/main";
//    }

    //    @PostMapping("/checkUser")   //use POJO to get information   200 columns
//    public ModelAndView checkUser(User user) {
//        String viewname = "pages/main";
//        ModelAndView mv =new ModelAndView(viewname);
//        mv.addObject("username2", user.getUname());
//        mv.addObject("age2", user.getAge());
//
//        return mv;
//    }
    @PostMapping("/checkUser")   //use POJO to get information   200 columns
    public String checkUser(User user,Map<String, Object> map) {
        map.put("username", user.getUname());
        map.put("age2", user.getAge());
        map.put("user", user);


        return "pages/main";
    }


    @PostMapping("/checkUser2")   //use @RequestParam to get information
    public String checkUser2(@RequestParam("uname") String username,
                             @RequestParam("password") String password,
                             @RequestParam("age") int age) {
//Integer.valueOf()
        System.out.println(username + "    " + password + "   " + age);

        return "pages/main";
    }

    //localhost:8080/user/checkUser/aaa/123     RESTful style
    @GetMapping("/checkUser3/{uname}/{password}/{age}")   //use @RequestParam to get information
    public String checkUser3(@PathVariable("uname") String username,
                             @PathVariable("password") String password,
                             @PathVariable("age") int age) {
        //Integer.valueOf()
        System.out.println(username + "    " + password + "   " + age);

        return "pages/main";
    }

    @PostMapping("/checkUser4")
    public String checkUser4(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("uname");
        String password = request.getParameter("password");
        String age = request.getParameter("age");

        HttpSession session = request.getSession();
        request.setAttribute("username",username);  //map,.put("username",username)
        request.setAttribute("age2",age);  //map,.put("age2",age)
        session.setAttribute("username",username);
        session.setAttribute("age2",age);

        int iage = Integer.valueOf(age);
        System.out.println(username + "    " + password + "   " + iage);

        if("aa".equals(username)){
//            try{
////                request.getRequestDispatcher("pages/main").forward(request,response);  //user/checkUser
//            }catch (Exception e){
//            }
            return "pages/main";
        }else{
            return "redirect:/pages/fail.jsp";    //pages/fail.jsp
        }
        //by default forward
    }

}

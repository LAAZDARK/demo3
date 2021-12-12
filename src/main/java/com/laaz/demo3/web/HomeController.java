
package com.laaz.demo3.web;

import com.laaz.demo3.mapper.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author laaz
 */
@Controller
@Slf4j
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model) {
        
        var message = "Hola, este ess un mensaje desde un controlador";
        
        var user = new User ();
        user.setName("Luis");
        user.setAge(25);
        user.setEmail("luis@gmail.com");
        user.setStatus(Boolean.TRUE);
        
        model.addAttribute("message", message);
        model.addAttribute("user", user);
        
//        log.warn("ejecutando el controlador Spring MVC");
        return "views/pages/index";
    }
}

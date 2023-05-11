package vn.smarthomeapiadmin.controller.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class HomePageController {

    @GetMapping("/")
    public ModelAndView showHomePage() {
        return new ModelAndView("home-page");
    }
}

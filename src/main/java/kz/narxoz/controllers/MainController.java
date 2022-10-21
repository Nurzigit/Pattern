package kz.narxoz.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String Main(Model model) {
        return "Main";
    }
    @GetMapping("/home")
    public String Home(Model model) {
        model.addAttribute("title", "это главная страница");
        return "Home";
    }
    @GetMapping("/obout")
    public String obout(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "obout";
    }

}
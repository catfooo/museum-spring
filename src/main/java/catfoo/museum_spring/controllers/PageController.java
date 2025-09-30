package catfoo.museum_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/artarctic-gallery")
    public String artarcticGallery() {
        return "artarctic-gallery";
    }
}

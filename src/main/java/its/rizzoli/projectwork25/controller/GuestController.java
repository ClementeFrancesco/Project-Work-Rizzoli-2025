package its.rizzoli.projectwork25.controller;

import its.rizzoli.projectwork25.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private UserRepository userRepository;
}

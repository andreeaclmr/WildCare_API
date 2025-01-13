package com.example.WildCare_API.user.role;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api-endpoint}")
public class RoleControler {

    @GetMapping("")
    public String index() {
        return "Hello from server";
    }

    @GetMapping("/public")
    public String goToPublic() {
        return "Public path";
    }

    @GetMapping("/private")
    public String goToPrivate() {
        return "Private path";
    }
}

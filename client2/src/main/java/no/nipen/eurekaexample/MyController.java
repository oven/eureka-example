package no.nipen.eurekaexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/")
    public String toggle() {
        ClientApplication.up = !ClientApplication.up;
        return "Status is now " + ClientApplication.up;
    }
}

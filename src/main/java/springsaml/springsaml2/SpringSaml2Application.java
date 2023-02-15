package springsaml.springsaml2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSaml2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSaml2Application.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/hello")
    public Object hello(@AuthenticationPrincipal Saml2AuthenticatedPrincipal principall) {

        return principall;
    }

}

package pro.sky.Spring__2_3__and__2_4__and__2_12_Test.Authorization2_4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;}


    @GetMapping
    public String verification(@RequestParam("login") String login, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword ) {

        return authorizationService.verification(login, password, confirmPassword);

    }

}


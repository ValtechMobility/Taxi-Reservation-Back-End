package meetingpoint.backend.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/user/")
public class UserController {

    @GetMapping
    public String helloUser() {
        return "Hello User!";
    }
}
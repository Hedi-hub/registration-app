package registrationForm.initialData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import registrationForm.models.User;
import registrationForm.services.UserService;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    UserService userService;

    @PostConstruct
    public void initializedInfo(){

        User user1 = new User("mail@ansgar.com", "Ansgar", "Bittermann","1234567890");

        userService.saveUserNamePass(user1);
    }
}

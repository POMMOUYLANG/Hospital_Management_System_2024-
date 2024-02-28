package Small_Project.Hospital.Management.System.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AdminController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hello World";
    }
    
}

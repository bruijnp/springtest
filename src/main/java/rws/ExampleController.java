package rws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @Autowired
    public Greeter greeter;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return greeter.greet();
    }

}

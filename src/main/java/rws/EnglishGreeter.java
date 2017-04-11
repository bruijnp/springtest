package rws;

import org.springframework.stereotype.Service;


@Service
public class EnglishGreeter implements Greeter {

    public String greet() {
        return "Hello!";
    }
}

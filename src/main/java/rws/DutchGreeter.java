package rws;

import org.springframework.stereotype.Service;


@Service
public class DutchGreeter implements Greeter {

    public String greet() {
        return "Hallo!";
    }
}

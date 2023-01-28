package exercise13;

import org.springframework.stereotype.Component;

@Component("divider")
public class Divider implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a / b;
    }
}

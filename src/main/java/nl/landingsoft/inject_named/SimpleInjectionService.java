package nl.landingsoft.inject_named;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimpleInjectionService {

    public String sayHello(String name) {
        return "Hi " + name;
    }
}

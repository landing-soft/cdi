package nl.landingsoft.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.landingsoft.inject_named.SimpleInjectionService;

@Path("/hello")
public class HelloResource {

    @Inject
    private SimpleInjectionService simpleInjectionService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return simpleInjectionService.sayHello("Jamie");
    }
}

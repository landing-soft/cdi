package nl.landingsoft.resources;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.landingsoft.interfaces.PaymentService;

@Path("payment")
public class PaymentResource {

    @Inject
    @Named("paypal")
    private PaymentService paymentService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String processPayment() {
        return paymentService.processPayment();
    }
}

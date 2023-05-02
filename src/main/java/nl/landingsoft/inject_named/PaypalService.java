package nl.landingsoft.inject_named;

import jakarta.inject.Named;
import nl.landingsoft.interfaces.PaymentService;

@Named("paypal")
public class PaypalService implements PaymentService {

    public String processPayment() {
        return "Processing payment with paypal";
    }
}

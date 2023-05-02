package nl.landingsoft.inject_named;

import jakarta.inject.Named;
import nl.landingsoft.interfaces.PaymentService;

@Named("creditcard")
public class CreditCardService implements PaymentService {

    public String processPayment() {
        return "Processing payment with creditcard";
    }
}

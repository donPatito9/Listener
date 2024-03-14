package cl.iplacex.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import cl.iplacex.models.Company;

@Component
public class JmsSubscriber {


    @JmsListener(destination = "eva002")
    public void receive(Company msg) {
        System.out.println("Received Message: " + msg);
}
}
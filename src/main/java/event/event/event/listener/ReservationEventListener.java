package event.event.event.listener;

import event.event.event.ReservationCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {


    @EventListener
    public void onReservationCreated(ReservationCreatedEvent event)throws InterruptedException {
        Thread.sleep(5000L);
        System.out.println("Reservation created: " + event.getSource().toString());

    }
}

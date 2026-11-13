package org.jecrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RegistrationDetails {

    @Value("${registration.enabled}")
    private boolean enabled;

    @Value("${registration.max-participants}")
    private int maxParticipants;

    @Value("${registration.fee}")
    private double fee;

    @Value("${registration.discount}")
    private int discount;

    @Value("${registration.last-date}")
    private String lastDate;

    public boolean isEnabled() {
        return enabled;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public double getFee() {
        return fee;
    }

    public int getDiscount() {
        return discount;
    }

    public void display() {
        System.out.println("Registration Status: "
                + (enabled ? "Open" : "Closed"));
        System.out.println("Maximum Participants: " + maxParticipants);
        System.out.println("Registration Fee: Rs. " + fee);
        System.out.println("Early Bird Discount: " + discount + "%");
        System.out.println("Last Registration Date: " + lastDate);
    }
}

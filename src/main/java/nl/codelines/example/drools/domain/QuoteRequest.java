package nl.codelines.example.drools.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 Requests a quote for one or more training sessions on a certain subject.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuoteRequest {
    private String subject;
    private int days;
    private int hoursPerDay;
    private int trainees;
}

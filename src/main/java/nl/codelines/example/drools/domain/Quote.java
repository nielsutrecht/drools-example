package nl.codelines.example.drools.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quote {
    private String name;
    private int costPerDay;
    private BigDecimal price;
    private BigDecimal vat;
}

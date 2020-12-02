package nl.codelines.example.drools;

import nl.codelines.example.drools.domain.Quote;
import nl.codelines.example.drools.domain.QuoteRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    private final QuoteService service;

    public QuoteController(QuoteService service) {
        this.service = service;
    }


    @PostMapping
    public Quote create(@RequestBody QuoteRequest request) {
        return service.getQuote(request);
    }
}

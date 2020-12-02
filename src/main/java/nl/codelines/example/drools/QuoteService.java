package nl.codelines.example.drools;

import nl.codelines.example.drools.domain.Quote;
import nl.codelines.example.drools.domain.QuoteRequest;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class QuoteService {

    private final KieContainer kieContainer;

    public QuoteService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Quote getQuote(QuoteRequest request) {
        KieSession kieSession = kieContainer.newKieSession();

        var quote = new Quote();
        kieSession.insert(request);
        kieSession.setGlobal("quote", quote);

        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println(quote);

        return quote;
    }

    @PostConstruct
    public void test() {
        var request = new QuoteRequest("spring", 1, 4, 10);

        getQuote(request);
    }


}

package bookstore.bookstoreapi_12.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomMetrics {
    private final MeterRegistry meterRegistry;

    public CustomMetrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.meterRegistry.counter("custom.metric.book_calls", "type", "book").increment();
    }

    public void trackBookCall() {
        this.meterRegistry.counter("custom.metric.book_calls", "type", "book").increment();
    }
}

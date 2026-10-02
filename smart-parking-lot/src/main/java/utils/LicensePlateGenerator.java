package utils;

import java.util.concurrent.atomic.AtomicInteger;

public class LicensePlateGenerator {
    public static final LicensePlateGenerator INSTANCE = new LicensePlateGenerator();
    private final AtomicInteger counter = new AtomicInteger(1000);

    private LicensePlateGenerator() {}

    public static LicensePlateGenerator getInstance() {
        return INSTANCE;
    }

    public String nextLicensePlate() {
        return "MH-12-YZ" + counter.getAndIncrement();
    }
}

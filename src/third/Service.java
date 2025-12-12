package third;

public class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;
    private int hours;

    public Service(String serviceName, double hourlyRate, int hours) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    @Override
    public String toString() {
        return serviceName + " - " + getPrice() + " руб.";
    }
}
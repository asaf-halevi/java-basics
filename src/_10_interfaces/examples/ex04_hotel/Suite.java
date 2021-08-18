package _10_interfaces.examples.ex04_hotel;

import java.time.LocalDateTime;
import java.util.Date;

public class Suite extends Room implements IExecutiveServices, IBusinessServices {
    private final boolean isInfinityPool;
    private double suiteServices;

    public Suite(String type, int size, int location, double price) {
        super(type, size, location, price);
        this.isInfinityPool = false;
        this.suiteServices = 0;
    }

    public double getSuiteServices() {
        return suiteServices;
    }

    public void setSuiteServices(double suiteServices) {
        this.suiteServices = suiteServices;
    }

    public boolean isInfinityPool() {
        return isInfinityPool;
    }

    @Override
    public void privateChefService(LocalDateTime dateTime) {
        suiteServices += getPrice() * 0.2;
    }

    @Override
    public void privateFitnessInstructor(Date startTime, Date endTime) {
        double diff = (endTime.getTime() - startTime.getTime()) / MILLISECONDS_IN_HOUR;
        suiteServices += getPrice() * 0.12 * diff;
    }

    @Override
    public void orderConferenceRoom(Date startDate, Date endDate) {
        double diff = (endDate.getTime() - startDate.getTime()) / MILLISECONDS_IN_HOUR;
        suiteServices += getPrice() * 0.15 * diff;
    }

    @Override
    public void orderMeetingRoom(Date startDate, Date endDate) {
        double diff = (endDate.getTime() - startDate.getTime()) / MILLISECONDS_IN_HOUR;
        suiteServices += getPrice() * 0.14 * diff;
    }

    @Override
    public void faxServices() {
        suiteServices += getPrice() / 100;
    }

    @Override
    public void secretarialServices(int numOfDays) {
        suiteServices += (getPrice() / 13) * numOfDays;
    }

    @Override
    public double perNightPrice() {
        return (getPrice() + suiteServices) * getVAT();
    }

    @Override
    public double accommodationPeriodPrice(int days) {
        return (days * getPrice() + suiteServices) * getVAT();
    }

    @Override
    public String toString() {
        return "Suite{" +
                "VAT=" + VAT +
                ", isInfinityPool=" + isInfinityPool +
                ", suiteServices=" + suiteServices +
                '}' + " " + super.toString();
    }
}

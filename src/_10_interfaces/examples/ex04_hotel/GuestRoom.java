package _10_interfaces.examples.ex04_hotel;

import java.util.Date;

public class GuestRoom extends Room implements IBusinessServices {
    private double guestRoomServices;

    public GuestRoom(String type, int size, int location, double price) {
        super(type, size, location, price);
        this.guestRoomServices = 0;
    }

    public double getGuestRoomServices() {
        return guestRoomServices;
    }

    public void setGuestRoomServices(double guestRoomServices) {
        this.guestRoomServices = guestRoomServices;
    }

    @Override
    public void orderConferenceRoom(Date startDate, Date endDate) {
        double diff = (endDate.getTime() - startDate.getTime()) / MILLISECONDS_IN_HOUR;
        guestRoomServices += ((getPrice() * 15) / 100) * diff;
    }

    @Override
    public void orderMeetingRoom(Date startDate, Date endDate) {
        double diff = (endDate.getTime() - startDate.getTime()) / MILLISECONDS_IN_HOUR;
        guestRoomServices += ((getPrice() * 12) / 100) * diff;
    }

    @Override
    public void faxServices() {
        guestRoomServices += getPrice() / 100;
    }

    @Override
    public void secretarialServices(int numOfDays) {
        guestRoomServices += (getPrice() / 10) * numOfDays;
    }

    @Override
    public double perNightPrice() {
        return (getPrice() + guestRoomServices) * getVAT();
    }

    @Override
    public double accommodationPeriodPrice(int days) {
        return (days * getPrice() + guestRoomServices) * getVAT();
    }

    @Override
    public String toString() {
        return "GuestRoom{" +
                "guestRoomServices=" + guestRoomServices +
                ", VAT=" + VAT +
                '}' + " " + super.toString();
    }
}

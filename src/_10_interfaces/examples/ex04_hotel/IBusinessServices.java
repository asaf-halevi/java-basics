package _10_interfaces.examples.ex04_hotel;

import java.util.Date;

public interface IBusinessServices {

    void orderConferenceRoom(Date startDate, Date endDate);

    void orderMeetingRoom(Date startDate, Date endDate);

    void faxServices();

    void secretarialServices(int numOfDays);

}

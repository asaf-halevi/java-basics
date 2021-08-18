package _10_interfaces.examples.ex04_hotel;

import java.time.LocalDateTime;
import java.util.Date;

public interface IExecutiveServices {

    void privateChefService(LocalDateTime dateTime);

    void privateFitnessInstructor(Date startTime, Date endTime);

}

package net.orangecloud.api.restController;

import net.orangepeels.common.constants.WeekDaysConstants;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final WeekDaysConstants weekDaysConstants;

    public TestController() {
        this.weekDaysConstants = new WeekDaysConstants();
    }

    @RequestMapping("/getweekdaycode/{weekdayname}/{whatCode}")
    public Integer getWeekDayCode(@PathVariable("weekdayname") String weekdayname, @PathVariable("whatCode") String whatCode){
        System.err.println("weekDayName: " + weekdayname);
        System.err.println("whatCode: " + whatCode);
        return weekDaysConstants.SATURDAY;
    }
}

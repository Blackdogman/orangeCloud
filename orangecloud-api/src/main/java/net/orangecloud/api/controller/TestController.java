package net.orangecloud.api.controller;

import net.orangecloud.common.constants.WeekDaysConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final WeekDaysConstants weekDaysConstants;

    @Autowired
    public TestController(WeekDaysConstants weekDaysConstants) {
        this.weekDaysConstants = weekDaysConstants;
    }

    @GetMapping("/getweekdaycode/{weekdayname}/{whatCode}")
    public Integer getWeekDayCode(@PathVariable("weekdayname") String weekdayname, @PathVariable("whatCode") String whatCode){
        System.err.println("weekDayName: " + weekdayname);
        System.err.println("whatCode: " + whatCode);
        System.err.println("weekDaysConstants.SUNDAY: " + weekDaysConstants.SUNDAY);
        return weekDaysConstants.SATURDAY;
    }
}

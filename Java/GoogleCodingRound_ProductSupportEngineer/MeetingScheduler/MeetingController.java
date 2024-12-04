package MeetingScheduler;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("all")
public class MeetingController {

    HashMap allSchedules = new HashMap<String, ArrayList<ScheduleDetail>>();

    HashMap MeetingCalculator() {
        setScheduleAndName();

        return allSchedules;
    }

    // @SuppressWarnings("unchecked")
    void setScheduleAndName() {

        ArrayList busyHours = new ArrayList<ScheduleDetail>(2);
        ArrayList schedule = new ArrayList<>();

        // Kartik
        NameDetail nameDetail = new NameDetail();
        nameDetail.setName("Kartik");
        int ost = 8;
        int oet = 17;
        ScheduleDetail scheduleDetail = new ScheduleDetail();
        scheduleDetail.setStartTime(ost);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(8);
        scheduleDetail.setEndTime(9);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(10);
        scheduleDetail.setEndTime(13);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(14);
        scheduleDetail.setEndTime(17);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(0);
        scheduleDetail.setEndTime(oet);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        allSchedules.put(nameDetail.getName().toString(), schedule);

        // JANU
        schedule = new ArrayList<>();

        nameDetail.setName("Janu");
        ost = 11;
        oet = 19;

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(ost);
        scheduleDetail.setEndTime(0);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(11);
        scheduleDetail.setEndTime(13);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(16);
        scheduleDetail.setEndTime(17);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(17);
        scheduleDetail.setEndTime(18);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        busyHours = new ArrayList<ScheduleDetail>(2);
        scheduleDetail.setStartTime(0);
        scheduleDetail.setEndTime(oet);
        busyHours.add(scheduleDetail.getStartTime());
        busyHours.add(scheduleDetail.getEndTime());
        schedule.add(busyHours);

        allSchedules.put(nameDetail.getName().toString(), schedule);

    }

}

class NameDetail {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}

class ScheduleDetail {

    int startTime = 0;
    int endTime = 0;

    void setStartTime(int time) {
        this.startTime = time;
    }

    void setEndTime(int time) {
        this.endTime = time;
    }

    int getStartTime() {
        return startTime;
    }

    int getEndTime() {
        return endTime;
    }

}

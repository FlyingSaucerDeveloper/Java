package MeetingScheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
class objectsInJava {

    public static void main(String[] args) {
        MeetingController controller = new MeetingController();
        HashMap allSchedules = controller.MeetingCalculator();

        printAllSchedules(allSchedules);

    }

   static void printAllSchedules(HashMap allSchedules){
    HashMap<String, ArrayList<ScheduleDetail>> allData =  allSchedules;

    for (Map.Entry<String, ArrayList<ScheduleDetail>> schedules : allData.entrySet())
                System.out.println("Name : "+schedules.getKey()+" and schedule : "+schedules.getValue());
    }

}

// Add the logic to find the available slots. 
package sit707_week10;

public class OnTrack {
    public static String getTaskStatus(String taskId) {
        switch (taskId) {
            case "task1":
                return "Not Started";
            case "task2":
                return "Working On It";
            case "task3":
                return "Need Help";
            case "task4":
                return "Ready for Feedback";
            default:
                return "Not Started";
        }
    }
}
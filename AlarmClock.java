public class AlarmClock {
    public static void main(String[] args) {

        System.out.println(alarmClock(0,false));
    }
    public static String alarmClock(int day, boolean vacation) {

        if(day > 0 && day < 6){
            if(vacation) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if(vacation) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

}

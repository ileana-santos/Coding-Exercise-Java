/* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and 
on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off". */

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

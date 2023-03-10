public class CaughtSpeed {
    
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(55, false));
    }
    
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int noticket = 0;
        int smallticket = 1;
        int bigticket = 2;

        if (!isBirthday && speed > 60 && speed <= 80 || isBirthday && speed > 65 && speed <= 85) {
            return smallticket;
        } else if (!isBirthday && speed > 80 || isBirthday && speed > 85) {
            return bigticket;
        }

        return noticket;
    }
}

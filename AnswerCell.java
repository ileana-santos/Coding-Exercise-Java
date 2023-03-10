/* Your cell phone rings. Return true if you should answer it. Normally you answer, 
except in the morning you only answer if it is your mom calling. In all cases, 
if you are asleep, you do not answer. */

public class AnswerCell {
    
    public static void main(String[] args) {
        System.out.println(answerCell(false,false,false));
    }
    
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (!isMorning && isMom && !isAsleep) {
            return true;
        } else if (isMorning && isMom && !isAsleep) {
            return true;
        } else return !isMorning && !isMom && !isAsleep;
    }
}

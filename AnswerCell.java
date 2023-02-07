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

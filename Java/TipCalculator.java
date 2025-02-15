public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        // tip tap
        double tip = 0d;

        if (rating.equalsIgnoreCase("terrible")) {
            tip = (amount * 0) / 100;
        } else if (rating.equalsIgnoreCase("poor")) {
            tip = (amount * 5) / 100;
        } else if (rating.equalsIgnoreCase("good")) {
            tip = (amount * 10) / 100;
        } else if (rating.equalsIgnoreCase("great")) {
            tip = (amount * 15) / 100;
        } else if (rating.equalsIgnoreCase("excellent")) {
            tip = (amount * 20) / 100;
        } else {
            return null;
        }
        int roundNumber = (int) Math.ceil(tip);
        return roundNumber;
    }
}
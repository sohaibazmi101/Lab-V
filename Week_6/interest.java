package Week_6;

public class interest {
    public static void main(String args[]) {
        double initialInvestment = 100;
        double targetValue = 1000;
        double dailyIncreaseRate = 0.05; // 5% increase
        int days = 0;
        double currentValue = initialInvestment;

        while (currentValue < targetValue) {
            currentValue += currentValue * dailyIncreaseRate;
            days++;
        }

        System.out.println("It will take " + days + " days to reach the target value.");
    }
}

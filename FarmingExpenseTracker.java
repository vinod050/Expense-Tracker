import java.util.Scanner;

public class FarmingExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cropsAndVegetables = {
            "Paddy", "Tomatoes", "Carrots"
        };

        double[] expenses = new double[cropsAndVegetables.length];
        double[] incomes = new double[cropsAndVegetables.length];
        double totalExpense = 0;
        double totalIncome = 0;
        double totalProfit = 0;

        System.out.println("Welcome to Venu Chowdhary's Land!");

        for (int i = 0; i < cropsAndVegetables.length; i++) {
            System.out.print("Enter the expense for " + cropsAndVegetables[i] + " (in INR): ");
            expenses[i] = scanner.nextDouble();
            totalExpense += expenses[i];

            System.out.print("Enter the income for " + cropsAndVegetables[i] + " (in INR): ");
            incomes[i] = scanner.nextDouble();
            totalIncome += incomes[i];

            double profit = incomes[i] - expenses[i];
            totalProfit += profit;

            System.out.println(cropsAndVegetables[i] + " - Profit: ₹" + profit);
        }

        System.out.println("\nHere is the breakdown of the expenses and incomes:");
        for (int i = 0; i < cropsAndVegetables.length; i++) {
            System.out.println(cropsAndVegetables[i] + ": Expense: ₹" + expenses[i] + ", Income: ₹" + incomes[i]);
        }

        System.out.println("\nTotal expense for farming: ₹" + totalExpense);
        System.out.println("Total income from farming: ₹" + totalIncome);
        System.out.println("Total profit from farming: ₹" + totalProfit);

        scanner.close();
    }
}

import javax.swing.*;

public class SalaryDialog {

    public static void main(String[] args){

        String wageString;
        String dependentString;
        int depedents;
        double wage;
        double weaklyPay;
        final double HOURS_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage",
                "Salary Dialog1", JOptionPane.INFORMATION_MESSAGE);
        weaklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentString = JOptionPane.showInputDialog(null, "How many dependents?",
                "Salary Dialog2", JOptionPane.QUESTION_MESSAGE);
        depedents = Integer.parseInt(dependentString);

        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
                weaklyPay + "\nDeductions will be made for " + depedents + " dependents.");

        selection = JOptionPane.showConfirmDialog(null, "Is your salary correct?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You responded " + isYes);


    }
}

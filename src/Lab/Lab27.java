/* NOTES 4/5/2021
 *
 * Agenda: store data in arrays so that it is availabe after we fall out of
   the while loop

Lets come back to this program to review 2 concepts:
1. count being used as index
2. parallel arrays
 */

/**
 * Employee Payroll: employer has hired some employees to work by
 * the hour. This program should: for each employee: 1. read in id number, hours
 * and pay per hour 2. calculate pay for the week 3. subtract taxes (pay < $500 tax is 10%, and pay
 * >= $500 tax is 13%) 4. print gross pay and net pay
 */
package Lab;
import java.util.Scanner;

/* plan: lets write for 1 employee and then "wrap" it in a while loop
 */

public class Lab27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare ARRAYS (this is new 4/5/2021)
        final int SIZE = 100;
        int[] idnums = new int[SIZE];
        double[] hoursArray = new double[SIZE];
        double[] payRates = new double[SIZE];
        double[] grossPay = new double[SIZE], netPays = new double[SIZE];
        int count=0; // count will be use both as count and as index into the arrays
        double totalSalary = 0.0; // initial sum outside of loop

        int employeeCount = readArrays(idnums,hoursArray,payRates,scanner);
        for (int i = 0; i < employeeCount; i++) {
            // 2. calculate pay for the week
            grossPay[count] = hoursArray[count] * payRates[count];

            totalSalary = totalSalary + grossPay[count];

            // 3. subtract taxes
            // if an employee has a dependant, no taxes are necessary
            // (pay < $500 tax is 10%, and pay >= $500 tax is 13%)
            double taxes;
            int dependents;
            boolean hasDependents;
            System.out.println("How many dependents does the employee have? ");
            dependents = scanner.nextInt();
            // figure out whether employee has a dependent
            if (dependents >= 1) {
                hasDependents = true;
            } else {
                hasDependents = false;
            }
            System.out.println("hasDependents: " + hasDependents);

            if (hasDependents) {
                taxes = 0.0;
            } else { // NESTED IF -- if stmt inside of an if stmt
                if (grossPay[count] < 500) {
                    taxes = .1 * grossPay[count];
                } else {
                    taxes = .13 * grossPay[count];
                }
            }
            netPays[count] = grossPay[count] - taxes;
            // 4. print gross pay and net pay
        }
        System.out.println("Gross Pay:  " + grossPay[count] + " Net Pay: " + netPays[count]);
        count++;
        // structured read loop, get data for next round of while loop
        System.out.println("Enter idnum, -1 to finish: ");
        idnums[count] = scanner.nextInt();

        System.out.println("The number of employees processed is: " + employeeCount);
        System.out.println("The total to pay out in salaries for this week is: " + totalSalary);
    }

    /**
     *
     * @param idnums stores the id number of every employee
     * @param hoursArray stores the hours worked by every employee
     * @param payRates stores payRates of all employees
     * @param scanner reads in all the values and stores them into their respective arrays
     * @return employees counted
     */
    public static int readArrays(int[] idnums,double[] hoursArray,double[] payRates, Scanner scanner) {
        int count = 0; // count will be use both as count and as index into the arrays
        // structured read loop, read first data elt outside while loop
        System.out.println("Enter idnum, -1 to finish: ");
        idnums[0] = scanner.nextInt();
        while (idnums[count] != -1) {
            // 1. read in hours and pay per hour

            System.out.println("Enter hours and pay rate for next employee: ");
            // come back and put in employee 1, 2, 3
            hoursArray[count] = scanner.nextDouble();
            payRates[count] = scanner.nextDouble();
            System.out.println("You entered " + hoursArray[count] + " hours and "
                    + payRates[count] + " rate.");
            count ++;
            System.out.println("Enter idnum, -1 to finish: ");
            idnums[count] = scanner.nextInt();
        }
        return count;
    }
}


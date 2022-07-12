package employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public static List<EmployeePayrollData> employeePayrollData;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollData) {
        this.employeePayrollData = employeePayrollData;
    }

    public static void main(String[] args)  {
        employeePayrollData = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollData);
        Scanner consoleinputreader = new Scanner(System.in);
        FileHandler fileHandler=new FileHandler();

        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("choose the option\n 1 read 2 write 3 write1 4read");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    employeePayrollService.read(consoleinputreader);
                case 2:
                    employeePayrollService.write();
                case 3:
                   fileHandler.readFromFile();
                case 4:
                    fileHandler.writeintofile();

            }
        }

    }

    public static void read(Scanner consoleinputreader) {
        System.out.println("Enter the id:");
        int id = consoleinputreader.nextInt();
        System.out.println("Enter the name");
        String name = consoleinputreader.next();
        System.out.println("enter the salary:");
        long salary = consoleinputreader.nextLong();
        employeePayrollData.add(new EmployeePayrollData(name,id,salary));

    }

    public static void write() {
        System.out.println("writing" + employeePayrollData);
    }

}

package employeepayroll;

import java.io.*;

public class FileHandler {


    public void readFromFile() {
        File file = new File("src/main/Employee.txt");
        try {
            FileReader f = new FileReader(file);
            int i;
            while ((i = f.read()) != -1)
                System.out.print((char) i);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeintofile() {
        try {
            File file = new File("src/main/Employee.txt");
            FileWriter f = new FileWriter(file);
            f.append(EmployeePayrollService.employeePayrollData.toString());
////			f.write(AddressBookService.listOfContacts.toString());
            f.close();
        } catch (Exception e) {

        }


    }
}
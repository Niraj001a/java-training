package csvFileHandling;

import java.io.*;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;
 
public class CustomerCSVFileHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        while (true) {

            System.out.println("\nMenu:");

            System.out.println("1. Insert data into CSV file");

            System.out.println("2. Read data from CSV file");

            System.out.println("3. Update data in CSV file");

            System.out.println("4. Sort data");

            System.out.println("5. Exit");
 
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
 
            switch (choice) {

                case 1:

                    insertData();

                    break;

                case 2:

                    readData();

                    break;

                case 3:

                    updateData();

                    break;

                case 4:

                    System.out.println("Sort Order:");

                    System.out.println("1. Ascending");

                    System.out.println("2. Descending");

                    System.out.print("Enter the sort order (1 or 2): ");

                    int sortOrder = scanner.nextInt();

                    sortData(sortOrder);

                    break;

                case 5:

                    System.exit(0);
                    System.out.println(".........Exit successfull..........");

                    break;

                default:

                    System.out.println("Invalid choice. Please enter a valid option.");

                    break;

            }

        }

    }
 
    public static void insertData() {

        try {

            FileWriter writer = new FileWriter("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv", true);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            PrintWriter printWriter = new PrintWriter(bufferedWriter);
 
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter customer ID: ");

            int customerID = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.print("Enter customer name: ");

            String customerName = scanner.nextLine();

            System.out.print("Enter customer department: ");

            String customerDepartment = scanner.nextLine();

            System.out.print("Enter customer salary: ");

            double customerSalary = scanner.nextDouble();
 
            printWriter.println(customerID + "," + customerName + "," + customerDepartment + "," + customerSalary);

            printWriter.close();
 
            System.out.println("Data inserted successfully.");

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());

        }

    }
 
    public static void readData() {

        try {

            FileReader fileReader = new FileReader("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length >= 4) {

                    System.out.println("ID: " + data[0]);

                    System.out.println("Name: " + data[1]);

                    System.out.println("Department: " + data[2]);

                    System.out.println("Salary: " + data[3]);

                    System.out.println();

                }

            }

            bufferedReader.close();

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());

        }

    }
 
    public static void updateData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer ID to update data: ");

        int customerIDToUpdate = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter the new name: ");

        String newName = scanner.nextLine();

        System.out.print("Enter the new department: ");

        String newDepartment = scanner.nextLine();

        System.out.print("Enter the new salary: ");

        double newSalary = scanner.nextDouble();
 
        List<String> updatedData = new ArrayList<>();
 
        try {

            FileReader fileReader = new FileReader("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length >= 4 && Integer.parseInt(data[0]) == customerIDToUpdate) {

                    data[1] = newName;

                    data[2] = newDepartment;

                    data[3] = String.valueOf(newSalary);

                }

                updatedData.add(String.join(",", data));

            }

            bufferedReader.close();
 
            FileWriter writer = new FileWriter("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv", false);

            for (String updatedLine : updatedData) {

                writer.write(updatedLine + "\n");

            }

            writer.close();
 
            System.out.println("Data updated successfully.");

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());

        }

    }
 
    public static void sortData(int order) {

        List<String> data = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length >= 4) {

                    data.add(line);

                }

            }

            bufferedReader.close();
 
            // Remove header

            if (!data.isEmpty()) {

                data.remove(0);

            }
 
            if (order == 1) {

                Collections.sort(data);

            } else if (order == 2) {

                Collections.sort(data, Collections.reverseOrder());

            }
 
            FileWriter writer = new FileWriter("C:\\Users\\nirajku\\eclipse-workspace\\javaBasics\\day2\\CSVFileHandlingTest\\csvfile.csv", false);

            writer.write("ID,Name,Department,Salary\n");

            for (String sortedLine : data) {

                writer.write(sortedLine + "\n");

            }

            writer.close();
 
            System.out.println("Data sorted successfully.");

        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());

        }

    }

}


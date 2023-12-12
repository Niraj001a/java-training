package projectDataGeneration;


import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomersData {
    public static void main(String[] args) {
        String url = "jdbc:your_database_url";
        String username = "your_username";
        String password = "your_password";
        int numberOfRecords = 10; // Number of random records to generate

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Faker faker = new Faker();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String insertDataSQL = "INSERT INTO customers (login, passhash, name, phone, email, registrationdate) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement insertStatement = connection.prepareStatement(insertDataSQL)) {
                for (int i = 0; i < numberOfRecords; i++) {
                    insertStatement.setString(1, faker.name().username());
                    insertStatement.setLong(2, faker.number().randomNumber());
                    insertStatement.setString(3, faker.name().fullName());
                    insertStatement.setString(4, faker.phoneNumber().cellPhone());
                    insertStatement.setString(5, faker.internet().emailAddress());
                    insertStatement.setDate(6, java.sql.Date.valueOf(sdf.format(faker.date().birthday())));
                    insertStatement.executeUpdate();
                }
            }

            System.out.println(numberOfRecords + " random records inserted into the customers table.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

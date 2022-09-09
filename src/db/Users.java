package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "MySQL2022";

        Scanner scanner = new Scanner(System.in);
        //will allow to pass
        char again = 'y';



        try (Connection conn = DriverManager.getConnection(dbURL,username,password)){
            System.out.println("Connected to database");

            //calling method itself
            //readData(conn);
            //insertData(conn, "karina", "qwerty", "Karina Kragele", "karina.k@gmail.com"); //it works, that is why are deleting now

            while(again == 'y'){
                System.out.println("Choose one option (r, i, d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");
                //new variable type character
                char action = scanner.nextLine().charAt(0);

                if(action == 'i'){

                    //scanner.nextLine();
                    System.out.println("Enter username");
                    //want to read and some in some kind of variable
                    String newUsername = scanner.nextLine();

                    System.out.println("Enter password");
                    String newpassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter email");
                    String newEmail = scanner.nextLine();

                    //call appropriate method for inserting data
                    insertData(conn, newUsername, newpassword, newFullName, newEmail);

                }else if(action == 'r'){ //to read the data
                    readData(conn);
                }else if(action == 'd'){
                    System.out.println("Enter username that you want to delete");
                    String deleteUser = scanner.nextLine();

                    deleteData(conn, deleteUser);
                }
                System.out.println("Do you want to do something more? y/n");
                //need to read in the variable, we already have it, will use it again
                again = scanner.nextLine().charAt(0);


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void readData (Connection conn) throws SQLException {
        String sql = "SELECT * FROM users"; //users - our table name in our database
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while(resultSet.next()){
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname"); //instead of passing 4 (another option)
            String email = resultSet.getString("email");

            String output = "User #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, username, password, fullName, email)); //pre-increment


        }

    }
    public static void insertData (Connection conn, String username, String password, String fullName, String email) throws SQLException{

        String sql = "INSERT INTO Users (username, password, fullname, email) VALUE (?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, fullName);
        statement.setString(4, email);

        //To execute
        //statement.executeUpdate();
       int rowsInserted = statement.executeUpdate();
       if(rowsInserted > 0){
           System.out.println("A new user was inserted successfully");
       } else{
           System.out.println("Something was wrong");
       }

        //returning back -> can use this data
    }
    public static void deleteData (Connection conn, String username) throws SQLException {
        String sql = "DELETE FROM Users WHERE username = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);

        int rowsDeleted = statement.executeUpdate();
        if(rowsDeleted > 0){
            System.out.println("The user was deleted successfully");
        } else{
            System.out.println("Something was wrong");
        }
    }

}

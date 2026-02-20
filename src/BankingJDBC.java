import java.sql.*;
import java.util.Scanner;

public class BankingJDBC {

    static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    static final String USER = "root";      // change if needed
    static final String PASS = "0000";  // change if needed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Banking Application (JDBC) ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> createAccount(sc);
                case 2 -> deposit(sc);
                case 3 -> withdraw(sc);
                case 4 -> showBalance(sc);
                case 0 -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    // ---------------------- CREATE ACCOUNT -------------------------
    static void createAccount(Scanner sc) {
    try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        String sql = "INSERT INTO accounts (name, balance) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, name);
        ps.setDouble(2, bal);

        ps.executeUpdate();

        // Get generated account number
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            int accNo = rs.getInt(1);
            System.out.println("Account created successfully!");
            System.out.println("Your Account Number is: " + accNo);
        } else {
            System.out.println("Account created, but could not fetch account number.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // --------------------------- DEPOSIT ----------------------------
   static void deposit(Scanner sc) {
    try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Deposit Amount: ");
        double amt = sc.nextDouble();

        String sql = "UPDATE accounts SET balance = balance + ? WHERE acc_no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, amt);
        ps.setInt(2, acc);

        int rows = ps.executeUpdate();
        if (rows > 0) System.out.println("Deposit successful!");
        else System.out.println("Account not found!");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // --------------------------- WITHDRAW ----------------------------
static void withdraw(Scanner sc) {
    try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();

        String check = "SELECT balance FROM accounts WHERE acc_no = ?";
        PreparedStatement ps1 = con.prepareStatement(check);
        ps1.setInt(1, acc);
        ResultSet rs = ps1.executeQuery();

        if (!rs.next()) {
            System.out.println("Account not found!");
            return;
        }

        double bal = rs.getDouble("balance");
        if (amt > bal) {
            System.out.println("Insufficient balance!");
            return;
        }

        String sql = "UPDATE accounts SET balance = balance - ? WHERE acc_no = ?";
        PreparedStatement ps2 = con.prepareStatement(sql);
        ps2.setDouble(1, amt);
        ps2.setInt(2, acc);
        ps2.executeUpdate();

        System.out.println("Withdraw successful!");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // --------------------------- SHOW BALANCE ----------------------------
    static void showBalance(Scanner sc) {
    try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        String sql = "SELECT name, balance FROM accounts WHERE acc_no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, acc);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Name   : " + rs.getString("name"));
            System.out.println("Balance: " + rs.getDouble("balance"));
        } else {
            System.out.println("Account not found!");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

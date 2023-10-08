import java.sql.*;
public class BusReser {
    private static String url = "jdbc:mysql://localhost:3306/busReserv";
    private static String username = "root";
    private static  String password = "y1012jqkhkp";
    public static  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Date;

public class BookingDao {
    public int bookInfo(int busNo, Date date) throws SQLException {
        String q1 = "select count(passenger_name) from booking where bus_no = ? and tarvel_date = ?";
        Connection c = BusReser.getConnection();
        PreparedStatement p = c.prepareStatement(q1);
        java.sql.Date datesq = new java.sql.Date(date.getTime());
        p.setInt(1,busNo);
        p.setDate(2,datesq);
        ResultSet rs = p.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public void add(Booking b) throws SQLException {
        String q = "insert into booking values(?,?,?)";
        Connection con = BusReser.getConnection();
        PreparedStatement st = con.prepareStatement(q);
        java.sql.Date datesq = new java.sql.Date(b.date.getTime());
        st.setString(1,b.passengerName);
        st.setInt(2,b.busNo);
        st.setDate(3,datesq);
        st.executeUpdate();


    }
}

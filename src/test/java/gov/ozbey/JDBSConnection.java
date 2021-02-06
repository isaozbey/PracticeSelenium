package gov.ozbey;

import org.junit.Test;

import java.sql.*;

public class JDBSConnection {

    @Test
    public void createConnection() throws SQLException {

        String connectionStr="jdbc:oracle:thin:@3.82.241.98:1521:XE";
        String username="hr";
        String password="hr";

        Connection conn= DriverManager.getConnection(connectionStr,username,password);

        Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs=stmt.executeQuery("Select * from regions");
        rs.next();
        System.out.println("rs.absolute(1) = " + rs.getString(2));

        System.out.println("ENd");





    }
}

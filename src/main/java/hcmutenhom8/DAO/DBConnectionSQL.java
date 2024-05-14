package hcmutenhom8.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionSQL {
    private final String serverName = "DESKTOP-8C0E5N3"; //fix
    private final String dbName = "FinalWeb2"; //fix
    private final String portNumber = "1433"; //fix
    private final String instance = "";// MSSQLSERVER LEAVE THIS ONE
    private final String userID = "sa"; //fix
    private final String password = "nnmvpqh<302"; //fix

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    public static void main(String[] args) {
        try {
            System.out.println(new DBConnectionSQL().getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package commonClassesReusable;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	private static Connection con = null;

	public static Connection openDBConnection_Mssql() throws SQLException, ClassNotFoundException, IOException {
		con = DriverManager.getConnection(
				ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("mssqldbConnectionUrl"),
				ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("mssqldbUserName"),
				ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("mssqldbPassword"));

		try {
			Class.forName(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("mssqldriver"));
			if (!con.isClosed())
				System.out.println("Successfully connected to SQL server");

		} catch (Exception e) {
			System.err.println("There is some exception in openDBConnection_Mssql: " + e.getMessage());
			con.close();
		}
		return con;
	}

	public static ResultSet getDataBaseTableData(String query) throws ClassNotFoundException, SQLException, IOException {
		ResultSet rs = null;
		try {
			con = openDBConnection_Mssql();
			Statement st = con.createStatement();
			System.out.println(st);
			rs = st.executeQuery(query);
			con.close();
		} catch (SQLException e) {
			System.out.println("There is some exception in getDataBaseTableData" + e.getMessage());
			con.close();
		}
		return rs;

	}
}

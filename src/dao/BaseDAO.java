package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BaseDAO {
	//与mysql数据库建立联系
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection(
							"jdbc:mysql://localhost:3306/studentdb?characterEncoding=utf8",
							"root", "974547252");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//关闭资源的方法
	public void closeAll(Connection con,PreparedStatement pst,ResultSet rst){
		if (rst != null) {
			try {
				rst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

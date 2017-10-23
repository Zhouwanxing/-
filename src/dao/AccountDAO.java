package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Account;
public class AccountDAO extends BaseDAO {
	//登录
	public Account isLogin(String aname,String apwd){
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			con = getCon();
			String sql = "select * from account where aname=? and apwd=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, aname);
			pst.setString(2, apwd);
			rst = pst.executeQuery();
			if (rst.next()) {
				Account acc = new Account(rst.getInt(1), rst.getString(2), rst.getString(3));
				return acc;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, rst);
		}
		return null;
	}
	//修改密码
	public int UpDatePwd(String aname,String oldpwd,String newpwd){
		while (this.isLogin(aname, oldpwd) != null) {
			Connection con = null;
			PreparedStatement pst = null;
			try {
				con = getCon();
				String sql = "update account set apwd =? where aname =? ";
				pst = con.prepareStatement(sql);
				pst.setString(1, newpwd);
				pst.setString(2, aname);
				pst.executeUpdate();
				return 1;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 关闭资源
				closeAll(con, pst, null);
			}
		}
		return 0;
	}
}

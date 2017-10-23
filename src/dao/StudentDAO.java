package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import entity.Account;
import entity.Student;

public class StudentDAO extends BaseDAO {
	//输入转换
	public String ZhuanHuan(String tj) {
		if (tj == "姓名") {
			return "sname";
		} else if (tj == "性别") {
			return "sex";
		} else if (tj == "年龄") {
			return "age";
		} else if (tj == "专业") {
			return "type";
		} else {
			return "hobby";
		}
	}

	public Student isLogin(String aname, String apwd) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			con = getCon();
			String sql = "select * from student where sname=? and spwd=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, aname);
			pst.setString(2, apwd);
			rst = pst.executeQuery();
			if (rst.next()) {
				Student stu = new Student(rst.getInt(1), rst.getString(2), rst
						.getString(3), rst.getInt(1), rst.getString(2), rst
						.getString(3));
				return stu;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, rst);
		}
		return null;
	}
	
	//添加学生的方法
	public void addStudent(Student stu) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = getCon();
			String sql = "INSERT into student(sname,sex,age,type,hobby) VALUES(?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, stu.getSname());
			pst.setString(2, stu.getSex());
			pst.setInt(3, stu.getAge());
			pst.setString(4, stu.getType());
			pst.setString(5, stu.getHobby());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, null);
		}
	}
	//默认密码
	public void morenPwd(String name) {
		Connection con = null;
		PreparedStatement pst = null;
		int i;
		try {
			con = getCon();
			String sql = null;
			sql = "update  student set spwd = '123456' where sname =?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, null);
		}
	}
	//查询所有学生信息的方法
	//ArrayList 集合  动态的数组
	public ArrayList getAll() {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		// 创建集合 保存多个学生
		ArrayList list = new ArrayList();
		try {
			con = getCon();
			String sql = "select * from student";
			pst = con.prepareStatement(sql);
			rst = pst.executeQuery();
			while (rst.next()) {
				Student stu = new Student(rst.getInt(1), rst.getString(2), rst
						.getString(3), rst.getInt(4), rst.getString(5), rst
						.getString(6));
				// 将学生放入集合
				list.add(stu);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, rst);
		}
		return null;
	}
	//条件查询
	public ArrayList MohuSelete(String tj, String ip) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		// 创建集合 保存多个学生
		ArrayList list = new ArrayList();
		try {
			con = getCon();
			String sql = null;
			String add = this.ZhuanHuan(tj);
			sql = "select * from student where " + add + " = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, ip);
			rst = pst.executeQuery();
			while (rst.next()) {
				Student stu = new Student(rst.getInt(1), rst.getString(2), rst
						.getString(3), rst.getInt(4), rst.getString(5), rst
						.getString(6));
				// 将学生放入集合
				list.add(stu);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, rst);
		}
		return null;

	}
	//删除学生信息
	public int Delete(String tj, String ip) {
		// this.getAll();
		ArrayList<Student> list = this.getAll();
		int i = 0;
		for (Student xs : list) {
			i++;
		}
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = getCon();
			String sql = null;
			String add = this.ZhuanHuan(tj);
			sql = "delete from student where " + add + " = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, ip);

			pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, null);
		}
		ArrayList<Student> list1 = this.getAll();
		int j = 0;
		for (Student xs : list1) {
			j++;
		}
		return (i - j);

	}
	
	//更改信息
	public int UpDate(String newtj, String newx, String oldtj, String oldx) {
		Connection con = null;
		PreparedStatement pst = null;
		int i;
		try {
			con = getCon();
			String sql = null;
			String tiaojian1 = this.ZhuanHuan(newtj);
			String tiaojian2 = this.ZhuanHuan(oldtj);
			ArrayList<Student> list = this.MohuSelete(oldtj, oldx);
			i = 0;
			for (Student xs : list) {
				i++;
			}
			sql = "update  student set " + tiaojian1 + " =? where " + tiaojian2
					+ " =?";
			pst = con.prepareStatement(sql);
			pst.setString(1, newx);
			pst.setString(2, oldx);
			pst.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, null);
		}
		return 0;
	}
	//学生修改密码
	public int UpDatePwd(String aname, String oldpwd, String newpwd) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = getCon();
			String sql = "update student set spwd =? where sname =? ";
			pst = con.prepareStatement(sql);
			pst.setString(1, newpwd);
			pst.setString(2, aname);
			pst.executeUpdate();
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭资源
			closeAll(con, pst, null);
		}
		return 0;
	}
}

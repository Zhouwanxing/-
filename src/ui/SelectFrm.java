/*
 * SelectFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import dao.StudentDAO;
import entity.Student;

/**
 *
 * @author  __USER__
 */
public class SelectFrm extends javax.swing.JFrame {

	/** Creates new form SelectFrm */
	public SelectFrm() {
		initComponents();
		//设置窗体居中显示
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jtabSelect = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u67e5\u8be2");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jtabSelect.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jtabSelect);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
						679, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
						195, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	//窗体打开后执行的代码
	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		// 使用table步骤
		// 1.定义列头
		String lt[] = { "学号", "姓名", "年龄", "性别", "专业", "爱好" };
		// 2.创建表中数据显示的格式对象 将列头放进去
		DefaultTableModel model = new DefaultTableModel(lt, 0);
		// 3.将数据放入model
		// String data1[] = { "学号1", "姓名", "年龄", "性别", "专业" };
		// String data2[] = { "学号2", "姓名", "年龄", "性别", "专业" };
		// String data3[] = { "学号3", "姓名", "年龄", "性别", "专业" };
		// model.addRow(data1);
		// model.addRow(data2);
		// model.addRow(data3);
		// 获得学生所有学生集合
		StudentDAO dao = new StudentDAO();
		// <Student> 说明这个集合中的数据都是 Student类型
		ArrayList<Student> list = dao.getAll();
		/*
		 * foreach循环
		 * 
		 * for(集合中元素的类型 别名 : 你要循环的集合){
		 * 
		 * }
		 */
		// 循环集合
		for (Student xs : list) {
			Object[] obj = { xs.getSid(), xs.getSname(), xs.getAge(),
					xs.getSex(), xs.getType(), xs.getHobby() };
			model.addRow(obj);
		}
		// 4.将model交给table
		jtabSelect.setModel(model);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SelectFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jtabSelect;
	// End of variables declaration//GEN-END:variables

}
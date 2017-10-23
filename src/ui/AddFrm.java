/*
 * AddFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import javax.swing.JOptionPane;

import dao.StudentDAO;
import entity.Student;

/**
 *
 * @author  __USER__
 */
public class AddFrm extends javax.swing.JFrame {

	/** Creates new form AddFrm */
	public AddFrm() {
		initComponents();

		//将性别单选按钮放入 分组中
		btngSex.add(jrbtnMen);
		btngSex.add(jrbtnWomen);

		//设置默认选中
		jrbtnMen.setSelected(true);

		//设置居中
		setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btngSex = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jtxtName = new javax.swing.JTextField();
		jtxtAge = new javax.swing.JTextField();
		jrbtnMen = new javax.swing.JRadioButton();
		jrbtnWomen = new javax.swing.JRadioButton();
		jcbType = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jbtnAdd = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u5b66\u751f\u5f55\u5165");

		jLabel1.setText("\u59d3\u540d:");

		jLabel2.setText("\u5e74\u9f84:");

		jLabel3.setText("\u6027\u522b:");

		jLabel4.setText("\u4e13\u4e1a:");

		jrbtnMen.setText("\u7537");

		jrbtnWomen.setText("\u5973");

		jcbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"计算机应用", "物流管理", "商务英语", "计算机科学与技术", "通信技术", "会计", "财务管理",
				"机电与自动化" }));

		jLabel5.setText("\u7231\u597d:");

		jbtnAdd.setText("\u6dfb\u52a0");
		jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtnAddActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jtxtName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				116,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jtxtAge,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				51,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jcbType,
																												0,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jrbtnMen)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jrbtnWomen))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel5)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												131,
																												Short.MAX_VALUE)))))
										.addContainerGap(
												27,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										88, Short.MAX_VALUE).addComponent(
										jbtnAdd).addGap(74, 74, 74)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(36, 36, 36)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jtxtName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jtxtAge,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(jrbtnMen)
														.addComponent(
																jrbtnWomen))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jcbType,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38).addComponent(
												jbtnAdd).addContainerGap(70,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {
		// 将信息存入数据库中
		// 获得用户提交的数据
		// 获得文本框中的数据
		String sname = jtxtName.getText();
		// 文本框中的数据默认是String类型
		// 将String类型转换问int类型
		int age = Integer.parseInt(jtxtAge.getText());
		// 获得性别单选按钮的值
		String sex = "男";
		// isSelected() 获得是否选中
		if (jrbtnWomen.isSelected()) {
			sex = "女";
		}
		// String sex = jrbtnMen.isSelected()?"男":"女";
		// 获得下拉框的值
		String type = jcbType.getSelectedItem().toString();
		// 获得多选框的值
		String hobby = jTextField1.getText();
		// if (jckbEat.isSelected()) {
		// hobby += "吃饭,";
		// }
		// if (jckbSleep.isSelected()) {
		// hobby += "睡觉,";
		// }
		// if (jckbBit.isSelected()) {
		// hobby += "打豆豆";
		// }
		// 将数据交给对象保存
		Student stu = new Student(sname, sex, age, type, hobby);
		// 调用方法
		StudentDAO dao = new StudentDAO();
		dao.addStudent(stu);
		dao.morenPwd(sname);
		JOptionPane.showMessageDialog(null, "添加成功");
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.ButtonGroup btngSex;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JButton jbtnAdd;
	private javax.swing.JComboBox jcbType;
	private javax.swing.JRadioButton jrbtnMen;
	private javax.swing.JRadioButton jrbtnWomen;
	private javax.swing.JTextField jtxtAge;
	private javax.swing.JTextField jtxtName;
	// End of variables declaration//GEN-END:variables

}
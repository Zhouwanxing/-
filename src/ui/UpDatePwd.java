/*
 * UpDatePwd.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import javax.swing.JOptionPane;

import dao.AccountDAO;

/**
 *
 * @author  __USER__
 */
public class UpDatePwd extends javax.swing.JFrame {

	/** Creates new form UpDatePwd */
	public UpDatePwd() {
		initComponents();
		//设置窗体居中显示
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		oldpwd = new javax.swing.JPasswordField();
		newpwd1 = new javax.swing.JPasswordField();
		newpwd2 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u539f\u59cb\u5bc6\u7801\uff1a");

		jLabel2.setText("\u65b0\u7684\u5bc6\u7801\uff1a");

		jLabel3.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton1.setText("\u786e\u8ba4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
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
										.addGap(52, 52, 52)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				newpwd2))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				newpwd1))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				oldpwd,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				179,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(104, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(145, Short.MAX_VALUE)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(32, 32, 32)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(94, 94, 94)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(41, 41, 41)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																oldpwd,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																newpwd1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(27, 27, 27)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																newpwd2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(55, 55, 55)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton1))
										.addContainerGap(63, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String aName = this.getTitle();
		String oldPwd = oldpwd.getText();
		String newPwd1 = newpwd1.getText();
		String newPwd2 = newpwd2.getText();
		AccountDAO ad = new AccountDAO();
		if (ad.isLogin(aName, oldPwd) == null) {
			JOptionPane.showMessageDialog(null, "原始密码错误!");
		} else {
			if (!(newPwd1.equals(newPwd2))) {
				JOptionPane.showMessageDialog(null, "两次输入的密码不一致!");
			} else {
				// AccountDAO ad = new AccountDAO();
				ad.UpDatePwd(aName, oldPwd, newPwd1);
				JOptionPane.showMessageDialog(null, "密码修改成功！");
			}
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int choose = JOptionPane.showConfirmDialog(null, "是否退出？", "系统提示",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (choose == 0) {
			//退出程序
			//			System.exit(0);
			this.dispose();
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UpDatePwd().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField newpwd1;
	private javax.swing.JPasswordField newpwd2;
	private javax.swing.JPasswordField oldpwd;
	// End of variables declaration//GEN-END:variables

}
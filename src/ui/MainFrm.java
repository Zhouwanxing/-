/*
 * MainFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import javax.swing.JDialog;
import javax.swing.JOptionPane;



/**
 *
 * @author  __USER__
 */
public class MainFrm extends javax.swing.JFrame {

	/** Creates new form MainFrm */
	public MainFrm() {
		initComponents();
		//设置窗体居中显示
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jmiAdd = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jmiSelectALL = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jmExit = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jMenu1.setText("\u7cfb\u7edf\u64cd\u4f5c");

		jmiAdd.setText("\u6dfb\u52a0\u5b66\u751f\u4fe1\u606f");
		jmiAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiAddActionPerformed(evt);
			}
		});
		jMenu1.add(jmiAdd);

		jMenuItem2.setText("\u4fee\u6539\u5b66\u751f\u4fe1\u606f");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setText("\u5220\u9664\u5b66\u751f\u4fe1\u606f");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenu4.setText("\u67e5\u8be2");

		jMenuItem1.setText("\u6761\u4ef6\u67e5\u8be2");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem1);

		jmiSelectALL.setText("\u5168\u90e8\u67e5\u8be2");
		jmiSelectALL.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiSelectALLActionPerformed(evt);
			}
		});
		jMenu4.add(jmiSelectALL);

		jMenu1.add(jMenu4);

		jMenuItem4.setText("\u4fee\u6539\u5bc6\u7801");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);

		jMenuBar1.add(jMenu1);

		jmExit.setText("\u9000\u51fa");
		jmExit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jmExitMouseClicked(evt);
			}
		});
		jMenuBar1.add(jmExit);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 499,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 281,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		MohuSeleteFrm ms = new MohuSeleteFrm();
		ms.setVisible(true);
		ms.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		UpDatePwd udp = new UpDatePwd();
		udp.setTitle(getTitle());
		//		this.getTitle();
		udp.setVisible(true);
		udp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		UpDateFrm df = new UpDateFrm();
		df.setVisible(true);
		df.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		DeleteFrm ud = new DeleteFrm();
		ud.setVisible(true);
		ud.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void jmiSelectALLActionPerformed(java.awt.event.ActionEvent evt) {
		SelectFrm sf = new SelectFrm();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void jmiAddActionPerformed(java.awt.event.ActionEvent evt) {

		AddFrm af = new AddFrm();
		af.setVisible(true);
		af.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		int choose = JOptionPane.showConfirmDialog(null, "是否退出？", "系统提示",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (choose == 0) {
			//退出程序
//			System.exit(0);
			this.dispose();
		}
	}
	private void jmExitMouseClicked(java.awt.event.MouseEvent evt) {
		//弹出一个带选择按钮的提示框					
		// 位置 	  提示消息		消息框的标题       按钮的类型
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
				new MainFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenu jmExit;
	private javax.swing.JMenuItem jmiAdd;
	private javax.swing.JMenuItem jmiSelectALL;
	// End of variables declaration//GEN-END:variables

}
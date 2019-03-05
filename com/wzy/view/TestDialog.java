package com.wzy.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestDialog extends JDialog implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new addDialog(this);
	}
	
	JButton addBt = new JButton("����");
	JButton alterBt = new JButton("�޸�");
	JButton delBt = new JButton("ɾ��");
	
	List<Patient> list = new LinkedList<Patient>();
	
	Object[][] rowDatas;	
	Object[] colNames = new Object[] {
		"���", "����", "֢״"	
	};
	
	
	JTable jt;

	public void updateDatas() {
		rowDatas = new Object[list.size()][3];
		int i = 0;
		for (Patient p : list) {
			rowDatas[i][0] = p.getNum();
			rowDatas[i][1] = p.getName();
			rowDatas[i][2] = p.getSymptom();
			i++;
		}
		jt = new JTable(rowDatas, colNames);
	}
	
	/**
	 * 
	 */
	public TestDialog() {
		// TODO Auto-generated constructor stub
		list.add(new Patient("1", "����Ȫһ��", "����"));
		list.add(new Patient("2", "����Ȫ����", "�Բ�"));
		list.add(new Patient("3", "����Ȫ����", "����ɭ"));
		
		updateDatas();
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		addBt.addActionListener(this);	
		
		jp.add(addBt);
		jp.add(alterBt);
		jp.add(delBt);
		
		Container container = super.getContentPane();
		JScrollPane jsp = new JScrollPane(jt);
		container.add(jsp, BorderLayout.CENTER);
		container.add(jp, BorderLayout.NORTH);
		super.setSize(400,600);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
	}
	
}

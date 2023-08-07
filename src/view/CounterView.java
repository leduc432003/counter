package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_Up;
	private JButton jButton_Down;
	private JButton jButton_Rest;
	private JLabel jLabel_value;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Counter Model");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener al = new CounterListener(this);
		
		jButton_Up = new JButton("UP");
		jButton_Up.addActionListener(al);
		jButton_Down = new JButton("DOWN");
		jButton_Down.addActionListener(al);
		jButton_Rest = new JButton("REST");
		jButton_Rest.addActionListener(al);
		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_Up, BorderLayout.WEST);
		jPanel.add(jButton_Down, BorderLayout.EAST);
		jPanel.add(jButton_Rest, BorderLayout.SOUTH);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
}

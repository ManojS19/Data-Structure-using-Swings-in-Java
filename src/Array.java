import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField intelement;
	private JTextField position;
	private JTextField deletepos;
	private JTextField dispelem;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 399);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 64));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(201, 10, 254, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbllength = new JLabel("ENTER ARRAY LENGTH :");
		lbllength.setForeground(new Color(0, 128, 64));
		lbllength.setFont(new Font("Constantia", Font.BOLD, 16));
		lbllength.setBounds(102, 57, 201, 20);
		contentPane.add(lbllength);
		
		length = new JTextField();
		length.setBounds(315, 52, 96, 25);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton crtarray = new JButton("CREATE ARRAY");
		crtarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creat array
				int len=Integer.parseInt(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		crtarray.setFont(new Font("Constantia", Font.BOLD, 16));
		crtarray.setBounds(249, 97, 162, 29);
		contentPane.add(crtarray);
		
		JLabel lblint = new JLabel("ENTER INTEGER ELEMENT  :");
		lblint.setForeground(new Color(0, 128, 64));
		lblint.setFont(new Font("Constantia", Font.BOLD, 16));
		lblint.setBounds(10, 158, 233, 20);
		contentPane.add(lblint);
		
		intelement = new JTextField();
		intelement.setColumns(10);
		intelement.setBounds(248, 153, 96, 25);
		contentPane.add(intelement);
		
		JLabel lblpos = new JLabel("POSITION :");
		lblpos.setForeground(new Color(0, 128, 64));
		lblpos.setFont(new Font("Constantia", Font.BOLD, 16));
		lblpos.setBounds(357, 160, 90, 20);
		contentPane.add(lblpos);
		
		position = new JTextField();
		position.setColumns(10);
		position.setBounds(454, 153, 96, 25);
		contentPane.add(position);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert element and give position
				int elem=Integer.parseInt(intelement.getText());
				int pos=Integer.parseInt(position.getText());
				arr[pos]=elem;
				String message="Element "+elem+" inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				intelement.setText("");
				position.setText("");
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(560, 149, 109, 29);
		contentPane.add(insert);
		
		JLabel lbldeletepos = new JLabel("ENTER THE POSITION  :");
		lbldeletepos.setForeground(new Color(0, 128, 64));
		lbldeletepos.setFont(new Font("Constantia", Font.BOLD, 16));
		lbldeletepos.setBounds(49, 205, 206, 20);
		contentPane.add(lbldeletepos);
		
		deletepos = new JTextField();
		deletepos.setColumns(10);
		deletepos.setBounds(277, 200, 96, 25);
		contentPane.add(deletepos);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter position for deleting element
				int pos=Integer.parseInt(deletepos.getText());
				String message="Element deleted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				arr[pos]=0;
				deletepos.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(383, 201, 103, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display element
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				dispelem.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(277, 259, 109, 29);
		contentPane.add(display);
		
		dispelem = new JTextField();
		dispelem.setFont(new Font("Tahoma", Font.BOLD, 10));
		dispelem.setForeground(new Color(0, 0, 0));
		dispelem.setBackground(new Color(192, 192, 192));
		dispelem.setColumns(10);
		dispelem.setBounds(185, 309, 312, 25);
		contentPane.add(dispelem);
	}
}

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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
	private int q[];
	private int r=-1;
	private int f=0;
	private int siz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueueDataStructure = new JLabel("QUEUE DATA STRUCTURE");
		lblQueueDataStructure.setForeground(Color.RED);
		lblQueueDataStructure.setFont(new Font("Algerian", Font.BOLD, 20));
		lblQueueDataStructure.setBounds(159, 10, 254, 25);
		contentPane.add(lblQueueDataStructure);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE  :");
		lblEnterQueueSize.setForeground(new Color(0, 128, 64));
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(28, 50, 180, 20);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setColumns(10);
		size.setBounds(218, 45, 135, 25);
		contentPane.add(size);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create queue
				int len=Integer.parseInt(size.getText());
				q=new int[len];
				siz=q.length;
				String message="Queue of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Constantia", Font.BOLD, 16));
		createqueue.setBounds(218, 87, 175, 29);
		contentPane.add(createqueue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT  :");
		lblEnterAnElement.setForeground(new Color(0, 128, 64));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterAnElement.setBounds(28, 141, 180, 20);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(218, 136, 135, 25);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert operation
				int elem;
				if(r==siz-1)
				{
					JOptionPane.showMessageDialog(contentPane,"insert not possible");
					element.setText("");
				}
				else
				{
					elem=Integer.parseInt(element.getText());
					r++;
					q[r]=elem;
					String message="Element "+elem+" inserted @ length "+r;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(400, 132, 109, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete operation
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else
				{
					String message="Element "+q[f]+" deleted @ length "+f;
					JOptionPane.showMessageDialog(contentPane, message);
					f++;
				}
				result.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(237, 187, 103, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display operation
				String msg="";
				result.setText("");
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					result.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(237, 236, 111, 29);
		contentPane.add(display);
		
		result = new JTextField();
		result.setForeground(Color.BLACK);
		result.setFont(new Font("Tahoma", Font.BOLD, 10));
		result.setColumns(10);
		result.setBackground(Color.LIGHT_GRAY);
		result.setBounds(138, 275, 312, 25);
		contentPane.add(result);
	}

}

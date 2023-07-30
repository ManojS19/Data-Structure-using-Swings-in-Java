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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
	private int cq[];
	private int siz;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueData = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblCircularQueueData.setForeground(Color.RED);
		lblCircularQueueData.setFont(new Font("Algerian", Font.BOLD, 20));
		lblCircularQueueData.setBounds(124, 10, 365, 27);
		contentPane.add(lblCircularQueueData);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE  :");
		lblEnterQueueSize.setForeground(new Color(0, 128, 64));
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(29, 65, 180, 20);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setColumns(10);
		size.setBounds(207, 61, 135, 25);
		contentPane.add(size);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create queue
				int len=Integer.parseInt(size.getText());
			     cq=new int[len];
				siz=cq.length;
				String message="Circular Queue of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Constantia", Font.BOLD, 16));
		createqueue.setBounds(191, 95, 175, 29);
		contentPane.add(createqueue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT  :");
		lblEnterAnElement.setForeground(new Color(0, 128, 64));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterAnElement.setBounds(29, 156, 180, 20);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(207, 152, 135, 25);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert
				int elem;
				if(count==siz)
				{
					JOptionPane.showMessageDialog(contentPane,"insert not possible");
					element.setText("");
				}
				else
				{
					elem=Integer.parseInt(element.getText());
					r=(r+1)%siz;
					cq[r]=elem;
					++count;
					String message="Element "+elem+" inserted @ length "+r;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(352, 147, 109, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"deletion not possible");
				}
				else
				{
					String message="Element "+cq[f]+" deleted @ length "+f;
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%siz;
					count--;
				}
				result.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(228, 202, 103, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				
				String msg="";
				int f1=f;
				result.setText("");
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%siz;
					}
					result.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(228, 267, 111, 29);
		contentPane.add(display);
		
		result = new JTextField();
		result.setForeground(Color.BLACK);
		result.setFont(new Font("Tahoma", Font.BOLD, 10));
		result.setColumns(10);
		result.setBackground(Color.LIGHT_GRAY);
		result.setBounds(134, 308, 312, 25);
		contentPane.add(result);
	}

}

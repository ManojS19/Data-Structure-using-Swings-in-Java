import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
	private int s[];
	private int top=-1;
	private int siz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhead = new JLabel("STACK DATA STRUCTURE");
		lblhead.setForeground(Color.RED);
		lblhead.setFont(new Font("Algerian", Font.BOLD, 20));
		lblhead.setBounds(198, 10, 254, 25);
		contentPane.add(lblhead);
		
		JLabel lblsize = new JLabel("ENTER THE STACK SIZE  :");
		lblsize.setForeground(new Color(0, 128, 64));
		lblsize.setFont(new Font("Constantia", Font.BOLD, 16));
		lblsize.setBounds(29, 66, 201, 20);
		contentPane.add(lblsize);
		
		size = new JTextField();
		size.setColumns(10);
		size.setBounds(255, 62, 135, 25);
		contentPane.add(size);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create stack
				int len=Integer.parseInt(size.getText());
				s=new int[len];
				siz=s.length;
				String message="Stack of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setFont(new Font("Constantia", Font.BOLD, 16));
		createstack.setBounds(407, 62, 159, 29);
		contentPane.add(createstack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT  :");
		lblEnterAnElement.setForeground(new Color(0, 128, 64));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterAnElement.setBounds(29, 159, 201, 20);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(240, 152, 135, 25);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push operation
				int elem;
				if(top==siz-1)
				{
					JOptionPane.showMessageDialog(contentPane,"push not possible");
					element.setText("");
				}
				else
				{
				elem=Integer.parseInt(element.getText());
				++top;
				s[top]=elem;
				String message="Element "+elem+" inserted @ length "+top;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				}
			}
		});
		push.setFont(new Font("Constantia", Font.BOLD, 16));
		push.setBounds(385, 150, 90, 29);
		contentPane.add(push);
		
		JButton POP = new JButton("POP");
		POP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop operation
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"pop not possible");
				}
				else
				{
					String message="Element "+s[top]+" deleted @ length "+top;
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
				result.setText("");
			}
		});
		POP.setFont(new Font("Constantia", Font.BOLD, 16));
		POP.setBounds(274, 199, 90, 29);
		contentPane.add(POP);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack display operation
				String msg="";
				result.setText("");
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[i];
					}
					result.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(266, 244, 111, 29);
		contentPane.add(display);
		
		result = new JTextField();
		result.setForeground(Color.BLACK);
		result.setFont(new Font("Tahoma", Font.BOLD, 10));
		result.setColumns(10);
		result.setBackground(new Color(192, 192, 192));
		result.setBounds(167, 283, 312, 25);
		contentPane.add(result);
	}

}

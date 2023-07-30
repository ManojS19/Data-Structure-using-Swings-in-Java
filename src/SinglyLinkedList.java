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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearelement;
	private JTextField frontelement;
	private JTextField midelement;
	private JTextField result;
	class Node
	{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedList = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblSinglyLinkedList.setForeground(Color.RED);
		lblSinglyLinkedList.setFont(new Font("Algerian", Font.BOLD, 20));
		lblSinglyLinkedList.setBounds(144, 10, 392, 27);
		contentPane.add(lblSinglyLinkedList);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement.setForeground(new Color(0, 128, 64));
		lblEnterTheElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement.setBounds(10, 64, 192, 20);
		contentPane.add(lblEnterTheElement);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement_1.setForeground(new Color(0, 128, 64));
		lblEnterTheElement_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement_1.setBounds(10, 107, 192, 20);
		contentPane.add(lblEnterTheElement_1);
		
		JLabel lblEnterTheElement_2 = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement_2.setForeground(new Color(0, 128, 64));
		lblEnterTheElement_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement_2.setBounds(10, 147, 192, 20);
		contentPane.add(lblEnterTheElement_2);
		
		rearelement = new JTextField();
		rearelement.setBounds(212, 59, 126, 27);
		contentPane.add(rearelement);
		rearelement.setColumns(10);
		
		frontelement = new JTextField();
		frontelement.setColumns(10);
		frontelement.setBounds(212, 100, 126, 27);
		contentPane.add(frontelement);
		
		midelement = new JTextField();
		midelement.setColumns(10);
		midelement.setBounds(212, 140, 126, 27);
		contentPane.add(midelement);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear
				Node temp;
				int elem=Integer.parseInt(rearelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
				String message="Element "+elem+" Inserted Rear";
				JOptionPane.showMessageDialog(contentPane,message);
				rearelement.setText("");
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrear.setBounds(384, 55, 175, 29);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem=Integer.parseInt(frontelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				String message="Element "+elem+" Inserted Front";
				JOptionPane.showMessageDialog(contentPane,message);
				frontelement.setText("");
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfront.setBounds(384, 94, 175, 29);
		contentPane.add(insertfront);
		
		JButton insertmiddle = new JButton("INSERT MIDDLE");
		insertmiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert middle
				Node temp;
				int count=0;
				int elem=Integer.parseInt(midelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						temp=temp.link;
						count++;
					}
					temp=first;
					count=count/2;
					for(int i=1;i<count;i++)
					{
						temp=temp.link;
					}
					newnode.link=temp.link;
					temp.link=newnode;
				}
				String message="Element "+elem+" Inserted Middle";
				JOptionPane.showMessageDialog(contentPane,message);
				midelement.setText("");
			}
		});
		insertmiddle.setFont(new Font("Constantia", Font.BOLD, 16));
		insertmiddle.setBounds(384, 138, 175, 29);
		contentPane.add(insertmiddle);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else if(first.link==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					String message="element deleted is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(233, 195, 175, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else if(first.link==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.link;
				}
				}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(233, 234, 175, 29);
		contentPane.add(deletefront);
		
		JButton deletemiddle = new JButton("DELETE MIDDLE");
		deletemiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete middle
				Node temp;
				int count=0;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else if(first.link==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
						count++;
					}
					temp=first;
					count=count/2;
					for(int i=1;i<count;i++)
					{
						temp=temp.link;
					}
					String message="element deleted is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=temp.link.link;
				}
			}
		});
		deletemiddle.setFont(new Font("Constantia", Font.BOLD, 16));
		deletemiddle.setBounds(233, 273, 175, 29);
		contentPane.add(deletemiddle);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				result.setText("");
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else if(first.link==null)
				{
					msg=msg+" "+first.data;
					result.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					result.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(267, 337, 111, 29);
		contentPane.add(display);
		
		result = new JTextField();
		result.setForeground(Color.BLACK);
		result.setFont(new Font("Tahoma", Font.BOLD, 10));
		result.setColumns(10);
		result.setBackground(Color.LIGHT_GRAY);
		result.setBounds(166, 388, 312, 25);
		contentPane.add(result);
	}
}

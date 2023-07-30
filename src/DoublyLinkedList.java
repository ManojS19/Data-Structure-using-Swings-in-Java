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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rearelement;
	private JTextField frontelement;
	private JTextField midelement;
	private JTextField result;
	private Node first;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	
	public DoublyLinkedList() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedList = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblDoublyLinkedList.setForeground(Color.RED);
		lblDoublyLinkedList.setFont(new Font("Algerian", Font.BOLD, 20));
		lblDoublyLinkedList.setBounds(143, 10, 392, 27);
		contentPane.add(lblDoublyLinkedList);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement.setForeground(new Color(0, 128, 64));
		lblEnterTheElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement.setBounds(10, 52, 192, 20);
		contentPane.add(lblEnterTheElement);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement_1.setForeground(new Color(0, 128, 64));
		lblEnterTheElement_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement_1.setBounds(10, 97, 192, 20);
		contentPane.add(lblEnterTheElement_1);
		
		JLabel lblEnterTheElement_2 = new JLabel("ENTER THE ELEMENT  :");
		lblEnterTheElement_2.setForeground(new Color(0, 128, 64));
		lblEnterTheElement_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement_2.setBounds(10, 140, 192, 20);
		contentPane.add(lblEnterTheElement_2);
		
		rearelement = new JTextField();
		rearelement.setColumns(10);
		rearelement.setBounds(212, 47, 126, 27);
		contentPane.add(rearelement);
		
		frontelement = new JTextField();
		frontelement.setColumns(10);
		frontelement.setBounds(212, 92, 126, 27);
		contentPane.add(frontelement);
		
		midelement = new JTextField();
		midelement.setColumns(10);
		midelement.setBounds(212, 140, 126, 27);
		contentPane.add(midelement);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear
				int elem=Integer.parseInt(rearelement.getText());
				Node temp;
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				String message="Element "+elem+" Inserted Rear";
				JOptionPane.showMessageDialog(contentPane,message);
				rearelement.setText("");
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrear.setBounds(360, 47, 175, 29);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem=Integer.parseInt(frontelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				String message="Element "+elem+" Inserted front";
				JOptionPane.showMessageDialog(contentPane,message);
				frontelement.setText("");
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfront.setBounds(360, 92, 175, 29);
		contentPane.add(insertfront);
		
		JButton insertmiddle = new JButton("INSERT MIDDLE");
		insertmiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert middle
				int elem=Integer.parseInt(midelement.getText());
				Node temp;
				int count=0;
				Node newnode=new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						temp=temp.nextlink;
						count++;
					}
					temp=first;
					count=count/2;
					for(int i=1;i<count;i++)
					{
						temp=temp.nextlink;
					}
					if(count==0)
					{
						temp=first;
						while(temp.nextlink!=null)
						{
							temp=temp.nextlink;
						}
						temp.nextlink=newnode;
						newnode.prelink=temp;
					}
					else
					{
					newnode.nextlink=temp.nextlink;
					temp.nextlink.prelink=newnode;
					newnode.prelink=temp;
					temp.nextlink=newnode;
					}
					
				}
				String message="Element "+elem+" Inserted middle";
				JOptionPane.showMessageDialog(contentPane,message);
				midelement.setText("");
			}
		});
		insertmiddle.setFont(new Font("Constantia", Font.BOLD, 16));
		insertmiddle.setBounds(360, 138, 175, 29);
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
				else if(first.nextlink==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String message="element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(73, 206, 175, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not possible");
				}
				else if(first.nextlink==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.nextlink;
					first.prelink=null;
					
				}
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(424, 206, 175, 29);
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
				else if(first.nextlink==null)
				{
					String message="element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
						count++;
					}
					temp=first;
					count=count/2;
					for(int i=1;i<count;i++)
					{
						temp=temp.nextlink;
					}
					if(count==0)
					{
						temp=first;
						while(temp.nextlink.nextlink!=null)
						{
							temp=temp.nextlink;
						}
						String message="element deleted is "+temp.nextlink.data;
						JOptionPane.showMessageDialog(contentPane, message);
						temp.nextlink=null;
					}
					else
					{
						String message="element deleted is "+temp.nextlink.data;
						JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=temp.nextlink.nextlink;
					temp.nextlink.prelink=temp;
					}
				}
			}
		});
		deletemiddle.setFont(new Font("Constantia", Font.BOLD, 16));
		deletemiddle.setBounds(250, 260, 175, 29);
		contentPane.add(deletemiddle);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward
				result.setText("");
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink==null)
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
						temp=temp.nextlink;
					}
					result.setText(msg);
				}
			}
		});
		displayforward.setFont(new Font("Constantia", Font.BOLD, 16));
		displayforward.setBounds(73, 324, 198, 29);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display reverse
				result.setText("");
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink==null)
				{
					msg=msg+" "+first.data;
					result.setText(msg);
				}
				else
				{
					temp=first;
					first.prelink=null;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					result.setText(msg);
				}
			}
		});
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 16));
		displayreverse.setBounds(410, 324, 189, 29);
		contentPane.add(displayreverse);
		
		result = new JTextField();
		result.setForeground(Color.BLACK);
		result.setFont(new Font("Tahoma", Font.BOLD, 10));
		result.setColumns(10);
		result.setBackground(Color.LIGHT_GRAY);
		result.setBounds(189, 382, 312, 25);
		contentPane.add(result);
	}

}

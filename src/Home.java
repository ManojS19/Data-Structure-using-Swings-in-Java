import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("DATA STRUCTURE");
		label.setForeground(new Color(128, 0, 0));
		label.setBackground(new Color(240, 240, 240));
		label.setFont(new Font("Algerian", Font.BOLD, 20));
		label.setBounds(243, 10, 202, 27);
		contentPane.add(label);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(new Color(0, 128, 0));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//array
				Array a=new Array();
				a.setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setBounds(283, 79, 92, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack
				Stack s=new Stack();
				s.setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 128, 0));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(104, 141, 92, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue
				Queue q=new Queue();
				q.setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 128, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(478, 141, 99, 27);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCUILER QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circular queue
				CircularQueue cq=new CircularQueue();
				cq.setVisible(true);
			}
		});
		cqueue.setForeground(new Color(0, 128, 0));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		cqueue.setBounds(243, 204, 189, 27);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sll
				SinglyLinkedList sll=new SinglyLinkedList();
				sll.setVisible(true);
			}
		});
		sll.setForeground(new Color(0, 128, 0));
		sll.setFont(new Font("Constantia", Font.BOLD, 14));
		sll.setBounds(66, 290, 202, 27);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dll
				DoublyLinkedList dll=new DoublyLinkedList();
				dll.setVisible(true);
			}
		});
		dll.setForeground(new Color(0, 128, 0));
		dll.setFont(new Font("Constantia", Font.BOLD, 14));
		dll.setBounds(420, 290, 202, 27);
		contentPane.add(dll);
	}
}

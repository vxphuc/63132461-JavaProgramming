package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2 extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
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
	public Bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("giải phương trình bậc 2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 24, 178, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("thực hiện");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giaiphuongtrinh();
			}
		});
		btnNewButton.setBounds(75, 201, 149, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("hệ số a");
		lblNewLabel_1.setBounds(57, 73, 67, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("hệ số b");
		lblNewLabel_2.setBounds(57, 116, 72, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("hệ số c");
		lblNewLabel_3.setBounds(57, 152, 72, 27);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("thoát");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(234, 201, 115, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("kết quả");
		lblNewLabel_4.setBounds(269, 101, 86, 33);
		contentPane.add(lblNewLabel_4);
		
		txta = new JTextField();
		txta.setBounds(104, 80, 96, 19);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(104, 120, 96, 19);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		txtc = new JTextField();
		txtc.setBounds(104, 156, 96, 19);
		contentPane.add(txtc);
		txtc.setColumns(10);
		
		kq = new JTextField();
		kq.setBounds(310, 108, 96, 19);
		contentPane.add(kq);
		kq.setColumns(10);
		
	
		
	}
	protected void giaiphuongtrinh() {
        double a = Double.parseDouble(txta.getText());
        double b = Double.parseDouble(txtb.getText());
        double c = Double.parseDouble(txtc.getText());
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            kq.setText("phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            kq.setText(String.format("phuong trinh co nghiem kep: x = %.2f", x));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            kq.setText(String.format("x1 = %.2f va x2 = %.2f", x1, x2));
        }
    }
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JPasswordField txtb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("dang nhap he thong ban hang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(35, 64, 122, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMtKhu.setBounds(35, 121, 122, 29);
		contentPane.add(lblMtKhu);
		
		txta = new JTextField();
		txta.setBounds(160, 70, 144, 22);
		contentPane.add(txta);
		txta.setColumns(10);
		
		JButton btndn = new JButton("Đăng nhập");
		btndn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulydangnhap();
			}
		});
		btndn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btndn.setBounds(125, 213, 133, 29);
		contentPane.add(btndn);
		
		txtb = new JPasswordField();
		txtb.setBounds(160, 127, 144, 22);
		contentPane.add(txtb);
	}
	public void xulydangnhap()
	{
		String strTDN = txta.getText();
		String strMK = txtb.getText();
		if(strTDN.equals("63CNTT") && strMK.equals("123"))
		{
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}else
		{
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "đăng nhập thất bại");
		}
	}
}

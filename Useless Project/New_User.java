import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;


public class New_User {

	private static JFrame frmFactAndSecrets;
	private JTextField textField;
	private JTextField txtMm;
	private JTextField txtYyyy;
	private JTextField txtDd;
	private JLabel lblEnterDate;
	private JLabel lblNerd;
	private JTextField txtInCms;
	private JLabel lblYourHeight;
	private JLabel lblGender;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnF;
	private JRadioButton rdbtnNonBinary;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	String nowl="";
	String gend="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_User window = new New_User();
					New_User.frmFactAndSecrets.setVisible(true);
					
					JOptionPane.showMessageDialog(frmFactAndSecrets,
						    "Enter The Details to Reveal Intersting Facts About You");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws InterruptedException 
	 */
	public New_User() throws InterruptedException {
		initialize();
		
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFactAndSecrets = new JFrame();
		frmFactAndSecrets.setTitle("Facts and Secrets About You");
		frmFactAndSecrets.setBounds(100, 100, 407, 279);
		frmFactAndSecrets.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = Toolkit.getDefaultToolkit().getImage("wow.png");
		frmFactAndSecrets.setIconImage(img);
		//Icon img1 = Toolkit.getDefaultToolkit().getImage("wink.png");
		ImageIcon img1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("wink.png"));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtMm = new JTextField();
		txtMm.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtMm.setText("");
			}
		});
		txtMm.setText("MM");
		txtMm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMm.setColumns(10);
		
		txtYyyy = new JTextField();
		txtYyyy.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtYyyy.setText("");
			}
		});
		txtYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtYyyy.setText("YYYY");
		txtYyyy.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nowl=e.getActionCommand();
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nowl=e.getActionCommand();
			}
		});
		buttonGroup.add(rdbtnNo);
		
		txtDd = new JTextField();
		txtDd.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDd.setText("");
			}
		});
		txtDd.addMouseListener(new MouseAdapter() {
			
		});
		txtDd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDd.setText("DD");
		txtDd.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblEnterDate = new JLabel("Enter Birth Date :");
		lblEnterDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblNerd = new JLabel("Night Owl :");
		lblNerd.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtInCms = new JTextField();
		txtInCms.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtInCms.setText("");
			}
		});
		txtInCms.setHorizontalAlignment(SwingConstants.CENTER);
		txtInCms.setText("in cms");
		txtInCms.setColumns(10);
		
		lblYourHeight = new JLabel("Your Height :");
		lblYourHeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		rdbtnNewRadioButton_1 = new JRadioButton("M");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gend =e.getActionCommand();
			}
		});
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gend =e.getActionCommand();
			}
		});
		buttonGroup_1.add(rdbtnF);
		
		rdbtnNonBinary = new JRadioButton("Non Binary");
		rdbtnNonBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gend =e.getActionCommand();
			}
		});
		buttonGroup_1.add(rdbtnNonBinary);
		
		JButton btnNewButton = new JButton("Reveal Facts");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dob=txtDd.getText()+"-"+txtMm.getText()+"-"+txtYyyy.getText();
				String height=txtInCms.getText()+"cms";
				String name=textField.getText();
				String gender=gend.equals("F")?"girl":"boy";
				nowl=nowl.equals("Yes")?"You are a Night Owl":"You are not a Night Owl";
				
				String message="Your name is "+name+"\n\tAnd you are a "+gender+".\n\tYou were born on "+dob+".\n\t"+nowl+".\nYour Height is "+height;
				
				JOptionPane.showMessageDialog(frmFactAndSecrets,
					    message,
					    "Facts Revealed",
					    JOptionPane.PLAIN_MESSAGE, img1);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frmFactAndSecrets.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEnterDate, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(lblNerd, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblYourHeight, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtInCms, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(rdbtnF, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnNewRadioButton_1)
										.addComponent(rdbtnNonBinary)))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(txtDd, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(txtMm, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(txtYyyy, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGap(31)
								.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel)
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterDate)
						.addComponent(lblNerd))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDd, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMm, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYyyy, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNo))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblYourHeight)
							.addGap(6)
							.addComponent(txtInCms, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblGender)
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnF)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNonBinary)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		frmFactAndSecrets.getContentPane().setLayout(groupLayout);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

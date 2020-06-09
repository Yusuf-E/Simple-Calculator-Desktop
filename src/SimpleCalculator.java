import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.SwingConstants;

public class SimpleCalculator {

	private JFrame frmHesapMakinesi;
	private JTextField textFieldsScreen;
	private JButton btnCe;
	private JButton btnC;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton btnX;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_12;
	private JButton button_11;
	private JButton button_13;
	private JButton button_14;
	double num2=1;
	double answer=0;
	double num1=1,counter=0;
	String operator,temp="";
	private JTextField textFieldResult;
	private JButton btnCalculator;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setResizable(false);
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.setBounds(100, 100, 390, 643);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);
		
		textFieldsScreen = new JTextField();
		textFieldsScreen.setEditable(false);
		textFieldsScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldsScreen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldsScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textFieldsScreen.setBounds(0, 60, 385, 89);
		frmHesapMakinesi.getContentPane().add(textFieldsScreen);
		textFieldsScreen.setColumns(10);
		JButton btnNewButton = new JButton("0");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldsScreen.setText(textFieldsScreen.getText()+"0");
			}
		});
		btnNewButton.setBounds(99, 512, 99, 99);
		frmHesapMakinesi.getContentPane().add(btnNewButton);
		
		btnCe = new JButton("=");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if (operator == "*") {
						num1 = Double.parseDouble(textFieldsScreen.getText());
						answer*=num1;
						textFieldsScreen.setText(Double.toString(answer));
						textFieldResult.setText(textFieldResult.getText()+num1);
						num1=1;
					}
					else if(operator=="/"){
						num1=Double.parseDouble(textFieldsScreen.getText());
						answer=answer/num1;
						textFieldsScreen.setText(Double.toString(answer));
						textFieldResult.setText(textFieldResult.getText()+num1);
						num1=1;
					}
					else if(operator=="+"){
						num1=Double.parseDouble(textFieldsScreen.getText());
						answer+=num1;
						textFieldsScreen.setText(Double.toString(answer));
						textFieldResult.setText(textFieldResult.getText()+num1);
						num1=1;
					}
					else if(operator=="-"){
						num1=Double.parseDouble(textFieldsScreen.getText());
						answer-=num1;
						textFieldsScreen.setText(Double.toString(answer));
						textFieldResult.setText(textFieldResult.getText()+num1);
						num1=1;
					}
				}catch(Exception e1) {
					if (operator == "*") {
						num1=1;
						answer*=num1;
						textFieldsScreen.setText(Double.toString(answer));
						answer=1;
					}
					else if(operator=="/"){
						num1=1;
						answer/=num1;
						textFieldsScreen.setText(Double.toString(answer));
					}
					else if(operator=="+"){
						num1=0;
						answer+=num1;
						textFieldsScreen.setText(Double.toString(answer));
					}
					else if(operator=="-"){
						num1=0;
						answer-=num1;
						textFieldsScreen.setText(Double.toString(answer));
					}
				}}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCe.setBounds(286, 512, 99, 99);
		frmHesapMakinesi.getContentPane().add(btnCe);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText("");
			textFieldResult.setText("");
			temp="";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnC.setBounds(0, 512, 99, 99);
		frmHesapMakinesi.getContentPane().add(btnC);
		
		button_2 = new JButton("÷");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Double.parseDouble(textFieldsScreen.getText());
					if(answer==0&&counter==0) {
						answer=num1/(answer+1);
						counter++;
					}
					else {
						num1=1;
						answer/=num1;
					}
					temp+=textFieldsScreen.getText()+"/";
					textFieldResult.setText(temp);
					textFieldsScreen.setText("");
					operator="/";
					num1=1;
					
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Gecerli Bir Sayi Giriniz...");
					}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.setBounds(286, 147, 99, 79);
		frmHesapMakinesi.getContentPane().add(button_2);
		
		button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"7");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_3.setBounds(0, 222, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_3);
		
		button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"8");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_4.setBounds(99, 222, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_4);
		
		button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"9");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_5.setBounds(194, 222, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_5);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				num2=Double.parseDouble(textFieldsScreen.getText());
			
				answer=num2*num1;
				temp+=textFieldsScreen.getText()+"*";
				textFieldResult.setText(temp);
				textFieldsScreen.setText("");
				operator="*";
				num1=1;
				
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Gecerli Bir Sayi Giriniz...");
				}
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnX.setBounds(286, 222, 99, 99);
		frmHesapMakinesi.getContentPane().add(btnX);
		
		button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"4");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_7.setBounds(0, 318, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_7);
		
		button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"5");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_8.setBounds(99, 318, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_8);
		
		button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"6");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_9.setBounds(194, 318, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_9);
		
		button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						num2=Double.parseDouble(textFieldsScreen.getText());
						num1=0;
						answer=num2-num1;
						temp+=textFieldsScreen.getText()+"-";
						textFieldResult.setText(temp);
						textFieldsScreen.setText("");
						operator="-";	
				}catch(Exception e1){
					textFieldsScreen.setText("-");
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_10.setBounds(286, 318, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_10);
		
		button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"2");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_12.setBounds(99, 416, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_12);
		
		button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"1");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_11.setBounds(0, 416, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_11);
		
		button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldsScreen.setText(textFieldsScreen.getText()+"3");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_13.setBounds(194, 416, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_13);
		
		button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
			num2=Double.parseDouble(textFieldsScreen.getText());
			num1=0;
			answer=num2+num1;
			temp+=textFieldsScreen.getText()+"+";
			textFieldResult.setText(temp);
			textFieldsScreen.setText("");
			operator="+";
			
			}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Gecerli Bir Sayi Giriniz...");
			}
			}
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_14.setBounds(286, 416, 99, 99);
		frmHesapMakinesi.getContentPane().add(button_14);
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(0, 0, 385, 63);
		frmHesapMakinesi.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldsScreen.setText(textFieldsScreen.getText()+".");
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBounds(194, 512, 99, 99);
		frmHesapMakinesi.getContentPane().add(button);
		
		btnCalculator = new JButton("DEL");
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textFieldsScreen.getText().length();
				int number = textFieldsScreen.getText().length()-1;
				String store;
				if(length>0) {
					StringBuilder back = new StringBuilder(textFieldsScreen.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textFieldsScreen.setText(store);
				}
			}
		});
		btnCalculator.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCalculator.setBounds(0, 147, 293, 79);
		frmHesapMakinesi.getContentPane().add(btnCalculator);
	}
}
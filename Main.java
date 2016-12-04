import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

import java.awt.GridLayout;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JPanel panel;
	private JButton button7;
	private JButton button9;
	private JButton buttonDiv;
	private JButton button4;
	private JButton button8;
	private JButton button6;
	private JButton buttonMult;
	private JButton button1;
	private JButton button5;
	private JButton button3;
	private JButton buttonMinus;
	private JButton button0;
	private JButton button2;
	private JButton buttonDecimal;
	private JButton buttonC;
	private JButton buttonPlus;
	private JPanel panel_2;
	private JButton buttonEquals;
	private double num1;
	private double num2;
	private double ans;
	private String equals;
	private String operator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(375, 300); 	//375, 300

		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(textField);
		textField.setColumns(29);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		button7 = new JButton("7");
		panel.add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button7.getText();
				textField.setText(enterNumber);
			}
		});
		
		button8 = new JButton("8");
		panel.add(button8);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button8.getText();
				textField.setText(enterNumber);
			}
		});
		
		button9 = new JButton("9");
		panel.add(button9);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button9.getText();
				textField.setText(enterNumber);
			}
		});
		
		buttonDiv = new JButton("/");
		panel.add(buttonDiv);
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		
		button4 = new JButton("4");
		panel.add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button4.getText();
				textField.setText(enterNumber);
			}
		});
		
		button5 = new JButton("5");
		panel.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button5.getText();
				textField.setText(enterNumber);
			}
		});
		
		button6 = new JButton("6");
		panel.add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button6.getText();
				textField.setText(enterNumber);
			}
		});
		
		buttonMult = new JButton("*");
		panel.add(buttonMult);
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		
		button1 = new JButton("1");
		panel.add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button1.getText();
				textField.setText(enterNumber);
			}
		});
		
		button2 = new JButton("2");
		panel.add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button2.getText();
				textField.setText(enterNumber);
			}
		});
		
		button3 = new JButton("3");
		panel.add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button3.getText();
				textField.setText(enterNumber);
			}
		});
		
		buttonMinus = new JButton("-");
		panel.add(buttonMinus);
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		
		button0 = new JButton("0");
		panel.add(button0);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + button0.getText();
				textField.setText(enterNumber);
			}
		});
		
		buttonDecimal = new JButton(".");
		panel.add(buttonDecimal);
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + buttonDecimal.getText();
				textField.setText(enterNumber);
			}
		});
		
		buttonC = new JButton("C");
		panel.add(buttonC);
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		buttonPlus = new JButton("+");
		panel.add(buttonPlus);
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		buttonEquals = new JButton("=");
		panel_2.add(buttonEquals);
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//string equals = answer
				//double ans = result
				num2 = Double.parseDouble(textField.getText());
				
				if (operator == "+") {
					ans = num1 + num2;
					equals = Double.toString(ans);
					textField.setText(equals);
				}
				
				else if (operator == "-") {
					ans = num1 - num2;
					equals = Double.toString(ans);
					textField.setText(equals);
				}
				
				else if (operator == "*") {
					ans = num1 * num2;
					equals = Double.toString(ans);
					textField.setText(equals);
				}
				
				else if (operator == "/") {
					ans = num1 / num2;
					equals = Double.toString(ans);
					textField.setText(equals);
				}
			}
		});
	}

}

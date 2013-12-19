package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * This activity is used to do regular math expressions with integer and float
 * numbers....
 * 
 * @author Artak and Artush
 */

public class MainActivity extends Activity {

	// buttons on calculator
	Button one, two, tree, four, five, six, seven, eight, nine, zero, dot,
			plus, minus, div, mult, clear, equal;

	// string object, which will place values in EditText
	// widget
	String str = "";

	// math regular expression
	Character operator = 'q';

	// inserted numbers
	float num, tempNum;

	// a Edit text widget, where will enter numbers and show result
	EditText showResult;

	/**
	 * @brief - This function used to connect button click listeners to
	 *        calculator's buttons
	 * 
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// connecting to views
		one = (Button) findViewById(R.id.Button1);
		two = (Button) findViewById(R.id.Button2);
		tree = (Button) findViewById(R.id.Button3);
		four = (Button) findViewById(R.id.Button4);
		five = (Button) findViewById(R.id.Button5);
		six = (Button) findViewById(R.id.Button6);
		seven = (Button) findViewById(R.id.Button7);
		eight = (Button) findViewById(R.id.Button8);
		nine = (Button) findViewById(R.id.Button9);
		zero = (Button) findViewById(R.id.Button0);
		dot = (Button) findViewById(R.id.ButtonDot);
		plus = (Button) findViewById(R.id.ButtonPlus);
		minus = (Button) findViewById(R.id.ButtonMin);
		mult = (Button) findViewById(R.id.ButtonMult);
		div = (Button) findViewById(R.id.ButtonDiv);
		clear = (Button) findViewById(R.id.cButton);
		zero = (Button) findViewById(R.id.Button0);
		equal = (Button) findViewById(R.id.ButtonEqual);
		showResult = (EditText) findViewById(R.id.edit);

		/**
		 * @brief - This function is button 1 on calculator
		 * 
		 */
		one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("1");

			}
		});
		
		/**
		 * @brief - This function is button 2 on calculator
		 * 
		 */
		two.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("2");

			}
		});
		
		/**
		 * @brief - This function is button 3 on calculator
		 * 
		 */
		tree.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("3");

			}
		});
		
		/**
		 * @brief - This function is button 4 on calculator
		 * 
		 */
		four.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("4");

			}
		});
		
		/**
		 * @brief - This function is button 5 on calculator
		 * 
		 */

		five.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("5");

			}
		});
		
		/**
		 * @brief - This function is button 6 on calculator
		 * 
		 */
		six.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("6");

			}
		});
		
		/**
		 * @brief - This function is button 7 on calculator
		 * 
		 */
		seven.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("7");

			}
		});
		
		/**
		 * @brief - This function is button 8 on calculator
		 * 
		 */
		eight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("8");

			}
		});
		
		/**
		 * @brief - This function is button 9 on calculator
		 * 
		 */
		nine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("9");

			}
		});
		
		/**
		 * @brief - This function is button 0 on calculator
		 * 
		 */
		zero.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("0");

			}
		});

		/**
		 * @brief - This function is button "." on calculator
		 * 
		 */
		dot.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(".");
			}
		});

		
		/**
		 * @brief - This function is button "+" on calculator
		 * 
		 */
		plus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '+';
			}
		});
		
		/**
		 * @brief - This function is button "-" on calculator
		 * 
		 */
		minus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '-';
			}
		});
		
		/**
		 * @brief - This function is button "*" on calculator
		 * 
		 */
		mult.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '*';
			}
		});
		
		/**
		 * @brief - This function is button "/" on calculator
		 * 
		 */
		div.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '/';
			}
		});
		
		/**
		 * @brief - This function is button "=" on calculator
		 * 
		 */
		equal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				calculate();
			}
		});
		
		/**
		 * @brief - This function is button "c" on calculator
		 * 
		 */
		clear.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				reset();

			}
		});
	}

	/**
	 * @brief - This function reset values of all parameters
	 * 
	 */
	private void reset() {
		// TODO Auto-generated method stub
		str = "";
		operator = 'q';
		num = 0;
		tempNum = 0;
		showResult.setText("");
	}

	/**
	 * @brief - This function used to insert clicked numbers value to EditText
	 *        widget
	 * 
	 */
	private void insert(String i) {
		// TODO Auto-generated method stub
		str = str + i;
		num = Float.valueOf(str).floatValue();
		showResult.setText(str);

	}
	
	/**
	 * @brief - This function is perform inserted numbers and string 
	 * 
	 */
	private void perform() {
		// TODO Auto-generated method stub
		str = "";
		tempNum = num;
	}

	/**
	 * @brief - This function used to do regular math operations with typed
	 *        numbers
	 * 
	 */
	private void calculate() {
		// TODO Auto-generated method stub
		if (operator == '+')
			num = tempNum + num;
		else if (operator == '-')
			num = tempNum - num;
		else if (operator == '*')
			num = tempNum * num;
		else if (operator == '/')
			num = tempNum / num;
		if (operator == '/' && num == 0)
			reset();
		showResult.setText("" + num);
	}

}
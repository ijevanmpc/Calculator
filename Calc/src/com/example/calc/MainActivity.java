package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
* This activity is used to do regular math expressions with integer and float numbers....
* 
* @author Artak and Artush
*/

public class MainActivity extends Activity {
	Button one, two, tree, four, five, six, seven, eight, nine, zero, dot,
			plus, minus, div, mult, clear, equal;// buttons on calculator
	String str = ""; // string object, which will place values in EditText
						// widget
	Character operator = 'q';// math regular expression
	float num, tempNum;// inserted numbers
	EditText showResult;// a Edit text widget, where will enter numbers and show
						// result
	/**
	 * @brief - This function used to connect button click listeners to UI buttons
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

		
		one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("1");

			}
		});
		two.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("2");

			}
		});
		tree.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("3");

			}
		});
		four.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("4");

			}
		});
		five.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("5");

			}
		});
		six.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("6");

			}
		});
		seven.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("7");

			}
		});
		eight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("8");

			}
		});
		nine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("9");

			}
		});
		zero.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert("0");

			}
		});

		dot.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(".");
			}
		});

		plus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '+';
			}
		});
		minus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '-';
			}
		});
		mult.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '*';
			}
		});
		div.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				perform();
				operator = '/';
			}
		});
		equal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				calculate();
			}
		});
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
	 * @brief - This function used to insert clicked numbers value to EditText widget
	 * 
	 
	 */
	private void insert(String i) {
		// TODO Auto-generated method stub
		str = str + i;
		num = Float.valueOf(str).floatValue();
		showResult.setText(str);

	}

	private void perform() {
		// TODO Auto-generated method stub
		str = "";
		tempNum = num;
	}
	/**
	 * @brief - This function used to do regular math operations with typed numbers
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
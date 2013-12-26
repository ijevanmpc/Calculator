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
	Button one, two, tree, four, five, six, seven, eight, nine, zero, dot,
			plus, minus, div, mult, clear, equal;
	String str = "";
	Character operator = 'q';
	float num, tempNum;
	EditText showResult;

	private void initButtons() {
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
	}

	private void setListeners() {
		one.setOnClickListener(onClickListener);
		two.setOnClickListener(onClickListener);
		tree.setOnClickListener(onClickListener);
		four.setOnClickListener(onClickListener);
		five.setOnClickListener(onClickListener);
		six.setOnClickListener(onClickListener);
		seven.setOnClickListener(onClickListener);
		eight.setOnClickListener(onClickListener);
		nine.setOnClickListener(onClickListener);
		zero.setOnClickListener(onClickListener);
		dot.setOnClickListener(onClickListener);
		plus.setOnClickListener(onClickListener);
		minus.setOnClickListener(onClickListener);
		div.setOnClickListener(onClickListener);
		equal.setOnClickListener(onClickListener);
		clear.setOnClickListener(onClickListener);
	}

	private OnClickListener onClickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.Button1:
				insert("1");
				break;
			case R.id.Button2:
				insert("2");
				break;
			case R.id.Button3:
				insert("3");
				break;
			case R.id.Button4:
				insert("4");
				break;
			case R.id.Button5:
				insert("5");
				break;
			case R.id.Button6:
				insert("6");
				break;
			case R.id.Button7:
				insert("7");
				break;
			case R.id.Button8:
				insert("8");
				break;
			case R.id.Button9:
				insert("9");
				break;
			case R.id.Button0:
				insert("0");
				break;
			case R.id.ButtonDot:
				insert(".");
				break;
			case R.id.ButtonDiv:
				perform();
				operator = '/';
				break;
			case R.id.ButtonEqual:
				calculate();
				break;
			case R.id.ButtonMin:
				perform();
				operator = '-';
				break;
			case R.id.ButtonMult:
				perform();
				operator = '*';
				break;
			case R.id.ButtonPlus:
				perform();
				operator = '+';
				break;

			default:
				break;
			}

		}
	};

	/**
	 * @brief - This function used to connect button click listeners to UI
	 *        buttons
	 * 
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initButtons();
		setListeners();
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
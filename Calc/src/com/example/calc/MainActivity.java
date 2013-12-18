package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button one, two, tree, four, five, six, seven, eight, nine, zero, plus,
			minus, div, mult, clear, equal;// buttons on calculator
	String str = "";
	EditText disp;
	Character operator = 'q';
	double i, num, tempNum;
	EditText showResult;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

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
		plus = (Button) findViewById(R.id.ButtonPlus);
		minus = (Button) findViewById(R.id.ButtonMin);
		mult = (Button) findViewById(R.id.ButtonMult);
		div = (Button) findViewById(R.id.ButtonDiv);
		clear = (Button) findViewById(R.id.cButton);
		equal = (Button) findViewById(R.id.ButtonEqual);
		showResult = (EditText) findViewById(R.id.edit);

		one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(1);

			}
		});
		two.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(2);

			}
		});
		tree.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(3);

			}
		});
		four.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(4);

			}
		});
		five.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(5);

			}
		});
		six.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(6);

			}
		});
		seven.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(7);

			}
		});
		eight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(8);

			}
		});
		nine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				insert(9);

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


	public void btnclearClicked(View v) {
		reset();
	}

	private void reset() {
		// TODO Auto-generated method stub
		str = "";
		operator = 'q';
		num = 0;
		tempNum = 0;
		showResult.setText("");
	}

	private void insert(int j) {
		// TODO Auto-generated method stub
		str = str + Integer.toString(j);
		num = Integer.valueOf(str).intValue();
		showResult.setText(str);

	}

	private void perform() {
		// TODO Auto-generated method stub
		str = "";
		tempNum = num;
	}

	private void calculate() {
		// TODO Auto-generated method stub
		if (operator == '+')
			num = tempNum + num;
		else if (operator == '-')
			num = tempNum - num;
		else if (operator == '/')
			num = tempNum / num;
		else if (operator == '*')
			num = tempNum * num;
		showResult.setText("" + num);
	}

}

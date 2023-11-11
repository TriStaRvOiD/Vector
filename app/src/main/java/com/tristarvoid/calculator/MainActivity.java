package com.tristarvoid.calculator;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.HapticFeedbackConstants;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {
    Button btn0;
    Button btn00;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnClear;
    Button btnPercent;
    Button btnDivision;
    Button btnMultiply;
    Button btnMinus;
    Button btnPlus;
    Button btnEqual;
    Button btnDot;
    Button btnDelete;
    TextView tvOutput, tvInput;
    String process;
    Toolbar toolbar;
    boolean checkDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn00 = findViewById(R.id.btn00);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnClear = findViewById(R.id.btnClear);
        btnDelete = findViewById(R.id.btnDelete);
        btnPercent = findViewById(R.id.btnPercent);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        toolbar = findViewById(R.id.toolbar);

        tvInput.setMovementMethod(new ScrollingMovementMethod());

        btnClear.setOnClickListener(v -> {
            btnClear.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            tvInput.setText("");
            tvOutput.setText("");
            checkDot = false;
        });

        btn0.setOnClickListener(v -> {
            btn0.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "0");
        });

        btn00.setOnClickListener(v -> {
            btn00.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "00");
        });

        btn1.setOnClickListener(v -> {
            btn1.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "1");
        });

        btn2.setOnClickListener(v -> {
            btn2.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "2");
        });

        btn3.setOnClickListener(v -> {
            btn3.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "3");
        });

        btn4.setOnClickListener(v -> {
            btn4.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "4");
        });

        btn5.setOnClickListener(v -> {
            btn5.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "5");
        });

        btn6.setOnClickListener(v -> {
            btn6.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "6");
        });

        btn7.setOnClickListener(v -> {
            btn7.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "7");
        });

        btn8.setOnClickListener(v -> {
            btn8.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "8");
        });

        btn9.setOnClickListener(v -> {
            btn9.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "9");
        });

        btnPlus.setOnClickListener(v -> {
            btnPlus.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "+");
        });

        btnMinus.setOnClickListener(v -> {
            btnMinus.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "-");
        });

        btnMultiply.setOnClickListener(v -> {
            btnMultiply.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "×");
        });

        btnDivision.setOnClickListener(v -> {
            btnDivision.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "÷");
        });

        btnDot.setOnClickListener(v -> {
            if (!checkDot) {
                btnDot.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                process = tvInput.getText().toString();
                tvInput.setText(process + ".");
                checkDot = true;
            }
        });

        btnPercent.setOnClickListener(v -> {
            btnPercent.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
            process = tvInput.getText().toString();
            tvInput.setText(process + "%");
        });

        btnDelete.setOnClickListener(v -> {
            if (tvInput.getText() != null && tvInput.getText().length() > 0) {
                btnDelete.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                tvInput.setText(tvInput.getText().subSequence(0, tvInput.getText().length() - 1));
            }
        });

        btnEqual.setOnClickListener(v -> {
            CharSequence value = tvInput.getText();
            if (value != null && value.length() > 0) {
                btnEqual.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                Expression expression = new Expression(value.toString());
                double result = expression.calculate();
                tvOutput.setText(Double.toString(result));
            }
        });
    }
}
package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewFlipper viewFlipper = findViewById(R.id.viewFlipper);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);

        viewFlipper.setFlipInterval(5000);
        checkBox.setText(R.string.terms_of_use_checkbox);
        button.setText(R.string.continue_button);

        viewFlipper.startFlipping();

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked())
                {
                    button.setEnabled(true);
                }
                else
                {
                    button.setEnabled(false);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
//() I agree with Terms of Use and Privacy Policy, and consent to the processing of the Personal Data that I have provided
       // () Я соглашаюсь с Условиями Использования и Политикой Конфиденциальности и даю согласие на обработку предоставленных мною Персональных Данных
        //() Я згоден з Умовами Використання та Політикою Конфіденційності та даю згоду на обробку наданих мною Персональних Даних
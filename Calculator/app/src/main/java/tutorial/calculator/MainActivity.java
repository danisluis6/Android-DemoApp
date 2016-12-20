package tutorial.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText enterNumber;
    private EditText showNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        enterNumber = (EditText)this.findViewById(R.id.enterNumber);
        enterNumber.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Medium"));

        showNumber = (EditText)this.findViewById(R.id.showNumber);
        showNumber.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Black"));
    }

    private void configuras() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}

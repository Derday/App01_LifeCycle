package cz.spse.app01_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private ConstraintLayout mCoLayout;

    private boolean mSwitch;
    private static final String MY_TAG = "my_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mz code

        Log.i(MY_TAG, "beyici metoda onCreat()");
        //
    }
}
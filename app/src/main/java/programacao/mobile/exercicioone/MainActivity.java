package programacao.mobile.exercicioone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.Soma);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv= (TextView) findViewById(R.id.textView);
                tv.setText("Resultado...");
            }

        });
    }
}
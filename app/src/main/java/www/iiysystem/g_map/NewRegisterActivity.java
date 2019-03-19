package www.iiysystem.g_map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_register);

        Button btnNewReg;
        btnNewReg = findViewById(R.id.btnNewReg);

        btnNewReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewRegisterActivity.this, "You are now Registered",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

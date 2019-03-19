package www.iiysystem.g_map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnLogin;
        TextView forgotPass;
        TextView newReg;
        btnLogin = findViewById(R.id.btnLogin);
        forgotPass = findViewById(R.id.forgotPass);
        newReg = findViewById(R.id.newReg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this , NavigationActivity.class);
                startActivity(i);
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this , ForgotPassActivity.class);
                startActivity(i);
            }
        });

        newReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this , NewRegisterActivity.class);
                startActivity(i);
            }
        });

    }
}

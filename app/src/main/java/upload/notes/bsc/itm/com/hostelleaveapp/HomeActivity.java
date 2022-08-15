package upload.notes.bsc.itm.com.hostelleaveapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {
Button btnadd,btnrequest,btnstatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnadd=findViewById(R.id.btnAdd);
        btnrequest=findViewById(R.id.btnRequest);
        btnstatus=findViewById(R.id.btnStatus);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,FillFormActivity.class));
            }
        });
        btnrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,LeaveRequestActivity.class));
            }
        });
        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,LeaveStatusActivity.class));
            }
        });
    }
}

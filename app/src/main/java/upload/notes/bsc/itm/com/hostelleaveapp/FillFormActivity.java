package upload.notes.bsc.itm.com.hostelleaveapp;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FillFormActivity extends Activity {
EditText etname, etrollno, etbranch, etroomno, etGuardian, etGCell, etHome, etLGuardiaan,etLocal;
Button btnAdd;
SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_form);
        database=openOrCreateDatabase("student",MODE_PRIVATE,null);
        database.execSQL("create table if not exists details(name varchar(30),rollno varchar(10), branch varchar(10),roomno varchar(5),guardian varchar(30),gcell varchar(12),home varchar(50),localG varchar(30),localA varchar(50))");

        etname=findViewById(R.id.etName);
        etrollno=findViewById(R.id.etRollno);
        etbranch=findViewById(R.id.etBranch);
        etroomno=findViewById(R.id.etRoomno);
        etGuardian=findViewById(R.id.etGuardian);
        etGCell=findViewById(R.id.etGuardian_no);
        etHome=findViewById(R.id.etHomeAddress);
        etLGuardiaan=findViewById(R.id.etLocal);
        etLocal=findViewById(R.id.etLocalAddress);
        btnAdd=findViewById(R.id.btnAddDetails);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=etname.getText().toString();
                String rollno=etrollno.getText().toString();
                String branch=etbranch.getText().toString();
                String roomno=etroomno.getText().toString();
                String guardian=etGuardian.getText().toString();
                String gcell=etGCell.getText().toString();
                String home=etHome.getText().toString();
                String local=etLGuardiaan.getText().toString();
                String localA=etLocal.getText().toString();

                database.execSQL("insert into details values('"+name+"','"+rollno+"','"+branch+"','"+roomno+"','"+guardian+"','"+gcell+"','"+home+"','"+local+"','"+localA+"')");
                database.close();
                Toast.makeText(getApplicationContext(),"Data added successfully.",Toast.LENGTH_LONG).show();
                etname.setText("");
                etrollno.setText("");
                etbranch.setText("");
                etroomno.setText("");
                etGuardian.setText("");
                etGCell.setText("");
                etHome.setText("");
                etLGuardiaan.setText("");
                etLocal.setText("");

            }
        });

    }

}

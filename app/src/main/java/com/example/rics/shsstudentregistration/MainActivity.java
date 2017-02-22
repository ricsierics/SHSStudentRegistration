package com.example.rics.shsstudentregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spnprogram;
    private EditText _edtlastname, _edtfirstname, _edtmiddlename;
    private RadioButton _rbtnmale;
    private CheckBox _cboxreq1, _cboxreq2, _cboxreq3, _cboxreq4;
    private Button _btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spnprogram = (Spinner) this.findViewById(R.id.spn_program);
        _edtlastname = (EditText) this.findViewById(R.id.edt_lastname);
        _edtfirstname = (EditText) this.findViewById(R.id.edt_firstname);
        _edtmiddlename = (EditText) this.findViewById(R.id.edt_middlename);
        _rbtnmale = (RadioButton) this.findViewById(R.id.rbtn_male);
        _cboxreq1 = (CheckBox) this.findViewById(R.id.cbox_req1);
        _cboxreq2 = (CheckBox) this.findViewById(R.id.cbox_req2);
        _cboxreq3 = (CheckBox) this.findViewById(R.id.cbox_req3);
        _cboxreq4 = (CheckBox) this.findViewById(R.id.cbox_req4);
        _btnSubmit = (Button) this.findViewById(R.id.btn_submit);

        _btnSubmit.setOnClickListener(btnSubmitHandler);

        List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("BSIT");
        spinnerArray.add("BSECE");
        spinnerArray.add("BSCOE");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _spnprogram.setAdapter(adapter);

    }

    View.OnClickListener btnSubmitHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Enrollee theEnrollee = new Enrollee();
            theEnrollee.set_program(_spnprogram.getSelectedItem().toString());
            theEnrollee.set_lastname(_edtlastname.getText().toString());
            theEnrollee.set_firstname(_edtfirstname.getText().toString());
            theEnrollee.set_middlename(_edtmiddlename.getText().toString());
            theEnrollee.set_isMale(_rbtnmale.isChecked());
            theEnrollee.set_hasReq1(_cboxreq1.isChecked());
            theEnrollee.set_hasReq2(_cboxreq2.isChecked());
            theEnrollee.set_hasReq3(_cboxreq3.isChecked());
            theEnrollee.set_hasReq4(_cboxreq4.isChecked());

            Intent myIntent = new Intent(MainActivity.this, SummaryActivity.class);
            myIntent.putExtra("passedObject", theEnrollee);
            startActivity(myIntent);
        }
    };
}

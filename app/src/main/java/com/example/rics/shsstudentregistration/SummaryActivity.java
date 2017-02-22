package com.example.rics.shsstudentregistration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    private TextView _txt_program, _txt_lastname, _txt_firstname, _txt_middlename, _txt_gender, _txt_requirements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        _txt_program = (TextView) this.findViewById(R.id.txt_program_summary);
        _txt_lastname = (TextView) this.findViewById(R.id.txt_lastname_summary);
        _txt_firstname = (TextView) this.findViewById(R.id.txt_firstname_summary);
        _txt_middlename = (TextView) this.findViewById(R.id.txt_middlename_summary);
        _txt_gender = (TextView) this.findViewById(R.id.txt_gender_summary);
        _txt_requirements = (TextView) this.findViewById(R.id.txt_requirement_summary);

        Enrollee theEnrollee = (Enrollee) getIntent().getSerializableExtra("passedObject");

        _txt_program.setText(theEnrollee.get_program());
        _txt_lastname.setText(theEnrollee.get_lastname());
        _txt_firstname.setText(theEnrollee.get_firstname());
        _txt_middlename.setText(theEnrollee.get_middlename());
        _txt_gender.setText(theEnrollee.is_isMale() ? "Male" : "Female");

        String enteredRequirements = "";

        if (theEnrollee.is_hasReq1())
            enteredRequirements = "Original Report Card (Form 138)";
        if (theEnrollee.is_hasReq2())
            enteredRequirements += "\nNSO copy of Birth Certificate";
        if (theEnrollee.is_hasReq3())
            enteredRequirements += "\nCertificate of Good Moral Character";
        if (theEnrollee.is_hasReq4())
            enteredRequirements += "\nCertification of Junior High School Completion";

        _txt_requirements.setText(enteredRequirements);

    }
}

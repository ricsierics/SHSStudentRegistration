package com.example.rics.shsstudentregistration;

import java.io.Serializable;

public class Enrollee implements Serializable {
    private String _program, _lastname, _firstname, _middlename;
    private boolean _isMale, _hasReq1, _hasReq2, _hasReq3, _hasReq4;

    public String get_program() {
        return _program;
    }

    public void set_program(String _program) {
        this._program = _program;
    }

    public String get_lastname() {
        return _lastname;
    }

    public void set_lastname(String _lastname) {
        this._lastname = _lastname;
    }

    public String get_firstname() {
        return _firstname;
    }

    public void set_firstname(String _firstname) {
        this._firstname = _firstname;
    }

    public String get_middlename() {
        return _middlename;
    }

    public void set_middlename(String _middlename) {
        this._middlename = _middlename;
    }

    public boolean is_isMale() {
        return _isMale;
    }

    public void set_isMale(boolean _isMale) {
        this._isMale = _isMale;
    }

    public boolean is_hasReq1() {
        return _hasReq1;
    }
    public boolean is_hasReq2() {
        return _hasReq2;
    }
    public boolean is_hasReq3() {
        return _hasReq3;
    }
    public boolean is_hasReq4() {
        return _hasReq4;
    }
    public void set_hasReq1(boolean _hasReq1) { this._hasReq1 = _hasReq1; }
    public void set_hasReq2(boolean _hasReq2) {
        this._hasReq2 = _hasReq2;
    }
    public void set_hasReq3(boolean _hasReq3) { this._hasReq3 = _hasReq3; }
    public void set_hasReq4(boolean _hasReq4) {
        this._hasReq4 = _hasReq4;
    }
}

package com.example.test2;

public class ReadWriteUserDetails {
    public String mobile, dob, gender;
    public String email, fullName;

    ReadWriteUserDetails(){};
    public ReadWriteUserDetails(String textDob, String textMobile, String textGender, String email, String fullName){
        this.mobile = textDob;
        this.dob = textDob;
        this.gender = textGender;
        this.email = email;
        this.fullName = fullName;
    }
}

package com.devteria.identity_service.dto.requesst;

import java.time.LocalDate;

public class UserUpdateRequest {

    private String password;
    private String fistname;
    private String lastname;
    private LocalDate Dob;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }
}

package com.devteria.identity_service.dto.requesst;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCraetionRequest {
    @Size(min = 3, message = "tên tài khoản ít nhất 3 ký tư")
    private String username;
    @Size(min = 8, message = "mật khẩu ít nhất có 8 ký tự")
    private String password;
    private String fistname;
    private String lastname;
    private LocalDate Dob;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

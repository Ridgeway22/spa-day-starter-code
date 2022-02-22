package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "please enter a name")
    @Size(min=5,max= 15)
    private String username;

    @Email(message = "PLease provide a valid email address")
    private String email;

    @NotEmpty(message="please add a 6min password")
    @Size(min=6 )
    private String password;
@NotNull(message = "passwords do not match")
    private String verifyPassword;
    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword() {
        if(!this.password.isEmpty() && (this.getVerifyPassword() != null) && !this.password.equals(this.getVerifyPassword())){
            verifyPassword = null;
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }
}

package com.example.nani.Util;


public class Singleton {
    String userType;
    Boolean LoggedIn;

    public Boolean getLoggedIn() {
        return LoggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        LoggedIn = loggedIn;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

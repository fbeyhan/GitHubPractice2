package com.geico.utilities;

import com.geico.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;

    public LoginPage loginPage() { //when you call login page it returns you object of login page
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}

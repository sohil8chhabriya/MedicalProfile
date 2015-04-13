package com.medical.profile.core.entities;

import com.medical.profile.core.entities.objects.UserType;

/**
 * Created by sohil chhabriya on 14-Apr-15.
 */
public class UserInfo {

    private String registrationDate;

    private String gender;
    private String weight;
    private String height;
    private Account accountInfo;
    private UserType userType;

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String dateOfRegistration) {
        this.registrationDate = dateOfRegistration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public UserType getUserType() {
        return userType;
    }

    public Account getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(Account accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}

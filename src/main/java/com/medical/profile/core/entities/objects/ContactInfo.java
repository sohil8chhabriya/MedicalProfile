package com.medical.profile.core.entities.objects;

/**
 * Created by sohil chhabriya on 14-Apr-15.
 */
public class ContactInfo {

    private int phone;
    private int emergencyPhoneNo;
    private String email;
    private String address;
    private String city;
    private String country;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmergencyPhoneNo() {
        return emergencyPhoneNo;
    }

    public void setEmergencyPhoneNo(int emergencyPhoneNo) {
        this.emergencyPhoneNo = emergencyPhoneNo;
    }
}

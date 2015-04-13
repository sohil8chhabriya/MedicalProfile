package com.medical.profile.core.entities;

import com.medical.profile.core.entities.objects.ContactInfo;

/**
 * Created by sohil chhabriya on 12-Apr-15.
 */
public class Account {
    private Long id;
    private String name;
    private String password;
    private ContactInfo contactInfo;
    private UserInfo userInfo;

    // todo create new entity for bloodGroup.
    private String bloodGroup;

    // todo create FamilyRelationship.

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}

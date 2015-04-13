package com.medical.profile.core.entities.objects;

/**
 * Created by sohil chhabriya on 14-Apr-15.
 */
public enum UserType {
    Doctor ("Doctor", 1),
    Patient ("Patient",2),
    Hospital ("Hospital", 3);

    private String displayName;
    private int userTypeId;

    UserType(String displayName, int userTypeId) {
        this.displayName = displayName;
        this.userTypeId = userTypeId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getUserTypeId() {
        return userTypeId;
    }
    //todo part of work here with adding functions which are required
}

package com.medical.profile.core.entities.objects;

/**
 * Created by sohil chhabriya on 14-Apr-15.
 */
public enum SpecializationInfo {
    spec1 ("spec1", 1),
    spec2 ("spec2", 2),
    spec3 ("spec3", 3),
    spec4 ("spec4", 4),
    spec5 ("spec5", 5),
    spec6 ("spec6", 6);

    private String specialization;
    private int specializationId;

    SpecializationInfo(String specialization, int id) {
        this.specialization = specialization;
        this.specializationId = id;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public String getSpecialization() {
        return specialization;
    }

}

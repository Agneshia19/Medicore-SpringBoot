package com.medicore.entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

   @Id
private Integer patientId;


@NotBlank(message = "Name is required")
private String name;

@Min(value = 0, message = "Age cannot be negative")
private Integer age;

@NotBlank(message = "Gender is required")
private String gender;

@NotBlank(message = "Phone number is required")
private String phoneNumber;

@NotBlank(message = "Blood group is required")
private String bloodGroup;

@NotBlank(message = "Address is required")
private String address;



    public Patient() {
    }

    public Patient(Integer patientId, String name, Integer age, String gender,
                   String phoneNumber, String bloodGroup, String address) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.address = address;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
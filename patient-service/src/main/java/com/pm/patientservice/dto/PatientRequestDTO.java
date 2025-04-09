package com.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jdk.jfr.MemoryAddress;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class PatientRequestDTO {

    @NotBlank
    @Size(max = 100 , message ="Name cannot exceed 100 character")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be the vaild")
    private String email;

    @NotBlank(message = "Adress is required")
    private String address;

    @NotBlank(message = "date of birth is required")
    private String dateOFBirth;

    @NotNull(message = "Resigter date is required")
    private String registeredDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}

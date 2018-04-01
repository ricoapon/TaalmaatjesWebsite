package com.apon.service.valueobject;

import com.apon.service.config.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.sql.Date;

public class VolunteerMatchValueObject {
    private VolunteerValueObject volunteerValueObject;
    private String externalIdentifier;
    private StudentValueObject studentValueObject;
    @JsonFormat(pattern = "dd-MM-yyyy") @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateStart;
    @JsonFormat(pattern = "dd-MM-yyyy") @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEnd;

    public VolunteerValueObject getVolunteerValueObject() {
        return volunteerValueObject;
    }

    public void setVolunteerValueObject(VolunteerValueObject volunteerValueObject) {
        this.volunteerValueObject = volunteerValueObject;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public StudentValueObject getStudentValueObject() {
        return studentValueObject;
    }

    public void setStudentValueObject(StudentValueObject studentValueObject) {
        this.studentValueObject = studentValueObject;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.apon.database.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentPojo implements Serializable {

    private static final long serialVersionUID = 942320037;

    private Integer studentid;
    private String  externalidentifier;
    private String  firstname;
    private String  insertion;
    private String  lastname;
    private String  sex;
    private Date    dateofbirth;
    private String  groupidentification;
    private Boolean hasquit;

    public StudentPojo() {}

    public StudentPojo(StudentPojo value) {
        this.studentid = value.studentid;
        this.externalidentifier = value.externalidentifier;
        this.firstname = value.firstname;
        this.insertion = value.insertion;
        this.lastname = value.lastname;
        this.sex = value.sex;
        this.dateofbirth = value.dateofbirth;
        this.groupidentification = value.groupidentification;
        this.hasquit = value.hasquit;
    }

    public StudentPojo(
        Integer studentid,
        String  externalidentifier,
        String  firstname,
        String  insertion,
        String  lastname,
        String  sex,
        Date    dateofbirth,
        String  groupidentification,
        Boolean hasquit
    ) {
        this.studentid = studentid;
        this.externalidentifier = externalidentifier;
        this.firstname = firstname;
        this.insertion = insertion;
        this.lastname = lastname;
        this.sex = sex;
        this.dateofbirth = dateofbirth;
        this.groupidentification = groupidentification;
        this.hasquit = hasquit;
    }

    public Integer getStudentid() {
        return this.studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getExternalidentifier() {
        return this.externalidentifier;
    }

    public void setExternalidentifier(String externalidentifier) {
        this.externalidentifier = externalidentifier;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getInsertion() {
        return this.insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateofbirth() {
        return this.dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGroupidentification() {
        return this.groupidentification;
    }

    public void setGroupidentification(String groupidentification) {
        this.groupidentification = groupidentification;
    }

    public Boolean getHasquit() {
        return this.hasquit;
    }

    public void setHasquit(Boolean hasquit) {
        this.hasquit = hasquit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StudentPojo other = (StudentPojo) obj;
        if (studentid == null) {
            if (other.studentid != null)
                return false;
        }
        else if (!studentid.equals(other.studentid))
            return false;
        if (externalidentifier == null) {
            if (other.externalidentifier != null)
                return false;
        }
        else if (!externalidentifier.equals(other.externalidentifier))
            return false;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        }
        else if (!firstname.equals(other.firstname))
            return false;
        if (insertion == null) {
            if (other.insertion != null)
                return false;
        }
        else if (!insertion.equals(other.insertion))
            return false;
        if (lastname == null) {
            if (other.lastname != null)
                return false;
        }
        else if (!lastname.equals(other.lastname))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        }
        else if (!sex.equals(other.sex))
            return false;
        if (dateofbirth == null) {
            if (other.dateofbirth != null)
                return false;
        }
        else if (!dateofbirth.equals(other.dateofbirth))
            return false;
        if (groupidentification == null) {
            if (other.groupidentification != null)
                return false;
        }
        else if (!groupidentification.equals(other.groupidentification))
            return false;
        if (hasquit == null) {
            if (other.hasquit != null)
                return false;
        }
        else if (!hasquit.equals(other.hasquit))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.studentid == null) ? 0 : this.studentid.hashCode());
        result = prime * result + ((this.externalidentifier == null) ? 0 : this.externalidentifier.hashCode());
        result = prime * result + ((this.firstname == null) ? 0 : this.firstname.hashCode());
        result = prime * result + ((this.insertion == null) ? 0 : this.insertion.hashCode());
        result = prime * result + ((this.lastname == null) ? 0 : this.lastname.hashCode());
        result = prime * result + ((this.sex == null) ? 0 : this.sex.hashCode());
        result = prime * result + ((this.dateofbirth == null) ? 0 : this.dateofbirth.hashCode());
        result = prime * result + ((this.groupidentification == null) ? 0 : this.groupidentification.hashCode());
        result = prime * result + ((this.hasquit == null) ? 0 : this.hasquit.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StudentPojo (");

        sb.append(studentid);
        sb.append(", ").append(externalidentifier);
        sb.append(", ").append(firstname);
        sb.append(", ").append(insertion);
        sb.append(", ").append(lastname);
        sb.append(", ").append(sex);
        sb.append(", ").append(dateofbirth);
        sb.append(", ").append(groupidentification);
        sb.append(", ").append(hasquit);

        sb.append(")");
        return sb.toString();
    }
}

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
public class VolunteerPojo implements Serializable {

    private static final long serialVersionUID = 197478984;

    private Integer volunteerid;
    private String  externalidentifier;
    private String  firstname;
    private String  insertion;
    private String  lastname;
    private Date    dateofbirth;
    private String  sex;
    private String  phonenumber;
    private String  mobilephonenumber;
    private String  email;
    private String  postalcode;
    private String  city;
    private String  streetname;
    private String  housenr;
    private String  log;
    private String  job;
    private Date    datetraining;
    private Boolean isclassassistant;
    private Boolean istaalmaatje;

    public VolunteerPojo() {}

    public VolunteerPojo(VolunteerPojo value) {
        this.volunteerid = value.volunteerid;
        this.externalidentifier = value.externalidentifier;
        this.firstname = value.firstname;
        this.insertion = value.insertion;
        this.lastname = value.lastname;
        this.dateofbirth = value.dateofbirth;
        this.sex = value.sex;
        this.phonenumber = value.phonenumber;
        this.mobilephonenumber = value.mobilephonenumber;
        this.email = value.email;
        this.postalcode = value.postalcode;
        this.city = value.city;
        this.streetname = value.streetname;
        this.housenr = value.housenr;
        this.log = value.log;
        this.job = value.job;
        this.datetraining = value.datetraining;
        this.isclassassistant = value.isclassassistant;
        this.istaalmaatje = value.istaalmaatje;
    }

    public VolunteerPojo(
        Integer volunteerid,
        String  externalidentifier,
        String  firstname,
        String  insertion,
        String  lastname,
        Date    dateofbirth,
        String  sex,
        String  phonenumber,
        String  mobilephonenumber,
        String  email,
        String  postalcode,
        String  city,
        String  streetname,
        String  housenr,
        String  log,
        String  job,
        Date    datetraining,
        Boolean isclassassistant,
        Boolean istaalmaatje
    ) {
        this.volunteerid = volunteerid;
        this.externalidentifier = externalidentifier;
        this.firstname = firstname;
        this.insertion = insertion;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.sex = sex;
        this.phonenumber = phonenumber;
        this.mobilephonenumber = mobilephonenumber;
        this.email = email;
        this.postalcode = postalcode;
        this.city = city;
        this.streetname = streetname;
        this.housenr = housenr;
        this.log = log;
        this.job = job;
        this.datetraining = datetraining;
        this.isclassassistant = isclassassistant;
        this.istaalmaatje = istaalmaatje;
    }

    public Integer getVolunteerid() {
        return this.volunteerid;
    }

    public void setVolunteerid(Integer volunteerid) {
        this.volunteerid = volunteerid;
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

    public Date getDateofbirth() {
        return this.dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMobilephonenumber() {
        return this.mobilephonenumber;
    }

    public void setMobilephonenumber(String mobilephonenumber) {
        this.mobilephonenumber = mobilephonenumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetname() {
        return this.streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getHousenr() {
        return this.housenr;
    }

    public void setHousenr(String housenr) {
        this.housenr = housenr;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getDatetraining() {
        return this.datetraining;
    }

    public void setDatetraining(Date datetraining) {
        this.datetraining = datetraining;
    }

    public Boolean getIsclassassistant() {
        return this.isclassassistant;
    }

    public void setIsclassassistant(Boolean isclassassistant) {
        this.isclassassistant = isclassassistant;
    }

    public Boolean getIstaalmaatje() {
        return this.istaalmaatje;
    }

    public void setIstaalmaatje(Boolean istaalmaatje) {
        this.istaalmaatje = istaalmaatje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final VolunteerPojo other = (VolunteerPojo) obj;
        if (volunteerid == null) {
            if (other.volunteerid != null)
                return false;
        }
        else if (!volunteerid.equals(other.volunteerid))
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
        if (dateofbirth == null) {
            if (other.dateofbirth != null)
                return false;
        }
        else if (!dateofbirth.equals(other.dateofbirth))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        }
        else if (!sex.equals(other.sex))
            return false;
        if (phonenumber == null) {
            if (other.phonenumber != null)
                return false;
        }
        else if (!phonenumber.equals(other.phonenumber))
            return false;
        if (mobilephonenumber == null) {
            if (other.mobilephonenumber != null)
                return false;
        }
        else if (!mobilephonenumber.equals(other.mobilephonenumber))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (postalcode == null) {
            if (other.postalcode != null)
                return false;
        }
        else if (!postalcode.equals(other.postalcode))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (streetname == null) {
            if (other.streetname != null)
                return false;
        }
        else if (!streetname.equals(other.streetname))
            return false;
        if (housenr == null) {
            if (other.housenr != null)
                return false;
        }
        else if (!housenr.equals(other.housenr))
            return false;
        if (log == null) {
            if (other.log != null)
                return false;
        }
        else if (!log.equals(other.log))
            return false;
        if (job == null) {
            if (other.job != null)
                return false;
        }
        else if (!job.equals(other.job))
            return false;
        if (datetraining == null) {
            if (other.datetraining != null)
                return false;
        }
        else if (!datetraining.equals(other.datetraining))
            return false;
        if (isclassassistant == null) {
            if (other.isclassassistant != null)
                return false;
        }
        else if (!isclassassistant.equals(other.isclassassistant))
            return false;
        if (istaalmaatje == null) {
            if (other.istaalmaatje != null)
                return false;
        }
        else if (!istaalmaatje.equals(other.istaalmaatje))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.volunteerid == null) ? 0 : this.volunteerid.hashCode());
        result = prime * result + ((this.externalidentifier == null) ? 0 : this.externalidentifier.hashCode());
        result = prime * result + ((this.firstname == null) ? 0 : this.firstname.hashCode());
        result = prime * result + ((this.insertion == null) ? 0 : this.insertion.hashCode());
        result = prime * result + ((this.lastname == null) ? 0 : this.lastname.hashCode());
        result = prime * result + ((this.dateofbirth == null) ? 0 : this.dateofbirth.hashCode());
        result = prime * result + ((this.sex == null) ? 0 : this.sex.hashCode());
        result = prime * result + ((this.phonenumber == null) ? 0 : this.phonenumber.hashCode());
        result = prime * result + ((this.mobilephonenumber == null) ? 0 : this.mobilephonenumber.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.postalcode == null) ? 0 : this.postalcode.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.streetname == null) ? 0 : this.streetname.hashCode());
        result = prime * result + ((this.housenr == null) ? 0 : this.housenr.hashCode());
        result = prime * result + ((this.log == null) ? 0 : this.log.hashCode());
        result = prime * result + ((this.job == null) ? 0 : this.job.hashCode());
        result = prime * result + ((this.datetraining == null) ? 0 : this.datetraining.hashCode());
        result = prime * result + ((this.isclassassistant == null) ? 0 : this.isclassassistant.hashCode());
        result = prime * result + ((this.istaalmaatje == null) ? 0 : this.istaalmaatje.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VolunteerPojo (");

        sb.append(volunteerid);
        sb.append(", ").append(externalidentifier);
        sb.append(", ").append(firstname);
        sb.append(", ").append(insertion);
        sb.append(", ").append(lastname);
        sb.append(", ").append(dateofbirth);
        sb.append(", ").append(sex);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(mobilephonenumber);
        sb.append(", ").append(email);
        sb.append(", ").append(postalcode);
        sb.append(", ").append(city);
        sb.append(", ").append(streetname);
        sb.append(", ").append(housenr);
        sb.append(", ").append(log);
        sb.append(", ").append(job);
        sb.append(", ").append(datetraining);
        sb.append(", ").append(isclassassistant);
        sb.append(", ").append(istaalmaatje);

        sb.append(")");
        return sb.toString();
    }
}

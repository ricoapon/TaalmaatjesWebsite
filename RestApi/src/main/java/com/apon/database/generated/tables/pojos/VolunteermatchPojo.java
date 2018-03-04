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
public class VolunteermatchPojo implements Serializable {

    private static final long serialVersionUID = -1622348498;

    private Integer volunteerid;
    private Integer volunteermatchid;
    private String  externalidentifier;
    private Integer studentid;
    private Date    datestart;
    private Date    dateend;

    public VolunteermatchPojo() {}

    public VolunteermatchPojo(VolunteermatchPojo value) {
        this.volunteerid = value.volunteerid;
        this.volunteermatchid = value.volunteermatchid;
        this.externalidentifier = value.externalidentifier;
        this.studentid = value.studentid;
        this.datestart = value.datestart;
        this.dateend = value.dateend;
    }

    public VolunteermatchPojo(
        Integer volunteerid,
        Integer volunteermatchid,
        String  externalidentifier,
        Integer studentid,
        Date    datestart,
        Date    dateend
    ) {
        this.volunteerid = volunteerid;
        this.volunteermatchid = volunteermatchid;
        this.externalidentifier = externalidentifier;
        this.studentid = studentid;
        this.datestart = datestart;
        this.dateend = dateend;
    }

    public Integer getVolunteerid() {
        return this.volunteerid;
    }

    public void setVolunteerid(Integer volunteerid) {
        this.volunteerid = volunteerid;
    }

    public Integer getVolunteermatchid() {
        return this.volunteermatchid;
    }

    public void setVolunteermatchid(Integer volunteermatchid) {
        this.volunteermatchid = volunteermatchid;
    }

    public String getExternalidentifier() {
        return this.externalidentifier;
    }

    public void setExternalidentifier(String externalidentifier) {
        this.externalidentifier = externalidentifier;
    }

    public Integer getStudentid() {
        return this.studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Date getDatestart() {
        return this.datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return this.dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VolunteermatchPojo (");

        sb.append(volunteerid);
        sb.append(", ").append(volunteermatchid);
        sb.append(", ").append(externalidentifier);
        sb.append(", ").append(studentid);
        sb.append(", ").append(datestart);
        sb.append(", ").append(dateend);

        sb.append(")");
        return sb.toString();
    }
}

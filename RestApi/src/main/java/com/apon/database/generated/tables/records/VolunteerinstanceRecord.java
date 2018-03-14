/*
 * This file is generated by jOOQ.
*/
package com.apon.database.generated.tables.records;


import com.apon.database.generated.tables.Volunteerinstance;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class VolunteerinstanceRecord extends UpdatableRecordImpl<VolunteerinstanceRecord> implements Record5<Integer, Integer, String, Date, Date> {

    private static final long serialVersionUID = -903720534;

    /**
     * Setter for <code>volunteerinstance.volunteerId</code>.
     */
    public void setVolunteerid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>volunteerinstance.volunteerId</code>.
     */
    public Integer getVolunteerid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>volunteerinstance.volunteerInstanceId</code>.
     */
    public void setVolunteerinstanceid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>volunteerinstance.volunteerInstanceId</code>.
     */
    public Integer getVolunteerinstanceid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>volunteerinstance.externalIdentifier</code>.
     */
    public void setExternalidentifier(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>volunteerinstance.externalIdentifier</code>.
     */
    public String getExternalidentifier() {
        return (String) get(2);
    }

    /**
     * Setter for <code>volunteerinstance.dateStart</code>.
     */
    public void setDatestart(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>volunteerinstance.dateStart</code>.
     */
    public Date getDatestart() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>volunteerinstance.dateEnd</code>.
     */
    public void setDateend(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>volunteerinstance.dateEnd</code>.
     */
    public Date getDateend() {
        return (Date) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Date, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Date, Date> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Volunteerinstance.VOLUNTEERINSTANCE.VOLUNTEERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Volunteerinstance.VOLUNTEERINSTANCE.VOLUNTEERINSTANCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Volunteerinstance.VOLUNTEERINSTANCE.EXTERNALIDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Volunteerinstance.VOLUNTEERINSTANCE.DATESTART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Volunteerinstance.VOLUNTEERINSTANCE.DATEEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getVolunteerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getVolunteerinstanceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExternalidentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDatestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getDateend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVolunteerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getVolunteerinstanceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExternalidentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDatestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getDateend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord value1(Integer value) {
        setVolunteerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord value2(Integer value) {
        setVolunteerinstanceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord value3(String value) {
        setExternalidentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord value4(Date value) {
        setDatestart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord value5(Date value) {
        setDateend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolunteerinstanceRecord values(Integer value1, Integer value2, String value3, Date value4, Date value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VolunteerinstanceRecord
     */
    public VolunteerinstanceRecord() {
        super(Volunteerinstance.VOLUNTEERINSTANCE);
    }

    /**
     * Create a detached, initialised VolunteerinstanceRecord
     */
    public VolunteerinstanceRecord(Integer volunteerid, Integer volunteerinstanceid, String externalidentifier, Date datestart, Date dateend) {
        super(Volunteerinstance.VOLUNTEERINSTANCE);

        set(0, volunteerid);
        set(1, volunteerinstanceid);
        set(2, externalidentifier);
        set(3, datestart);
        set(4, dateend);
    }
}

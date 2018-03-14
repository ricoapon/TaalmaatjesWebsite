/*
 * This file is generated by jOOQ.
*/
package com.apon.database.generated.tables;


import com.apon.database.generated.DefaultSchema;
import com.apon.database.generated.Indexes;
import com.apon.database.generated.Keys;
import com.apon.database.generated.tables.records.VolunteerinstanceRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Volunteerinstance extends TableImpl<VolunteerinstanceRecord> {

    private static final long serialVersionUID = -73844221;

    /**
     * The reference instance of <code>volunteerinstance</code>
     */
    public static final Volunteerinstance VOLUNTEERINSTANCE = new Volunteerinstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VolunteerinstanceRecord> getRecordType() {
        return VolunteerinstanceRecord.class;
    }

    /**
     * The column <code>volunteerinstance.volunteerId</code>.
     */
    public final TableField<VolunteerinstanceRecord, Integer> VOLUNTEERID = createField("volunteerId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>volunteerinstance.volunteerInstanceId</code>.
     */
    public final TableField<VolunteerinstanceRecord, Integer> VOLUNTEERINSTANCEID = createField("volunteerInstanceId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>volunteerinstance.externalIdentifier</code>.
     */
    public final TableField<VolunteerinstanceRecord, String> EXTERNALIDENTIFIER = createField("externalIdentifier", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>volunteerinstance.dateStart</code>.
     */
    public final TableField<VolunteerinstanceRecord, Date> DATESTART = createField("dateStart", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>volunteerinstance.dateEnd</code>.
     */
    public final TableField<VolunteerinstanceRecord, Date> DATEEND = createField("dateEnd", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>volunteerinstance</code> table reference
     */
    public Volunteerinstance() {
        this(DSL.name("volunteerinstance"), null);
    }

    /**
     * Create an aliased <code>volunteerinstance</code> table reference
     */
    public Volunteerinstance(String alias) {
        this(DSL.name(alias), VOLUNTEERINSTANCE);
    }

    /**
     * Create an aliased <code>volunteerinstance</code> table reference
     */
    public Volunteerinstance(Name alias) {
        this(alias, VOLUNTEERINSTANCE);
    }

    private Volunteerinstance(Name alias, Table<VolunteerinstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Volunteerinstance(Name alias, Table<VolunteerinstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VOLUNTEERINSTANCE_PRIMARY, Indexes.VOLUNTEERINSTANCE_VOIN_EXTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VolunteerinstanceRecord> getPrimaryKey() {
        return Keys.KEY_VOLUNTEERINSTANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VolunteerinstanceRecord>> getKeys() {
        return Arrays.<UniqueKey<VolunteerinstanceRecord>>asList(Keys.KEY_VOLUNTEERINSTANCE_PRIMARY, Keys.KEY_VOLUNTEERINSTANCE_VOIN_EXTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VolunteerinstanceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VolunteerinstanceRecord, ?>>asList(Keys.VOIN_VOLU_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Volunteerinstance as(String alias) {
        return new Volunteerinstance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Volunteerinstance as(Name alias) {
        return new Volunteerinstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Volunteerinstance rename(String name) {
        return new Volunteerinstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Volunteerinstance rename(Name name) {
        return new Volunteerinstance(name, null);
    }
}

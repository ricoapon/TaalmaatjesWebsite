/*
 * This file is generated by jOOQ.
*/
package com.apon.database.generated.tables;


import com.apon.database.generated.Indexes;
import com.apon.database.generated.Keys;
import com.apon.database.generated.Taalmaatjes;
import com.apon.database.generated.tables.records.VolunteermatchRecord;

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
public class Volunteermatch extends TableImpl<VolunteermatchRecord> {

    private static final long serialVersionUID = 634666475;

    /**
     * The reference instance of <code>taalmaatjes.volunteermatch</code>
     */
    public static final Volunteermatch VOLUNTEERMATCH = new Volunteermatch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VolunteermatchRecord> getRecordType() {
        return VolunteermatchRecord.class;
    }

    /**
     * The column <code>taalmaatjes.volunteermatch.volunteerId</code>.
     */
    public final TableField<VolunteermatchRecord, Integer> VOLUNTEERID = createField("volunteerId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>taalmaatjes.volunteermatch.volunteerMatchId</code>.
     */
    public final TableField<VolunteermatchRecord, Integer> VOLUNTEERMATCHID = createField("volunteerMatchId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>taalmaatjes.volunteermatch.externalIdentifier</code>.
     */
    public final TableField<VolunteermatchRecord, String> EXTERNALIDENTIFIER = createField("externalIdentifier", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>taalmaatjes.volunteermatch.studentId</code>.
     */
    public final TableField<VolunteermatchRecord, Integer> STUDENTID = createField("studentId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>taalmaatjes.volunteermatch.dateStart</code>.
     */
    public final TableField<VolunteermatchRecord, Date> DATESTART = createField("dateStart", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>taalmaatjes.volunteermatch.dateEnd</code>.
     */
    public final TableField<VolunteermatchRecord, Date> DATEEND = createField("dateEnd", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>taalmaatjes.volunteermatch</code> table reference
     */
    public Volunteermatch() {
        this(DSL.name("volunteermatch"), null);
    }

    /**
     * Create an aliased <code>taalmaatjes.volunteermatch</code> table reference
     */
    public Volunteermatch(String alias) {
        this(DSL.name(alias), VOLUNTEERMATCH);
    }

    /**
     * Create an aliased <code>taalmaatjes.volunteermatch</code> table reference
     */
    public Volunteermatch(Name alias) {
        this(alias, VOLUNTEERMATCH);
    }

    private Volunteermatch(Name alias, Table<VolunteermatchRecord> aliased) {
        this(alias, aliased, null);
    }

    private Volunteermatch(Name alias, Table<VolunteermatchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Taalmaatjes.TAALMAATJES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VOLUNTEERMATCH_PRIMARY, Indexes.VOLUNTEERMATCH_VOMA_EXTID, Indexes.VOLUNTEERMATCH_VOMA_STUD_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VolunteermatchRecord> getPrimaryKey() {
        return Keys.KEY_VOLUNTEERMATCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VolunteermatchRecord>> getKeys() {
        return Arrays.<UniqueKey<VolunteermatchRecord>>asList(Keys.KEY_VOLUNTEERMATCH_PRIMARY, Keys.KEY_VOLUNTEERMATCH_VOMA_EXTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VolunteermatchRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VolunteermatchRecord, ?>>asList(Keys.VOMA_VOLU_FK, Keys.VOMA_STUD_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Volunteermatch as(String alias) {
        return new Volunteermatch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Volunteermatch as(Name alias) {
        return new Volunteermatch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Volunteermatch rename(String name) {
        return new Volunteermatch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Volunteermatch rename(Name name) {
        return new Volunteermatch(name, null);
    }
}
/*
 * This file is generated by jOOQ.
*/
package com.apon.database.generated.tables;


import com.apon.database.generated.DefaultSchema;
import com.apon.database.generated.Indexes;
import com.apon.database.generated.Keys;
import com.apon.database.generated.tables.records.StudentRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = -183446440;

    /**
     * The reference instance of <code>student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>student.studentId</code>.
     */
    public final TableField<StudentRecord, Integer> STUDENTID = createField("studentId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>student.externalIdentifier</code>.
     */
    public final TableField<StudentRecord, String> EXTERNALIDENTIFIER = createField("externalIdentifier", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>student.firstName</code>.
     */
    public final TableField<StudentRecord, String> FIRSTNAME = createField("firstName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>student.insertion</code>.
     */
    public final TableField<StudentRecord, String> INSERTION = createField("insertion", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>student.lastName</code>.
     */
    public final TableField<StudentRecord, String> LASTNAME = createField("lastName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>student.gender</code>.
     */
    public final TableField<StudentRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>student.dateOfBirth</code>.
     */
    public final TableField<StudentRecord, Date> DATEOFBIRTH = createField("dateOfBirth", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>student.groupIdentification</code>.
     */
    public final TableField<StudentRecord, String> GROUPIDENTIFICATION = createField("groupIdentification", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>student.hasQuit</code>.
     */
    public final TableField<StudentRecord, Boolean> HASQUIT = createField("hasQuit", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    /**
     * Create an aliased <code>student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.STUDENT_PRIMARY, Indexes.STUDENT_STUD_EXTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.KEY_STUDENT_PRIMARY, Keys.KEY_STUDENT_STUD_EXTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }
}

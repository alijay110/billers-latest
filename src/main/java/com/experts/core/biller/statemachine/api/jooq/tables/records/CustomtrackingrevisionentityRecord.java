/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.Customtrackingrevisionentity;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomtrackingrevisionentityRecord extends UpdatableRecordImpl<CustomtrackingrevisionentityRecord> implements Record3<Integer, Long, String> {

    private static final long serialVersionUID = 899033403;

    /**
     * Setter for <code>public.customtrackingrevisionentity.customid</code>.
     */
    public void setCustomid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.customtrackingrevisionentity.customid</code>.
     */
    public Integer getCustomid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.customtrackingrevisionentity.customtimestamp</code>.
     */
    public void setCustomtimestamp(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.customtrackingrevisionentity.customtimestamp</code>.
     */
    public Long getCustomtimestamp() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.customtrackingrevisionentity.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.customtrackingrevisionentity.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY.CUSTOMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY.CUSTOMTIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCustomid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCustomtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCustomid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCustomtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomtrackingrevisionentityRecord value1(Integer value) {
        setCustomid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomtrackingrevisionentityRecord value2(Long value) {
        setCustomtimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomtrackingrevisionentityRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomtrackingrevisionentityRecord values(Integer value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomtrackingrevisionentityRecord
     */
    public CustomtrackingrevisionentityRecord() {
        super(Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY);
    }

    /**
     * Create a detached, initialised CustomtrackingrevisionentityRecord
     */
    public CustomtrackingrevisionentityRecord(Integer customid, Long customtimestamp, String username) {
        super(Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY);

        set(0, customid);
        set(1, customtimestamp);
        set(2, username);
    }
}

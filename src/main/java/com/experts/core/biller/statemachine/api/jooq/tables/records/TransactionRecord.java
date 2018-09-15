/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.Transaction;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record6<Long, Timestamp, Timestamp, String, Long, String> {

    private static final long serialVersionUID = -10534425;

    /**
     * Setter for <code>public.transaction.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.transaction.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.transaction.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.transaction.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.transaction.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.transaction.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.transaction.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.transaction.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.transaction.status_id</code>.
     */
    public void setStatusId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.transaction.status_id</code>.
     */
    public Long getStatusId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.transaction.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.transaction.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Timestamp, Timestamp, String, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Timestamp, Timestamp, String, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Transaction.TRANSACTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Transaction.TRANSACTION.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Transaction.TRANSACTION.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Transaction.TRANSACTION.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Transaction.TRANSACTION.STATUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Transaction.TRANSACTION.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getStatusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getStatusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value3(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value5(Long value) {
        setStatusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value6(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord values(Long value1, Timestamp value2, Timestamp value3, String value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, Long statusId, String lastmodifiedby) {
        super(Transaction.TRANSACTION);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, statusId);
        set(5, lastmodifiedby);
    }
}

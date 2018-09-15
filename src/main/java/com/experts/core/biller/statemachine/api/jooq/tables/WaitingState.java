/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.WaitingStateRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WaitingState extends TableImpl<WaitingStateRecord> {

    private static final long serialVersionUID = -513343956;

    /**
     * The reference instance of <code>public.waiting_state</code>
     */
    public static final WaitingState WAITING_STATE = new WaitingState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WaitingStateRecord> getRecordType() {
        return WaitingStateRecord.class;
    }

    /**
     * The column <code>public.waiting_state.id</code>.
     */
    public final TableField<WaitingStateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.createddate</code>.
     */
    public final TableField<WaitingStateRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.waiting_state.modifieddate</code>.
     */
    public final TableField<WaitingStateRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.waiting_state.username</code>.
     */
    public final TableField<WaitingStateRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.waiting_state.bank_code</code>.
     */
    public final TableField<WaitingStateRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.bill_code</code>.
     */
    public final TableField<WaitingStateRecord, String> BILL_CODE = createField("bill_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.bill_name</code>.
     */
    public final TableField<WaitingStateRecord, String> BILL_NAME = createField("bill_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.biller_code</code>.
     */
    public final TableField<WaitingStateRecord, String> BILLER_CODE = createField("biller_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.period</code>.
     */
    public final TableField<WaitingStateRecord, String> PERIOD = createField("period", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.transaction_id</code>.
     */
    public final TableField<WaitingStateRecord, String> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.waiting_ops_name</code>.
     */
    public final TableField<WaitingStateRecord, String> WAITING_OPS_NAME = createField("waiting_ops_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.process_id</code>.
     */
    public final TableField<WaitingStateRecord, Long> PROCESS_ID = createField("process_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.waiting_state.lastmodifiedby</code>.
     */
    public final TableField<WaitingStateRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.waiting_state</code> table reference
     */
    public WaitingState() {
        this(DSL.name("waiting_state"), null);
    }

    /**
     * Create an aliased <code>public.waiting_state</code> table reference
     */
    public WaitingState(String alias) {
        this(DSL.name(alias), WAITING_STATE);
    }

    /**
     * Create an aliased <code>public.waiting_state</code> table reference
     */
    public WaitingState(Name alias) {
        this(alias, WAITING_STATE);
    }

    private WaitingState(Name alias, Table<WaitingStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private WaitingState(Name alias, Table<WaitingStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WaitingState(Table<O> child, ForeignKey<O, WaitingStateRecord> key) {
        super(child, key, WAITING_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WAITING_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WaitingStateRecord> getPrimaryKey() {
        return Keys.WAITING_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WaitingStateRecord>> getKeys() {
        return Arrays.<UniqueKey<WaitingStateRecord>>asList(Keys.WAITING_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WaitingStateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WaitingStateRecord, ?>>asList(Keys.WAITING_STATE__FKJ0M5FENAYWMS4X4C4IWMD8PXU);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.WAITING_STATE__FKJ0M5FENAYWMS4X4C4IWMD8PXU);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingState as(String alias) {
        return new WaitingState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitingState as(Name alias) {
        return new WaitingState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitingState rename(String name) {
        return new WaitingState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitingState rename(Name name) {
        return new WaitingState(name, null);
    }
}

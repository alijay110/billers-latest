/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.InitialStateRecord;

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
public class InitialState extends TableImpl<InitialStateRecord> {

    private static final long serialVersionUID = 1024065183;

    /**
     * The reference instance of <code>public.initial_state</code>
     */
    public static final InitialState INITIAL_STATE = new InitialState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InitialStateRecord> getRecordType() {
        return InitialStateRecord.class;
    }

    /**
     * The column <code>public.initial_state.id</code>.
     */
    public final TableField<InitialStateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.initial_state.createddate</code>.
     */
    public final TableField<InitialStateRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.initial_state.modifieddate</code>.
     */
    public final TableField<InitialStateRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.initial_state.username</code>.
     */
    public final TableField<InitialStateRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.initial_state.bank_addrs</code>.
     */
    public final TableField<InitialStateRecord, String> BANK_ADDRS = createField("bank_addrs", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.initial_state.bank_code</code>.
     */
    public final TableField<InitialStateRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.bank_id</code>.
     */
    public final TableField<InitialStateRecord, String> BANK_ID = createField("bank_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.bank_name</code>.
     */
    public final TableField<InitialStateRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.bill_code</code>.
     */
    public final TableField<InitialStateRecord, String> BILL_CODE = createField("bill_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.billname</code>.
     */
    public final TableField<InitialStateRecord, String> BILLNAME = createField("billname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.biller_address</code>.
     */
    public final TableField<InitialStateRecord, String> BILLER_ADDRESS = createField("biller_address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.initial_state.biller_code</code>.
     */
    public final TableField<InitialStateRecord, String> BILLER_CODE = createField("biller_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.biller_name</code>.
     */
    public final TableField<InitialStateRecord, String> BILLER_NAME = createField("biller_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.client_id</code>.
     */
    public final TableField<InitialStateRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.service_used</code>.
     */
    public final TableField<InitialStateRecord, String> SERVICE_USED = createField("service_used", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.initial_state.lastmodifiedby</code>.
     */
    public final TableField<InitialStateRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.initial_state</code> table reference
     */
    public InitialState() {
        this(DSL.name("initial_state"), null);
    }

    /**
     * Create an aliased <code>public.initial_state</code> table reference
     */
    public InitialState(String alias) {
        this(DSL.name(alias), INITIAL_STATE);
    }

    /**
     * Create an aliased <code>public.initial_state</code> table reference
     */
    public InitialState(Name alias) {
        this(alias, INITIAL_STATE);
    }

    private InitialState(Name alias, Table<InitialStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private InitialState(Name alias, Table<InitialStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InitialState(Table<O> child, ForeignKey<O, InitialStateRecord> key) {
        super(child, key, INITIAL_STATE);
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
        return Arrays.<Index>asList(Indexes.INITIAL_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InitialStateRecord> getPrimaryKey() {
        return Keys.INITIAL_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InitialStateRecord>> getKeys() {
        return Arrays.<UniqueKey<InitialStateRecord>>asList(Keys.INITIAL_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialState as(String alias) {
        return new InitialState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InitialState as(Name alias) {
        return new InitialState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InitialState rename(String name) {
        return new InitialState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InitialState rename(Name name) {
        return new InitialState(name, null);
    }
}

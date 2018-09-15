/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.TxUserRecord;

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
public class TxUser extends TableImpl<TxUserRecord> {

    private static final long serialVersionUID = -935345522;

    /**
     * The reference instance of <code>public.tx_user</code>
     */
    public static final TxUser TX_USER = new TxUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TxUserRecord> getRecordType() {
        return TxUserRecord.class;
    }

    /**
     * The column <code>public.tx_user.id</code>.
     */
    public final TableField<TxUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tx_user.access_token</code>.
     */
    public final TableField<TxUserRecord, String> ACCESS_TOKEN = createField("access_token", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tx_user.account_non_expired</code>.
     */
    public final TableField<TxUserRecord, Boolean> ACCOUNT_NON_EXPIRED = createField("account_non_expired", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.tx_user.account_non_lockedd</code>.
     */
    public final TableField<TxUserRecord, Boolean> ACCOUNT_NON_LOCKEDD = createField("account_non_lockedd", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.tx_user.credential_non_expired</code>.
     */
    public final TableField<TxUserRecord, Boolean> CREDENTIAL_NON_EXPIRED = createField("credential_non_expired", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.tx_user.email</code>.
     */
    public final TableField<TxUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.tx_user.enabled</code>.
     */
    public final TableField<TxUserRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.tx_user.password</code>.
     */
    public final TableField<TxUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.tx_user.svn_access</code>.
     */
    public final TableField<TxUserRecord, Boolean> SVN_ACCESS = createField("svn_access", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.tx_user.time_zone</code>.
     */
    public final TableField<TxUserRecord, String> TIME_ZONE = createField("time_zone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tx_user.username</code>.
     */
    public final TableField<TxUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.tx_user</code> table reference
     */
    public TxUser() {
        this(DSL.name("tx_user"), null);
    }

    /**
     * Create an aliased <code>public.tx_user</code> table reference
     */
    public TxUser(String alias) {
        this(DSL.name(alias), TX_USER);
    }

    /**
     * Create an aliased <code>public.tx_user</code> table reference
     */
    public TxUser(Name alias) {
        this(alias, TX_USER);
    }

    private TxUser(Name alias, Table<TxUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TxUser(Name alias, Table<TxUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TxUser(Table<O> child, ForeignKey<O, TxUserRecord> key) {
        super(child, key, TX_USER);
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
        return Arrays.<Index>asList(Indexes.TX_USER_PKEY, Indexes.UK_JG7S0YYCVJC2VYMM802F4K4F5, Indexes.UKQGCJWGWCP8I0G7B1E73NOA5WF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TxUserRecord> getPrimaryKey() {
        return Keys.TX_USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TxUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TxUserRecord>>asList(Keys.TX_USER_PKEY, Keys.UK_JG7S0YYCVJC2VYMM802F4K4F5, Keys.UKQGCJWGWCP8I0G7B1E73NOA5WF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUser as(String alias) {
        return new TxUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUser as(Name alias) {
        return new TxUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TxUser rename(String name) {
        return new TxUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TxUser rename(Name name) {
        return new TxUser(name, null);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.Users__Record;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Users__ extends TableImpl<Users__Record> {

    private static final long serialVersionUID = 38654403;

    /**
     * The reference instance of <code>public.users__</code>
     */
    public static final Users__ USERS__ = new Users__();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Users__Record> getRecordType() {
        return Users__Record.class;
    }

    /**
     * The column <code>public.users__.id</code>.
     */
    public final TableField<Users__Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('users___id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.users__.enabled</code>.
     */
    public final TableField<Users__Record, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.users__.expired</code>.
     */
    public final TableField<Users__Record, Boolean> EXPIRED = createField("expired", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.users__.locked</code>.
     */
    public final TableField<Users__Record, Boolean> LOCKED = createField("locked", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.users__.password</code>.
     */
    public final TableField<Users__Record, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.users__.name</code>.
     */
    public final TableField<Users__Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.users__</code> table reference
     */
    public Users__() {
        this(DSL.name("users__"), null);
    }

    /**
     * Create an aliased <code>public.users__</code> table reference
     */
    public Users__(String alias) {
        this(DSL.name(alias), USERS__);
    }

    /**
     * Create an aliased <code>public.users__</code> table reference
     */
    public Users__(Name alias) {
        this(alias, USERS__);
    }

    private Users__(Name alias, Table<Users__Record> aliased) {
        this(alias, aliased, null);
    }

    private Users__(Name alias, Table<Users__Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users__(Table<O> child, ForeignKey<O, Users__Record> key) {
        super(child, key, USERS__);
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
        return Arrays.<Index>asList(Indexes.UK_DTVPUO1FEI1VU7FC46LVPP39N, Indexes.USERS___PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Users__Record, Long> getIdentity() {
        return Keys.IDENTITY_USERS__;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Users__Record> getPrimaryKey() {
        return Keys.USERS___PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Users__Record>> getKeys() {
        return Arrays.<UniqueKey<Users__Record>>asList(Keys.USERS___PKEY, Keys.UK_DTVPUO1FEI1VU7FC46LVPP39N);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users__ as(String alias) {
        return new Users__(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users__ as(Name alias) {
        return new Users__(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users__ rename(String name) {
        return new Users__(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users__ rename(Name name) {
        return new Users__(name, null);
    }
}

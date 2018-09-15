/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.RolesAuthRecord;

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
public class RolesAuth extends TableImpl<RolesAuthRecord> {

    private static final long serialVersionUID = -1198267194;

    /**
     * The reference instance of <code>public.roles_auth</code>
     */
    public static final RolesAuth ROLES_AUTH = new RolesAuth();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesAuthRecord> getRecordType() {
        return RolesAuthRecord.class;
    }

    /**
     * The column <code>public.roles_auth.id</code>.
     */
    public final TableField<RolesAuthRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.roles_auth.createddate</code>.
     */
    public final TableField<RolesAuthRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.roles_auth.modifieddate</code>.
     */
    public final TableField<RolesAuthRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.roles_auth.username</code>.
     */
    public final TableField<RolesAuthRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.roles_auth.auth</code>.
     */
    public final TableField<RolesAuthRecord, String> AUTH = createField("auth", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.roles_auth.lastmodifiedby</code>.
     */
    public final TableField<RolesAuthRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.roles_auth</code> table reference
     */
    public RolesAuth() {
        this(DSL.name("roles_auth"), null);
    }

    /**
     * Create an aliased <code>public.roles_auth</code> table reference
     */
    public RolesAuth(String alias) {
        this(DSL.name(alias), ROLES_AUTH);
    }

    /**
     * Create an aliased <code>public.roles_auth</code> table reference
     */
    public RolesAuth(Name alias) {
        this(alias, ROLES_AUTH);
    }

    private RolesAuth(Name alias, Table<RolesAuthRecord> aliased) {
        this(alias, aliased, null);
    }

    private RolesAuth(Name alias, Table<RolesAuthRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RolesAuth(Table<O> child, ForeignKey<O, RolesAuthRecord> key) {
        super(child, key, ROLES_AUTH);
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
        return Arrays.<Index>asList(Indexes.ROLES_AUTH_PKEY, Indexes.UK_SO8W80GEK2HHOIWQEUU6P8E6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RolesAuthRecord> getPrimaryKey() {
        return Keys.ROLES_AUTH_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolesAuthRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesAuthRecord>>asList(Keys.ROLES_AUTH_PKEY, Keys.UK_SO8W80GEK2HHOIWQEUU6P8E6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesAuth as(String alias) {
        return new RolesAuth(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesAuth as(Name alias) {
        return new RolesAuth(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesAuth rename(String name) {
        return new RolesAuth(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolesAuth rename(Name name) {
        return new RolesAuth(name, null);
    }
}
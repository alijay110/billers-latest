/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.Authorities__Record;

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
public class Authorities__ extends TableImpl<Authorities__Record> {

    private static final long serialVersionUID = -1246811155;

    /**
     * The reference instance of <code>public.authorities__</code>
     */
    public static final Authorities__ AUTHORITIES__ = new Authorities__();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Authorities__Record> getRecordType() {
        return Authorities__Record.class;
    }

    /**
     * The column <code>public.authorities__.id</code>.
     */
    public final TableField<Authorities__Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('authorities___id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.authorities__.authority</code>.
     */
    public final TableField<Authorities__Record, String> AUTHORITY = createField("authority", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.authorities__</code> table reference
     */
    public Authorities__() {
        this(DSL.name("authorities__"), null);
    }

    /**
     * Create an aliased <code>public.authorities__</code> table reference
     */
    public Authorities__(String alias) {
        this(DSL.name(alias), AUTHORITIES__);
    }

    /**
     * Create an aliased <code>public.authorities__</code> table reference
     */
    public Authorities__(Name alias) {
        this(alias, AUTHORITIES__);
    }

    private Authorities__(Name alias, Table<Authorities__Record> aliased) {
        this(alias, aliased, null);
    }

    private Authorities__(Name alias, Table<Authorities__Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Authorities__(Table<O> child, ForeignKey<O, Authorities__Record> key) {
        super(child, key, AUTHORITIES__);
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
        return Arrays.<Index>asList(Indexes.AUTHORITIES___PKEY, Indexes.UK_L880PICH4X4LVA4JWDQG5QTBR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Authorities__Record, Long> getIdentity() {
        return Keys.IDENTITY_AUTHORITIES__;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Authorities__Record> getPrimaryKey() {
        return Keys.AUTHORITIES___PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Authorities__Record>> getKeys() {
        return Arrays.<UniqueKey<Authorities__Record>>asList(Keys.AUTHORITIES___PKEY, Keys.UK_L880PICH4X4LVA4JWDQG5QTBR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authorities__ as(String alias) {
        return new Authorities__(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authorities__ as(Name alias) {
        return new Authorities__(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Authorities__ rename(String name) {
        return new Authorities__(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Authorities__ rename(Name name) {
        return new Authorities__(name, null);
    }
}

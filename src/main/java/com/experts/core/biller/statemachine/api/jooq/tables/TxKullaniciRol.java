/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.TxKullaniciRolRecord;

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
public class TxKullaniciRol extends TableImpl<TxKullaniciRolRecord> {

    private static final long serialVersionUID = -1891192466;

    /**
     * The reference instance of <code>public.tx_kullanici_rol</code>
     */
    public static final TxKullaniciRol TX_KULLANICI_ROL = new TxKullaniciRol();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TxKullaniciRolRecord> getRecordType() {
        return TxKullaniciRolRecord.class;
    }

    /**
     * The column <code>public.tx_kullanici_rol.id</code>.
     */
    public final TableField<TxKullaniciRolRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tx_kullanici_rol.role_id</code>.
     */
    public final TableField<TxKullaniciRolRecord, Long> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tx_kullanici_rol.user_id</code>.
     */
    public final TableField<TxKullaniciRolRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.tx_kullanici_rol</code> table reference
     */
    public TxKullaniciRol() {
        this(DSL.name("tx_kullanici_rol"), null);
    }

    /**
     * Create an aliased <code>public.tx_kullanici_rol</code> table reference
     */
    public TxKullaniciRol(String alias) {
        this(DSL.name(alias), TX_KULLANICI_ROL);
    }

    /**
     * Create an aliased <code>public.tx_kullanici_rol</code> table reference
     */
    public TxKullaniciRol(Name alias) {
        this(alias, TX_KULLANICI_ROL);
    }

    private TxKullaniciRol(Name alias, Table<TxKullaniciRolRecord> aliased) {
        this(alias, aliased, null);
    }

    private TxKullaniciRol(Name alias, Table<TxKullaniciRolRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TxKullaniciRol(Table<O> child, ForeignKey<O, TxKullaniciRolRecord> key) {
        super(child, key, TX_KULLANICI_ROL);
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
        return Arrays.<Index>asList(Indexes.TX_KULLANICI_ROL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TxKullaniciRolRecord> getPrimaryKey() {
        return Keys.TX_KULLANICI_ROL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TxKullaniciRolRecord>> getKeys() {
        return Arrays.<UniqueKey<TxKullaniciRolRecord>>asList(Keys.TX_KULLANICI_ROL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TxKullaniciRolRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TxKullaniciRolRecord, ?>>asList(Keys.TX_KULLANICI_ROL__FKJSJV5OO3OJOTN4B7FXMKHJK87, Keys.TX_KULLANICI_ROL__FKK3F8TSI5VN6W3QSRRK1YWG5QJ);
    }

    public TxRol txRol() {
        return new TxRol(this, Keys.TX_KULLANICI_ROL__FKJSJV5OO3OJOTN4B7FXMKHJK87);
    }

    public TxUser txUser() {
        return new TxUser(this, Keys.TX_KULLANICI_ROL__FKK3F8TSI5VN6W3QSRRK1YWG5QJ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxKullaniciRol as(String alias) {
        return new TxKullaniciRol(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxKullaniciRol as(Name alias) {
        return new TxKullaniciRol(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TxKullaniciRol rename(String name) {
        return new TxKullaniciRol(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TxKullaniciRol rename(Name name) {
        return new TxKullaniciRol(name, null);
    }
}

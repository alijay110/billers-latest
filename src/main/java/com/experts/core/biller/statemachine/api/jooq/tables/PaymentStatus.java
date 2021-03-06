/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.PaymentStatusRecord;

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
public class PaymentStatus extends TableImpl<PaymentStatusRecord> {

    private static final long serialVersionUID = 681394360;

    /**
     * The reference instance of <code>public.payment_status</code>
     */
    public static final PaymentStatus PAYMENT_STATUS = new PaymentStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentStatusRecord> getRecordType() {
        return PaymentStatusRecord.class;
    }

    /**
     * The column <code>public.payment_status.id</code>.
     */
    public final TableField<PaymentStatusRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(3072).nullable(false), this, "");

    /**
     * Create a <code>public.payment_status</code> table reference
     */
    public PaymentStatus() {
        this(DSL.name("payment_status"), null);
    }

    /**
     * Create an aliased <code>public.payment_status</code> table reference
     */
    public PaymentStatus(String alias) {
        this(DSL.name(alias), PAYMENT_STATUS);
    }

    /**
     * Create an aliased <code>public.payment_status</code> table reference
     */
    public PaymentStatus(Name alias) {
        this(alias, PAYMENT_STATUS);
    }

    private PaymentStatus(Name alias, Table<PaymentStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentStatus(Name alias, Table<PaymentStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PaymentStatus(Table<O> child, ForeignKey<O, PaymentStatusRecord> key) {
        super(child, key, PAYMENT_STATUS);
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
        return Arrays.<Index>asList(Indexes.PAYMENT_STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentStatusRecord> getPrimaryKey() {
        return Keys.PAYMENT_STATUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentStatusRecord>>asList(Keys.PAYMENT_STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentStatus as(String alias) {
        return new PaymentStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentStatus as(Name alias) {
        return new PaymentStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentStatus rename(String name) {
        return new PaymentStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentStatus rename(Name name) {
        return new PaymentStatus(name, null);
    }
}

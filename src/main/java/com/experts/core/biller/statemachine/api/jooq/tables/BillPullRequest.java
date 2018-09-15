/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.BillPullRequestRecord;

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
public class BillPullRequest extends TableImpl<BillPullRequestRecord> {

    private static final long serialVersionUID = 639307978;

    /**
     * The reference instance of <code>public.bill_pull_request</code>
     */
    public static final BillPullRequest BILL_PULL_REQUEST = new BillPullRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillPullRequestRecord> getRecordType() {
        return BillPullRequestRecord.class;
    }

    /**
     * The column <code>public.bill_pull_request.id</code>.
     */
    public final TableField<BillPullRequestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.createddate</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bill_pull_request.modifieddate</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bill_pull_request.username</code>.
     */
    public final TableField<BillPullRequestRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.acc_info</code>.
     */
    public final TableField<BillPullRequestRecord, String> ACC_INFO = createField("acc_info", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.address</code>.
     */
    public final TableField<BillPullRequestRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.bill_no</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILL_NO = createField("bill_no", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.billing_no</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILLING_NO = createField("billing_no", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.email</code>.
     */
    public final TableField<BillPullRequestRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.id_type</code>.
     */
    public final TableField<BillPullRequestRecord, String> ID_TYPE = createField("id_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.joebppsno</code>.
     */
    public final TableField<BillPullRequestRecord, String> JOEBPPSNO = createField("joebppsno", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.name</code>.
     */
    public final TableField<BillPullRequestRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.nation</code>.
     */
    public final TableField<BillPullRequestRecord, String> NATION = createField("nation", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.payer_info</code>.
     */
    public final TableField<BillPullRequestRecord, String> PAYER_INFO = createField("payer_info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.phone</code>.
     */
    public final TableField<BillPullRequestRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.service_type</code>.
     */
    public final TableField<BillPullRequestRecord, String> SERVICE_TYPE = createField("service_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.acc_no</code>.
     */
    public final TableField<BillPullRequestRecord, String> ACC_NO = createField("acc_no", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.allow_part</code>.
     */
    public final TableField<BillPullRequestRecord, String> ALLOW_PART = createField("allow_part", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.amount</code>.
     */
    public final TableField<BillPullRequestRecord, String> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.bank_code</code>.
     */
    public final TableField<BillPullRequestRecord, String> BANK_CODE = createField("bank_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.bill_rec</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILL_REC = createField("bill_rec", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.bill_status</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILL_STATUS = createField("bill_status", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.bill_type</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILL_TYPE = createField("bill_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.bills_rec</code>.
     */
    public final TableField<BillPullRequestRecord, String> BILLS_REC = createField("bills_rec", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.close_date</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> CLOSE_DATE = createField("close_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bill_pull_request.currency</code>.
     */
    public final TableField<BillPullRequestRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.due_anount</code>.
     */
    public final TableField<BillPullRequestRecord, String> DUE_ANOUNT = createField("due_anount", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.due_date</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> DUE_DATE = createField("due_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.error_code</code>.
     */
    public final TableField<BillPullRequestRecord, String> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.error_desc</code>.
     */
    public final TableField<BillPullRequestRecord, String> ERROR_DESC = createField("error_desc", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.expiry_date</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> EXPIRY_DATE = createField("expiry_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bill_pull_request.issue_date</code>.
     */
    public final TableField<BillPullRequestRecord, String> ISSUE_DATE = createField("issue_date", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.lower</code>.
     */
    public final TableField<BillPullRequestRecord, String> LOWER = createField("lower", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.open_date</code>.
     */
    public final TableField<BillPullRequestRecord, Timestamp> OPEN_DATE = createField("open_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.bill_pull_request.pmt_const</code>.
     */
    public final TableField<BillPullRequestRecord, String> PMT_CONST = createField("pmt_const", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.bill_pull_request.res_count</code>.
     */
    public final TableField<BillPullRequestRecord, String> RES_COUNT = createField("res_count", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.result</code>.
     */
    public final TableField<BillPullRequestRecord, String> RESULT = createField("result", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.erverity</code>.
     */
    public final TableField<BillPullRequestRecord, String> ERVERITY = createField("erverity", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.sub_pmt</code>.
     */
    public final TableField<BillPullRequestRecord, String> SUB_PMT = createField("sub_pmt", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.sub_pmts</code>.
     */
    public final TableField<BillPullRequestRecord, String> SUB_PMTS = createField("sub_pmts", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.upper</code>.
     */
    public final TableField<BillPullRequestRecord, String> UPPER = createField("upper", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.bill_pull_request.lastmodifiedby</code>.
     */
    public final TableField<BillPullRequestRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.bill_pull_request</code> table reference
     */
    public BillPullRequest() {
        this(DSL.name("bill_pull_request"), null);
    }

    /**
     * Create an aliased <code>public.bill_pull_request</code> table reference
     */
    public BillPullRequest(String alias) {
        this(DSL.name(alias), BILL_PULL_REQUEST);
    }

    /**
     * Create an aliased <code>public.bill_pull_request</code> table reference
     */
    public BillPullRequest(Name alias) {
        this(alias, BILL_PULL_REQUEST);
    }

    private BillPullRequest(Name alias, Table<BillPullRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillPullRequest(Name alias, Table<BillPullRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BillPullRequest(Table<O> child, ForeignKey<O, BillPullRequestRecord> key) {
        super(child, key, BILL_PULL_REQUEST);
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
        return Arrays.<Index>asList(Indexes.BILL_PULL_REQUEST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BillPullRequestRecord> getPrimaryKey() {
        return Keys.BILL_PULL_REQUEST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BillPullRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<BillPullRequestRecord>>asList(Keys.BILL_PULL_REQUEST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillPullRequest as(String alias) {
        return new BillPullRequest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillPullRequest as(Name alias) {
        return new BillPullRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BillPullRequest rename(String name) {
        return new BillPullRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BillPullRequest rename(Name name) {
        return new BillPullRequest(name, null);
    }
}

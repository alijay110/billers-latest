/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq;


import com.experts.core.biller.statemachine.api.jooq.tables.Authorities;
import com.experts.core.biller.statemachine.api.jooq.tables.Authorities__;
import com.experts.core.biller.statemachine.api.jooq.tables.BillCreationHistory;
import com.experts.core.biller.statemachine.api.jooq.tables.BillPullRequest;
import com.experts.core.biller.statemachine.api.jooq.tables.Billingcreation;
import com.experts.core.biller.statemachine.api.jooq.tables.CompletedState;
import com.experts.core.biller.statemachine.api.jooq.tables.Customer;
import com.experts.core.biller.statemachine.api.jooq.tables.Customtrackingrevisionentity;
import com.experts.core.biller.statemachine.api.jooq.tables.InitialState;
import com.experts.core.biller.statemachine.api.jooq.tables.InquiryBillCurrent;
import com.experts.core.biller.statemachine.api.jooq.tables.InquiryHistory;
import com.experts.core.biller.statemachine.api.jooq.tables.ModifiedEntity;
import com.experts.core.biller.statemachine.api.jooq.tables.PayState;
import com.experts.core.biller.statemachine.api.jooq.tables.Payment;
import com.experts.core.biller.statemachine.api.jooq.tables.PaymentStatus;
import com.experts.core.biller.statemachine.api.jooq.tables.Person;
import com.experts.core.biller.statemachine.api.jooq.tables.ProcessState;
import com.experts.core.biller.statemachine.api.jooq.tables.RolesAuth;
import com.experts.core.biller.statemachine.api.jooq.tables.Tasks;
import com.experts.core.biller.statemachine.api.jooq.tables.TasksVarible;
import com.experts.core.biller.statemachine.api.jooq.tables.Transaction;
import com.experts.core.biller.statemachine.api.jooq.tables.Transactionstatus;
import com.experts.core.biller.statemachine.api.jooq.tables.TxAccount;
import com.experts.core.biller.statemachine.api.jooq.tables.TxKullaniciRol;
import com.experts.core.biller.statemachine.api.jooq.tables.TxMenu;
import com.experts.core.biller.statemachine.api.jooq.tables.TxPage;
import com.experts.core.biller.statemachine.api.jooq.tables.TxRol;
import com.experts.core.biller.statemachine.api.jooq.tables.TxRolYetki;
import com.experts.core.biller.statemachine.api.jooq.tables.TxUser;
import com.experts.core.biller.statemachine.api.jooq.tables.TxYetki;
import com.experts.core.biller.statemachine.api.jooq.tables.UserAuthorities;
import com.experts.core.biller.statemachine.api.jooq.tables.Users;
import com.experts.core.biller.statemachine.api.jooq.tables.Users_;
import com.experts.core.biller.statemachine.api.jooq.tables.Users__;
import com.experts.core.biller.statemachine.api.jooq.tables.WaitingState;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.authorities</code>.
     */
    public static final Authorities AUTHORITIES = com.experts.core.biller.statemachine.api.jooq.tables.Authorities.AUTHORITIES;

    /**
     * The table <code>public.authorities__</code>.
     */
    public static final Authorities__ AUTHORITIES__ = com.experts.core.biller.statemachine.api.jooq.tables.Authorities__.AUTHORITIES__;

    /**
     * The table <code>public.bill_creation_history</code>.
     */
    public static final BillCreationHistory BILL_CREATION_HISTORY = com.experts.core.biller.statemachine.api.jooq.tables.BillCreationHistory.BILL_CREATION_HISTORY;

    /**
     * The table <code>public.bill_pull_request</code>.
     */
    public static final BillPullRequest BILL_PULL_REQUEST = com.experts.core.biller.statemachine.api.jooq.tables.BillPullRequest.BILL_PULL_REQUEST;

    /**
     * The table <code>public.billingcreation</code>.
     */
    public static final Billingcreation BILLINGCREATION = com.experts.core.biller.statemachine.api.jooq.tables.Billingcreation.BILLINGCREATION;

    /**
     * The table <code>public.completed_state</code>.
     */
    public static final CompletedState COMPLETED_STATE = com.experts.core.biller.statemachine.api.jooq.tables.CompletedState.COMPLETED_STATE;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = com.experts.core.biller.statemachine.api.jooq.tables.Customer.CUSTOMER;

    /**
     * The table <code>public.customtrackingrevisionentity</code>.
     */
    public static final Customtrackingrevisionentity CUSTOMTRACKINGREVISIONENTITY = com.experts.core.biller.statemachine.api.jooq.tables.Customtrackingrevisionentity.CUSTOMTRACKINGREVISIONENTITY;

    /**
     * The table <code>public.initial_state</code>.
     */
    public static final InitialState INITIAL_STATE = com.experts.core.biller.statemachine.api.jooq.tables.InitialState.INITIAL_STATE;

    /**
     * The table <code>public.inquiry_bill_current</code>.
     */
    public static final InquiryBillCurrent INQUIRY_BILL_CURRENT = com.experts.core.biller.statemachine.api.jooq.tables.InquiryBillCurrent.INQUIRY_BILL_CURRENT;

    /**
     * The table <code>public.inquiry_history</code>.
     */
    public static final InquiryHistory INQUIRY_HISTORY = com.experts.core.biller.statemachine.api.jooq.tables.InquiryHistory.INQUIRY_HISTORY;

    /**
     * The table <code>public.modified_entity</code>.
     */
    public static final ModifiedEntity MODIFIED_ENTITY = com.experts.core.biller.statemachine.api.jooq.tables.ModifiedEntity.MODIFIED_ENTITY;

    /**
     * The table <code>public.pay_state</code>.
     */
    public static final PayState PAY_STATE = com.experts.core.biller.statemachine.api.jooq.tables.PayState.PAY_STATE;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = com.experts.core.biller.statemachine.api.jooq.tables.Payment.PAYMENT;

    /**
     * The table <code>public.payment_status</code>.
     */
    public static final PaymentStatus PAYMENT_STATUS = com.experts.core.biller.statemachine.api.jooq.tables.PaymentStatus.PAYMENT_STATUS;

    /**
     * The table <code>public.person</code>.
     */
    public static final Person PERSON = com.experts.core.biller.statemachine.api.jooq.tables.Person.PERSON;

    /**
     * The table <code>public.process_state</code>.
     */
    public static final ProcessState PROCESS_STATE = com.experts.core.biller.statemachine.api.jooq.tables.ProcessState.PROCESS_STATE;

    /**
     * The table <code>public.roles_auth</code>.
     */
    public static final RolesAuth ROLES_AUTH = com.experts.core.biller.statemachine.api.jooq.tables.RolesAuth.ROLES_AUTH;

    /**
     * The table <code>public.tasks</code>.
     */
    public static final Tasks TASKS = com.experts.core.biller.statemachine.api.jooq.tables.Tasks.TASKS;

    /**
     * The table <code>public.tasks_varible</code>.
     */
    public static final TasksVarible TASKS_VARIBLE = com.experts.core.biller.statemachine.api.jooq.tables.TasksVarible.TASKS_VARIBLE;

    /**
     * The table <code>public.transaction</code>.
     */
    public static final Transaction TRANSACTION = com.experts.core.biller.statemachine.api.jooq.tables.Transaction.TRANSACTION;

    /**
     * The table <code>public.transactionstatus</code>.
     */
    public static final Transactionstatus TRANSACTIONSTATUS = com.experts.core.biller.statemachine.api.jooq.tables.Transactionstatus.TRANSACTIONSTATUS;

    /**
     * The table <code>public.tx_account</code>.
     */
    public static final TxAccount TX_ACCOUNT = com.experts.core.biller.statemachine.api.jooq.tables.TxAccount.TX_ACCOUNT;

    /**
     * The table <code>public.tx_kullanici_rol</code>.
     */
    public static final TxKullaniciRol TX_KULLANICI_ROL = com.experts.core.biller.statemachine.api.jooq.tables.TxKullaniciRol.TX_KULLANICI_ROL;

    /**
     * The table <code>public.tx_menu</code>.
     */
    public static final TxMenu TX_MENU = com.experts.core.biller.statemachine.api.jooq.tables.TxMenu.TX_MENU;

    /**
     * The table <code>public.tx_page</code>.
     */
    public static final TxPage TX_PAGE = com.experts.core.biller.statemachine.api.jooq.tables.TxPage.TX_PAGE;

    /**
     * The table <code>public.tx_rol</code>.
     */
    public static final TxRol TX_ROL = com.experts.core.biller.statemachine.api.jooq.tables.TxRol.TX_ROL;

    /**
     * The table <code>public.tx_rol_yetki</code>.
     */
    public static final TxRolYetki TX_ROL_YETKI = com.experts.core.biller.statemachine.api.jooq.tables.TxRolYetki.TX_ROL_YETKI;

    /**
     * The table <code>public.tx_user</code>.
     */
    public static final TxUser TX_USER = com.experts.core.biller.statemachine.api.jooq.tables.TxUser.TX_USER;

    /**
     * The table <code>public.tx_yetki</code>.
     */
    public static final TxYetki TX_YETKI = com.experts.core.biller.statemachine.api.jooq.tables.TxYetki.TX_YETKI;

    /**
     * The table <code>public.user_authorities</code>.
     */
    public static final UserAuthorities USER_AUTHORITIES = com.experts.core.biller.statemachine.api.jooq.tables.UserAuthorities.USER_AUTHORITIES;

    /**
     * The table <code>public.users</code>.
     */
    public static final Users USERS = com.experts.core.biller.statemachine.api.jooq.tables.Users.USERS;

    /**
     * The table <code>public.users_</code>.
     */
    public static final Users_ USERS_ = com.experts.core.biller.statemachine.api.jooq.tables.Users_.USERS_;

    /**
     * The table <code>public.users__</code>.
     */
    public static final Users__ USERS__ = com.experts.core.biller.statemachine.api.jooq.tables.Users__.USERS__;

    /**
     * The table <code>public.waiting_state</code>.
     */
    public static final WaitingState WAITING_STATE = com.experts.core.biller.statemachine.api.jooq.tables.WaitingState.WAITING_STATE;
}

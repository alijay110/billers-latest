package com.experts.core.biller.statemachine.api.model.domain.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Transaction extends AbstractEntity{



    @OneToMany(mappedBy = "transaction", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Payment> payments = new ArrayList<>();

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private TransactionStatus status;


    public Transaction() {
    }

    public Transaction(TransactionStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void addPayment(Payment payment) {
        payment.setTransaction(this);
        payments.add(payment);
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void waitingPay() {
        status.waitingPay();
    }

    public void paid() {
        status.paid();
    }

    public void cancelled() {
        status.cancelled();
    }

}
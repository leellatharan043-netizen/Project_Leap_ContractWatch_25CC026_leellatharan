package com.ContractWatch.Contract.Renewal.Reminder.Tracker.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="renewal_decisions")
public class RenewalDecision {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name ="contract_id",nullable=false)
    private Contract contract;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DecisionType decision;

    @Column(nullable = false)
    private LocalDate decisionDate;

    private LocalDate newEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public DecisionType getDecision() {
        return decision;
    }

    public void setDecision(DecisionType decision) {
        this.decision = decision;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    public LocalDate getNewEndDate() {
        return newEndDate;
    }

    public void setNewEndDate(LocalDate newEndDate) {
        this.newEndDate = newEndDate;
    }
}

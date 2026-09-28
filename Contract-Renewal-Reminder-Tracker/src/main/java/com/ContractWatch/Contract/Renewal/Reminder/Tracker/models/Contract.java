package com.ContractWatch.Contract.Renewal.Reminder.Tracker.models;

import jakarta.persistence.*;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="contracts")
public class Contract {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="vendor_id",nullable = false)
    private Vendor vendor;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private Integer renewalNoticePeriod;

    private String documentReference;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ContractStatus status = ContractStatus.ACTIVE;

    @OneToMany(mappedBy = "contract",cascade = CascadeType.ALL)
    private List<RenewalDecision>  renewalDecisions =new ArrayList<>();

    public Contract()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    public String getDocumentReference() {
        return documentReference;
    }

    public void setDocumentReference(String documentReference) {
        this.documentReference = documentReference;
    }

    public Integer getRenewalNoticePeriod() {
        return renewalNoticePeriod;
    }

    public void setRenewalNoticePeriod(Integer renewalNoticePeriod) {
        this.renewalNoticePeriod = renewalNoticePeriod;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}

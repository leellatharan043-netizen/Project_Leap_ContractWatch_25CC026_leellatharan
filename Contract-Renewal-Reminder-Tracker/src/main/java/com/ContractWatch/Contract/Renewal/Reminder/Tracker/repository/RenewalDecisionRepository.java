package com.ContractWatch.Contract.Renewal.Reminder.Tracker.repository;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.RenewalDecision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RenewalDecisionRepository extends JpaRepository<RenewalDecision,Long> {

    List<RenewalDecision> findByContractId(Long contractId);
}

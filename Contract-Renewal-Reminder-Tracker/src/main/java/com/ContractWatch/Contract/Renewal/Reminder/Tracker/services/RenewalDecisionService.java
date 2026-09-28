package com.ContractWatch.Contract.Renewal.Reminder.Tracker.services;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Contract;
import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.RenewalDecision;
import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Vendor;

import java.util.List;

public interface RenewalDecisionService {

    RenewalDecision createDecision(RenewalDecision decision);

    List<RenewalDecision> getAllDecisions();

    RenewalDecision getDecisionById(Long id);

    RenewalDecision updateDecision(Long id, RenewalDecision decision);

    void deleteDecision(Long id);

    List<RenewalDecision> getDecisionsForContract(Long contractId);

}

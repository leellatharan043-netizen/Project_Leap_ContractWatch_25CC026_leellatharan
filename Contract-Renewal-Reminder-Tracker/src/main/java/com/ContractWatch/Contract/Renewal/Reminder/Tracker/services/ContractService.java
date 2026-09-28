package com.ContractWatch.Contract.Renewal.Reminder.Tracker.services;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Contract;

import java.util.List;

public interface ContractService {

    Contract createContract(Contract contract);

    List<Contract> getAllContracts();

    Contract getContractById(Long id);

    Contract updateContract(Long id,Contract contract);

    void deleteContract(Long id);

    List<Contract> getContractsForRenewal();

    List<Contract> getContractsExpiringNext30Days();
}

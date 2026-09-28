package com.ContractWatch.Contract.Renewal.Reminder.Tracker.repository;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Contract;
import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.ContractStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContractRepository extends JpaRepository<Contract,Long> {

    List<Contract> findByStatusAndEndDateBetween(
            ContractStatus status,
            LocalDate startDate,
            LocalDate endDate
    );
}

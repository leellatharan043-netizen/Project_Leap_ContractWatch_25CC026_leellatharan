package com.ContractWatch.Contract.Renewal.Reminder.Tracker.repository;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}

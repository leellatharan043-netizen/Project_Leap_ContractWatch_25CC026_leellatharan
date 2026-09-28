package com.ContractWatch.Contract.Renewal.Reminder.Tracker.services;

import com.ContractWatch.Contract.Renewal.Reminder.Tracker.models.Vendor;

import java.util.List;

public interface VendorService {

    Vendor createVendor(Vendor vendor);

    List<Vendor> getAllVendors();

    Vendor getVendorById(Long id);

    Vendor updateVendor(Long id,Vendor vendor);

    void deleteVendor(Long id);
}

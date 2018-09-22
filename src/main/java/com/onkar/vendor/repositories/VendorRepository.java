package com.onkar.vendor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onkar.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}

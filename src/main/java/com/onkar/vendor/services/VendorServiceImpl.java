package com.onkar.vendor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onkar.vendor.entities.Vendor;
import com.onkar.vendor.repositories.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void deletevendor(Vendor vendor) {
		vendorRepository.delete(vendor);
	}

	@Override
	public Vendor getVendorByID(int id) {
		return vendorRepository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}

	public VendorRepository getVendorRepository() {
		return vendorRepository;
	}

	public void setVendorRepository(VendorRepository vendorRepository) {
		this.vendorRepository = vendorRepository;
	}
	
	

}

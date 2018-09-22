package com.onkar.vendor.services;

import java.util.List;

import com.onkar.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deletevendor(Vendor vendor);
	Vendor getVendorByID(int id);
	List<Vendor> getAllVendors();
	

}

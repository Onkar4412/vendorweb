package com.onkar.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onkar.vendor.entities.Vendor;
import com.onkar.vendor.repositories.VendorRepository;

@RestController
@RequestMapping("/vendors")
public class VendorRESTController {

	@Autowired
	private VendorRepository vendorRepository;
	
	@GetMapping
	public List<Vendor> getAllVendors(){
		return vendorRepository.findAll();
	}
	
	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@PutMapping
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVendor(@PathVariable int id) {
		vendorRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Vendor getVendor(@PathVariable int id) {
		return vendorRepository.getOne(id);
	}
}

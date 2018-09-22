package com.onkar.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onkar.vendor.entities.Vendor;
import com.onkar.vendor.services.VendorService;

@Controller
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVend")
	public String saveVendor(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap) {
		Vendor vendorSaved = vendorService.saveVendor(vendor);
		String message = "Vendor saved at: "+vendorSaved.getId();
		modelMap.addAttribute("message", message);
		return "createVendor";
	}
	
	@RequestMapping("/displayVendor")
	public String displayVendors(ModelMap modelMap) {
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id")int id, ModelMap modelMap) {
		Vendor vendor = new Vendor();
		vendor.setId(id);
		vendorService.deletevendor(vendor);
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id")int id, ModelMap modelMap) {
		Vendor vendor = vendorService.getVendorByID(id);
		modelMap.addAttribute("vendor", vendor);
		return"updateVendor";
	}
	@RequestMapping("/updateVend")
	public String updateVendor(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap) {
		vendorService.updateVendor(vendor);
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}
	
	
}

package com.marketingA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingA.entities.Billing;
import com.marketingA.entities.Contact;
import com.marketingA.entities.Lead;
import com.marketingA.services.BillingService;
import com.marketingA.services.ContactService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getOneContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill,ModelMap model)
	{
		
	
		
		billService.saveBill(bill);
		model.addAttribute("bill", bill);
		
		return"billing_info";
		
	}

	@RequestMapping("/listallbills")
	public String listAllBills(ModelMap model) {
		
		List<Billing> bills = billService.listBills();
		model.addAttribute("bills", bills);
		return"search_bills_result";
	}
	
	
	
}

package com.marketingA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingA.entities.Contact;
import com.marketingA.entities.Lead;
import com.marketingA.services.ContactService;
import com.marketingA.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("lead", lead);
		
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLeadById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contactService.saveContact(contact);
		leadservice.deleteOneLeadById(id);
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts", contacts);
		return"search_contact_result";
		
	}
	
	
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadservice.listLeads();
		model.addAttribute("leads", leads);
		return"search_lead_result";
	}
	
	@RequestMapping("/LeadInfo")
	public String leadInfo(@RequestParam("id") long id ,ModelMap model)
	{
		Lead lead = leadservice.getOneLeadById(id);
		model.addAttribute("lead", lead);
		
		return "lead_info";
	}
}

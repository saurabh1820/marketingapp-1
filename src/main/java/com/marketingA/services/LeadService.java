package com.marketingA.services;

import java.util.List;

import com.marketingA.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public Lead getOneLeadById(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listLeads();
}

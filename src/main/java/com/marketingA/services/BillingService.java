package com.marketingA.services;

import java.util.List;

import com.marketingA.entities.Billing;

public interface BillingService {

	public void saveBill(Billing bill);

	public List<Billing> listBills();
}

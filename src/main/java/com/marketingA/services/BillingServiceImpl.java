package com.marketingA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingA.entities.Billing;
import com.marketingA.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billRepo;
	
	@Override
	public void saveBill(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public List<Billing> listBills() {
		List<Billing> bills = billRepo.findAll();
		return bills;
	}

}

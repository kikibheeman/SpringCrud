package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model1;
import com.example.demo.Rep.Repo;
@Service 
public class CustomerService1 {
	@Autowired
	Repo repository;
	
	
	public String addCustomer(Model1 customer)
	{
		repository.save(customer);
		return "Added successfully";
	}
	public List<Model1> getCustomer()
	{
		return repository.findAll();
		
	}
	public Optional<Model1> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Model1 customer)
	{
		repository.save(customer);
		return "Updated successfully";
	}
	public String deleteById(int id)
	{
		repository.deleteById(id);
		return "Deleted successfully";
	}


}

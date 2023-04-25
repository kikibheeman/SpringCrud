package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomerService.CustomerService1;
import com.example.demo.Model.Model1;

@RestController
@RequestMapping("/rm")
public class Controller1 {
	@Autowired
	
	CustomerService1 cusservice;
	
	@PostMapping("/pom")
	public String create(@RequestBody Model1 customer)
	{
		return cusservice.addCustomer(customer);
	}
	@GetMapping("/gm")
	public List<Model1> read()
	{
		return cusservice.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional <Model1> readById(@PathVariable int id)
	{
		return cusservice.getCustomerById(id);
	
	}
	@PutMapping("/pum")
	public String update(@RequestBody Model1 customer)
	{
		return cusservice.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		return cusservice.deleteById(id);
	}

}

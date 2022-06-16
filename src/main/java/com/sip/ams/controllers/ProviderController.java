package com.sip.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;
import java.util.*;

@RestController
@RequestMapping("/providers")
public class ProviderController {

	@Autowired
	ProviderRepository providerRepository;
	
	@RequestMapping("/")
	public List<Provider> getAllProvider(){
		return providerRepository.findAll();
	}
}

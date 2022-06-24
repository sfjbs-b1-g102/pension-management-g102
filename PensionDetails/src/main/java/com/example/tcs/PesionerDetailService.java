package com.example.tcs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PesionerDetailService {
	
	@Autowired
	PensionerRepository repo;

	List<Entityclass> getPensionerAllDetail() {
		return (List<Entityclass>) repo.findAll();
	}

	public Optional<Entityclass> getPensionerDetailByAadharCard(Long aadharNumber) {
		return repo.findById(aadharNumber);
	}

	public void addNewPensioner(Entityclass pensioner) {
		
			repo.save(pensioner);
   }
		
	}


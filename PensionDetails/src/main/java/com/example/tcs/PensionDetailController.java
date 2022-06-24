package com.example.tcs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PensionDetailController {
	@Autowired
	PesionerDetailService pensionerDetailService;
	
	@GetMapping("/AllPensioner")
	public List<Entityclass> getPensionerAllDetail() {
		
		return pensionerDetailService.getPensionerAllDetail();
	
	}
	
	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}") 
	public Optional<Entityclass> getPensionerDetailByAadhar(@PathVariable Long aadharNumber) {
		
		return pensionerDetailService.getPensionerDetailByAadharCard(aadharNumber);
		
	}
	
	@PostMapping("/AllPensioner")
	void addNewPensioner(@RequestBody Entityclass pensioner) {

		pensionerDetailService.addNewPensioner(pensioner);

	}

}



package com.process.pension.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.process.pension.web.domain.PensionerDetails;

@Service
public class PensionerDetailsRepository {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${pensioner.details.service.url}")
	private String pensionerDetailsServiceUrl;

	public PensionerDetails getDetails(String aadhaar) {
		return restTemplate.getForObject(pensionerDetailsServiceUrl + aadhaar, PensionerDetails.class);
	}
}
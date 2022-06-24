
package com.process.pension.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.process.pension.web.domain.PensionerDetails;
import com.process.pension.web.domain.Request;
import com.process.pension.web.domain.Response;
import com.process.pension.web.repository.PensionerDetailsRepository;

@Service
public class PensionProcessService {

	@Autowired
	private PensionerDetailsRepository pensionerDetailsRepository;

	public Response processPension(Request request) {

		PensionerDetails details = pensionerDetailsRepository.getDetails(request.getAadhaar());

		Response response = new Response();

		if (details != null && details.getPersionType() != null && "Self".equalsIgnoreCase(details.getPersionType())) {
			Long per = (long) ((80f / 100f) * details.getSalaryEarned());
			response.setPensionAmount(per + details.getAllowances());
		} else if (details != null && details.getPersionType() != null
				&& "Family".equalsIgnoreCase(details.getPersionType())) {
			Long per = (long) ((50f / 100f) * details.getSalaryEarned());
			response.setPensionAmount(per + details.getAllowances());
		}
		if (details != null && details.getBankType() != null && "Public".equalsIgnoreCase(details.getBankType())) {
			response.setBankServiceCharge(500l);
		} else if (details != null && details.getBankType() != null
				&& "Private".equalsIgnoreCase(details.getBankType())) {
			response.setBankServiceCharge(550l);
		}
		return response;
	}

}

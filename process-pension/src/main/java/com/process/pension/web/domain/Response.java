package com.process.pension.web.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Response {

	private Long pensionAmount;

	private Long bankServiceCharge;

	public Long getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(Long pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public Long getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(Long bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

}
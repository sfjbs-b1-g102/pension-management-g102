package com.process.pension.web.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PensionerDetails {

	private Long id;

	private String name;

	private String aadhaar;

	private String pan;

	private String persionType;

	private String bankName;

	private String accountNum;

	private String bankType;

	private Long salaryEarned;

	private Long allowances;

	private Date dateOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPersionType() {
		return persionType;
	}

	public void setPersionType(String persionType) {
		this.persionType = persionType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public Long getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(Long salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	public Long getAllowances() {
		return allowances;
	}

	public void setAllowances(Long allowances) {
		this.allowances = allowances;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
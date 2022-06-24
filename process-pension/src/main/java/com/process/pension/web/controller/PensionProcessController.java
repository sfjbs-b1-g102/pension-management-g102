package com.process.pension.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.process.pension.web.domain.Request;
import com.process.pension.web.domain.Response;
import com.process.pension.web.service.PensionProcessService;

@RestController
@RequestMapping("/processPension")
public class PensionProcessController {

	@Autowired
	private PensionProcessService pensionProcessService;

	@PostMapping
	public ResponseEntity<?> processPension(@RequestBody Request request, BindingResult bindingResult) {
		return new ResponseEntity<Response>(pensionProcessService.processPension(request), HttpStatus.OK);
	}

}
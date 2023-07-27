package org.verizon.CommunicationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.verizon.CommunicationApi.model.ComService;
import org.verizon.CommunicationApi.service.ComServiceServe;

@ResponseBody
@RequestMapping("/api/comservice")
public class ComServiceController {
	private ComServiceServe serve;
	@Autowired
	public ComServiceController(ComServiceServe comService) {
		this.serve=comService;
	}
	@RequestMapping("/allservices")
	public List<ComService> getAllComService()
	{
		return serve.getAllComService();
	}
	
	@PostMapping("/insert-services")
	public ComService createService(@RequestBody ComService com) {
		return serve.createService(com);
	}
}

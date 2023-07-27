package org.verizon.CommunicationApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationApi.model.ComService;
import org.verizon.CommunicationApi.repo.ComServiceRepository;

@Service
public class ComServiceServe {

	private final ComServiceRepository comrepo;
	@Autowired
	public ComServiceServe(ComServiceRepository comrepo) {
		this.comrepo=comrepo;
	}
	public List<ComService> getAllComService()
	{
		return comrepo.findAll();
	}
	
	public ComService createService(ComService service)
	{
		return comrepo.save(service);
	}
	
}

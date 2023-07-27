package org.verizon.CommunicationApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationApi.model.Catalog;
import org.verizon.CommunicationApi.repo.CatalogRepository;



@Service
public class CatalogService {

	private final CatalogRepository catrepo;
	@Autowired
	public CatalogService(CatalogRepository catrepo) {
		this.catrepo=catrepo;
	}
	public List<Catalog> getAllCatalog()
	{
		return catrepo.findAll();
	}
	
	public Catalog createCatalog (Catalog catalog)
	{
		return catrepo.save(catalog);
	}
	
	
}

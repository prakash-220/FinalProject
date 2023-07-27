package org.verizon.CommunicationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationApi.model.Catalog;
import org.verizon.CommunicationApi.service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
private CatalogService catservice;
	
	@Autowired
	public CatalogController(CatalogService catService) {
		this.catservice=catService;
	}
	@RequestMapping("/api/allcat")
	public List<Catalog>getAllCatalog(){
		return catservice.getAllCatalog();
	}
	
	@PostMapping("/insert")
	public Catalog createCatalog(@RequestBody Catalog cust) {
		return catservice.createCatalog(cust);
	}
}

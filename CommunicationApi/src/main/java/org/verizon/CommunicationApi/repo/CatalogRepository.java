package org.verizon.CommunicationApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationApi.model.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Integer>  {

}

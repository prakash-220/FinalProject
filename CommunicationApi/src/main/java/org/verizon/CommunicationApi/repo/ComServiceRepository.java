package org.verizon.CommunicationApi.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.verizon.CommunicationApi.model.ComService;

@Repository
public interface ComServiceRepository extends JpaRepository<ComService, Integer>  {

}

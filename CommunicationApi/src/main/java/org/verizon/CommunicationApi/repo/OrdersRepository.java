package org.verizon.CommunicationApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationApi.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}

package org.ms.clientservice.repository;

import org.ms.clientservice.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@RestResource (path="/byName")
	Page<Client> findByNameContains(@Param("mc") String name , Pageable pageable);
}
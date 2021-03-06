package com.ajithsolomon.ajiranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajithsolomon.ajiranet.entity.Connection;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Long> {

}

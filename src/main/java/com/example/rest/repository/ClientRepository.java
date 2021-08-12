package com.example.rest.repository;

import com.example.rest.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Khristiuk
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {
}

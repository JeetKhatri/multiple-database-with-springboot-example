package com.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.model.CustomerAddress;


/**
 * @author Jeet Khatri
 */

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {

}

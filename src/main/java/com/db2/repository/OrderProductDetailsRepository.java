package com.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db2.model.OrderProductDetails;

/**
 * @author Jeet Khatri
 */

public interface OrderProductDetailsRepository extends JpaRepository<OrderProductDetails, Integer> {

	/***
	 * This method return order product details object based on OrderProductDetailsId
	 * @param OrderProductDetailsId
	 * @return OrderProductDetails
	 */
	OrderProductDetails findById(int OrderProductDetailsId);
}

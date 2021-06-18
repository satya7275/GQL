package com.easipm.wm.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
 import org.springframework.stereotype.Repository;
import com.easipm.wm.model.Customers;

@Repository
public interface CustomersRepo extends JpaRepository<Customers,String>{

	public List<Customers> findByCustomerId(Integer customerId);
}

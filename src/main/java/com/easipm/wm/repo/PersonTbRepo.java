package com.easipm.wm.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
 import org.springframework.stereotype.Repository;
import com.easipm.wm.model.PersonTb;

@Repository
public interface PersonTbRepo extends JpaRepository<PersonTb,String>{

	public List<PersonTb> findByIid(Integer iid);
}

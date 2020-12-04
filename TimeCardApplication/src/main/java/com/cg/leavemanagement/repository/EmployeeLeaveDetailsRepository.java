package com.cg.leavemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.leavemanagement.model.EmployeeLeaveDetailsEntity;

@Repository
public interface EmployeeLeaveDetailsRepository extends CrudRepository<EmployeeLeaveDetailsEntity,Long> {
     EmployeeLeaveDetailsEntity findByEmpId(long empId);
}

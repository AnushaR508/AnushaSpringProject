package com.cg.leavemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.leavemanagement.model.HolidaysEntity;

@Repository
public interface HolidaysDetails extends JpaRepository<HolidaysEntity, Integer> {
	List<HolidaysEntity> findAllByYear(int year);
}

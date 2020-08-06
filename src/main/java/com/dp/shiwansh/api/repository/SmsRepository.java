package com.dp.shiwansh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dp.shiwansh.api.entity.SmsEntity;

/**
 * SmsRepository .
 * 
 * @author admin
 *
 */
@Repository
public interface SmsRepository extends JpaRepository<SmsEntity, Integer> {

}

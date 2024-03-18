package com.ewallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ewallet.model.Flow;

@Repository
public interface FlowRepository extends JpaRepository<Flow, Long> {

}

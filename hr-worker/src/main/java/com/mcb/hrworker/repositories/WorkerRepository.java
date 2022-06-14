package com.mcb.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcb.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}

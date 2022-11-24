package com.java.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.hospital.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}

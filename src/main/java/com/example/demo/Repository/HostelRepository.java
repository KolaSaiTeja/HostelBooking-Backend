package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modal.Hostel;

public interface HostelRepository extends JpaRepository<Hostel, Long> {
	 List<Hostel> findByCity(String city);
}

package com.example.demo.Service;

import java.util.List;

import com.example.demo.Modal.Hostel;

public interface HostelService {

	Hostel getHostelById(Long id);
	
	List<Hostel> getHostelsByCity(String city);
	
	List<Hostel> findAll();

}

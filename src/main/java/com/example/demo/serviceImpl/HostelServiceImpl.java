package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modal.Hostel;
import com.example.demo.Repository.HostelRepository;
import com.example.demo.Service.HostelService;

@Service
public class HostelServiceImpl implements HostelService{

	@Autowired
	private HostelRepository hostelRepository;

	@Override
	public Hostel getHostelById(Long id) {
		return hostelRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Hostel not found with id: " + id));
	}

	@Override
	public List<Hostel> getHostelsByCity(String city) {
		return hostelRepository.findByCity(city);
	}

	@Override
	public List<Hostel> findAll() {
		return hostelRepository.findAll();
	}

}

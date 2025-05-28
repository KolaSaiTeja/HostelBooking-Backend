package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.Hostel;
import com.example.demo.Service.HostelService;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/api/hostels/")
public class HostelController {
	
	@Autowired
	private HostelService hostelService;
	
	
	
	@GetMapping
	public List<Hostel> getAllHostels() {
		return hostelService.findAll();
	}
	
	@GetMapping("/{id}")
    public Hostel getHostelById(@PathVariable Long id) {
        return hostelService.getHostelById(id);
    }
	
	@GetMapping("/city")
    public List<Hostel> getHostels(@RequestParam String city) {
		System.out.println("CITY PARAM RECEIVED = " + city);
        return hostelService.getHostelsByCity(city);
    }

}

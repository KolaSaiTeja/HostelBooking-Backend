package com.example.demo.Modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hostel {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String city;
	    private String description;
	    private double averageRating;
	    private double pricePerNight;
	    private String imageUrl;

	    @OneToMany(mappedBy = "hostel", cascade = CascadeType.ALL)
	    private List<Review> reviews;

}

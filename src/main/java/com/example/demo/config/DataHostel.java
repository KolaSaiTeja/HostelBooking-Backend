package com.example.demo.config;



import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Modal.Hostel;
import com.example.demo.Modal.Review;
import com.example.demo.Repository.HostelRepository;

@Configuration
public class DataHostel {

	@Bean
	CommandLineRunner seedData(HostelRepository hostelRepository) {
		return args -> {
			if (hostelRepository.count() == 0) {

				Hostel h1 = new Hostel(null, "Maple Haven", "Pune", "Quiet retreat near botanical gardens.", 4.2, 800.0,
				        "https://cf.bstatic.com/xdata/images/hotel/max1024x768/562727508.jpg?k=f289bf41c18dc560c079499261a1cd377d8f3f8c028d7c9a87628ac96fb43ad9&o=&hp=1", null);

				Hostel h2 = new Hostel(null, "Seaside Loft", "Vizag", "Modern hostel steps from the beach.", 4.8, 950.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0Ibfix89keWtAAzTfluxOGzNiYy3JKoyUZg&s", null);

				Hostel h3 = new Hostel(null, "The Urban Nook", "Mumbai", "Trendy interiors and rooftop lounge.", 4.3, 1200.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2JeLflKzHbiITr2iiqql3VwQYGB70Py5SkQ&s", null);

				Hostel h4 = new Hostel(null, "Digital Nomad Den", "Pune", "Perfect for remote workers and solo travelers.", 4.1, 1000.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIH4IHmCvK3NTO3Rg8EM2zjuMmjOlh0H5PhQ&s", null);

				Hostel h5 = new Hostel(null, "Hillview Hostel", "Mumbai", "Cozy lodge with panoramic mountain views.", 4.7, 1500.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqEY8rAvpPcORAgLvWDXGwQmbfsyu5RfyuxA&s", null);

				Hostel h6 = new Hostel(null, "Backwater Bliss", "Vizag", "Serene stay with direct backwater access.", 4.4, 850.0,
				       "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr_ipwGuR5qXU3_9sHz4xDrItG5ikf-Pm0YQ&s", null);

				Hostel h7 = new Hostel(null, "Metro Habitat", "Delhi", "Urban escape with artistic decor.", 4.6, 1300.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCCPVCxMt67zUhMAdMaqDzre7Cq0TNRq91fw&s", null);

				Hostel h8 = new Hostel(null, "Casa Lago", "Delhi", "Peaceful spot overlooking the lake.", 4.5, 1400.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKN4wL0OVMx2QzZtO1-rrZO-Sn1o8-pK7H6A&s", null);

				Hostel h9 = new Hostel(null, "Royal Roots Hostel", "Vizag", "Historic mansion turned into a backpacker’s paradise.", 4.9, 1100.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsuAccyoQvustZQij3eiQS62He1yQevGNI5g&s", null);

				Hostel h10 = new Hostel(null, "StudyHub Stay", "Pune", "Ideal for students with a calm vibe.", 4.6, 900.0,
				        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwlqbW-h3jGRCNim6XCBr-odaOrArxpPjNvg&s", null);
				
				


				Review r1 = new Review(null, "Aaron", "Fantastic environment and super clean rooms.", 5, h1);
				Review r2 = new Review(null, "Bella", "Decent stay but Wi-Fi was slow.", 3, h1);
				Review r3 = new Review(null, "Carlos", "Location is superb, walking distance to downtown.", 4, h2);
				Review r4 = new Review(null, "Dana", "Nice interiors and well-maintained.", 5, h2);
				Review r5 = new Review(null, "Eli", "Below average service, room was small.", 2, h3);
				Review r6 = new Review(null, "Faith", "Loved the rooftop views and lounge.", 5, h3);
				Review r7 = new Review(null, "Gavin", "Proximity to nightlife is a plus!", 4, h4);
				Review r8 = new Review(null, "Hailey", "Expected more amenities for the price.", 3, h4);
				Review r9 = new Review(null, "Isaac", "Stunning mountain sunrise view!", 5, h5);
				Review r10 = new Review(null, "Jasmine", "Pleasant stay with warm hospitality.", 4, h5);
				Review r11 = new Review(null, "Kyle", "Loved the peace and surrounding nature.", 5, h6);
				Review r12 = new Review(null, "Lena", "Riverside was relaxing but room was damp.", 3, h6);
				Review r13 = new Review(null, "Mason", "Good spot if you like local bars.", 4, h7);
				Review r14 = new Review(null, "Nora", "Simple and budget-friendly.", 3, h7);
				Review r15 = new Review(null, "Owen", "Amazing lake access, peaceful mornings.", 5, h8);
				Review r16 = new Review(null, "Piper", "Bathroom fixtures were broken.", 2, h8);
				Review r17 = new Review(null, "Ryder", "Antique vibes, great for history lovers.", 4, h9);
				Review r18 = new Review(null, "Sophie", "Staff made my stay memorable!", 5, h9);
				Review r19 = new Review(null, "Trent", "Affordable and in a central area.", 4, h10);
				Review r20 = new Review(null, "Uma", "Great for students, near everything.", 5, h10);
				



				// Set reviews list in each hostel
				h1.setReviews(Arrays.asList(r1, r2));
				h2.setReviews(Arrays.asList(r3, r4));
				h3.setReviews(Arrays.asList(r5, r6));
				h4.setReviews(Arrays.asList(r7, r8));
				h5.setReviews(Arrays.asList(r9, r10));
				h6.setReviews(Arrays.asList(r11, r12));
				h7.setReviews(Arrays.asList(r13, r14));
				h8.setReviews(Arrays.asList(r15, r16));
				h9.setReviews(Arrays.asList(r17, r18));
				h10.setReviews(Arrays.asList(r19, r20));
			


				// Bookings will remain null, as requested

				// Save all hostels (cascade saves reviews)
				hostelRepository.saveAll(Arrays.asList(
					    h1, h2, h3, h4, h5, h6, h7, h8, h9, h10
					));

				System.out.println("Seeded hostels with reviews successfully.");
			}
		};
	}

}

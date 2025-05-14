package com.turfbooking.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="turfs_list")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Turf {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	    private String name;
	    private String location;
	    private String type;
	    private String imageUrl;
	    private String description;

}

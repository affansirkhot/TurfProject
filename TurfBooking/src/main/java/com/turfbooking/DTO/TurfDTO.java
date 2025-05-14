package com.turfbooking.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurfDTO {
	//private Long id;
    private String name;
    private String location;
    private String type;
    private String imageUrl;
    private String description;


}

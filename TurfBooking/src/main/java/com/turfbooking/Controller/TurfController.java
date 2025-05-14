package com.turfbooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turfbooking.DTO.TurfDTO;

import com.turfbooking.Service.TurfService;

@RestController
@RequestMapping("/api/turfs")
public class TurfController {
	@Autowired
	TurfService turfService;
	
	
	@PostMapping("/addTurf") 
public ResponseEntity<TurfDTO> createTurf(@RequestBody TurfDTO turfDTO) {
    TurfDTO createdTurf = turfService.createTurf(turfDTO);
    return ResponseEntity.ok(createdTurf);
}

}

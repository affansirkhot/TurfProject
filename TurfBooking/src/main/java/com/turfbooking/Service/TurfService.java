package com.turfbooking.Service;

import java.util.List;

import com.turfbooking.DTO.TurfDTO;


public interface TurfService {
	TurfDTO createTurf(TurfDTO turfDTO);
    List<TurfDTO> getAllTurfs();
    TurfDTO getTurfById(Long id);
    TurfDTO updateTurf(Long id, TurfDTO turfDTO);
    void deleteTurf(Long id);

}

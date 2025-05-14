package com.turfbooking.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turfbooking.DTO.TurfDTO;
import com.turfbooking.Entity.Turf;
import com.turfbooking.Repository.TurfRepository;
import com.turfbooking.Service.TurfService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class TurfServiceImpl implements TurfService{
	@Autowired
    TurfRepository turfRepository;

	@Override
	public TurfDTO createTurf(TurfDTO turfDTO) {
		Turf turfEntity= null;
		 turfEntity = new Turf(0l, turfDTO.getName(),turfDTO.getLocation(), turfDTO.getType(),
                 turfDTO.getImageUrl(),turfDTO.getDescription());

		 turfEntity = turfRepository.save(turfEntity);
		return turfDTO;
	}


	@Override
	public List<TurfDTO> getAllTurfs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurfDTO getTurfById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurfDTO updateTurf(Long id, TurfDTO turfDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTurf(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}

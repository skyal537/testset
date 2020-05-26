package com.zetcode.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zetcode.model.City;
import com.zetcode.repository.CityRepository;

@Service
public class ICityService {

	@Autowired
	CityRepository cityRepository; 
            
	public List<City> getList() {
		return (List<City>) cityRepository.findAll();
	   	
	}
	 	 public City save(City city) {
	 		 
	 		 if (city.getId() == null) {
	 			 city.setId(UUID.randomUUID().toString());
	 		 }
	 		 city.setRegDate(Timestamp.valueOf(LocalDateTime.now()));
	 		 
	 		 return cityRepository.save(city);
	 	 }
	 	 
	 	public Object findById(String id) {
			return cityRepository.findById(id);
		}

		public Object deleteById(String id) { 
			 cityRepository.deleteById(id);
			return id; 
			
		}
}

// ICityService 데이터 소스에서 모든 도시를 가져 오기위한 계약 방법을 제공


//service : 비즈니스 로직을 수행

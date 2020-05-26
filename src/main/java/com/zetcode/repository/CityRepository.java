package com.zetcode.repository;

import com.zetcode.model.City;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, String> {
// 단순히 인터페이스를 생성후, JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 

	 
	
	

	
}

//Repository = 에서 기본적인 CRUD를 제공
//Repository = aoroqustnfh ehapdls zmffotmdhk zlxkdlq rltnf 

// Spring 에서 확장함으로써  CrudRepository데이터 저장소를위한 몇 가지 메소드를 구현할 findAll()


// repository   :  주로 ibatis/MyBatis 등에서 Dao라고 불리는 DB Layer 접근자
// jpq에선 repository 라고부르며 인터페이스로 생성 

// repository : Database의 data에 접근을 위한 객체 ,  Database에 접근을 하기위한 로직과 비즈니스 로직을 분리하기 위해서 사용


package com.zetcode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zetcode.model.City;
import com.zetcode.repository.CityRepository;
import com.zetcode.service.ICityService;


@Controller
@RequestMapping("/city")
public class MyController {

	//@Autowired
	//private ICityService cityService;
	
	@Autowired
	ICityService cityService;
	
	@GetMapping("/list")
	public ModelAndView cityList(City city, ModelAndView mav) {
		
		mav.addObject("city", cityService.getList());
		mav.setViewName("/city/list");
		
		return mav;
	}
	
	@GetMapping("/new")
	public ModelAndView BaseCreate(City city, ModelAndView mav) {
		
		mav.setViewName("/city/new");
		
		return mav;
	}
	
	 @PostMapping("/newAccess")
	 public String CtrateAccess(City city) {
		 
		 cityService.save(city);
		 
		 return "redirect:/city/list";
	 }
	 
	 @GetMapping("/edit/{id}")
	 public ModelAndView editCity(@PathVariable("id") String id, ModelAndView mav) {
		 
		 mav.addObject("city", cityService.findById(id));
		 mav.setViewName("/city/new");
		 
		 return mav;
	 }
	 
	 @GetMapping("/delete/{id}")
	 public String deleteCity(@PathVariable("id") String id) {
		 
		 cityService.deleteById(id);
		 
		 return "redirect:/city/list";
	 }
	 
	 
	 
	 
	 
}

// 매핑 ICityService cityService

//  showCities 컨트롤러의 findCities()방법에 대한 경로와 매핑
// 기본요청 GET 요청 
// 이모델은 도시목록 얻고 처리는 showCities.htmlThymeleaf 템플릿 파일로 전송 !!

// 컨트롤러 :  사용자의 입력처리와 흐름 제어를 담당

// findAll 패턴과 매칭되는 모든 문자열을 반환 한다.
// 매칭된 문자열을 리스트로 넘겨준다.
// 패턴이 그룹핑 되어 있을 경우, 리스트의 데이터를 tuple형태로해서 넘겨 준다.





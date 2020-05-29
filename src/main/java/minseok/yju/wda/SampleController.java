package minseok.yju.wda;


import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import minseok.yju.wda.domain.SampleDTO;
import minseok.yju.wda.domain.SampleDTOList;
import minseok.yju.wda.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("")
	public void basic(Locale locale) {
		logger.info("basic  locale is {}.", locale);
	}
	
	@RequestMapping(value="basic", method=RequestMethod.GET)//method={method=RequestMethod.GET,method=RequestMethod.POST}
	public void basicGet(Locale locale) {
		logger.info("basic GET locale is {}.", locale);
	}
	@RequestMapping(value="basic", method=RequestMethod.POST)
	public String basicGet2(Locale locale) {
		logger.info("basic GET locale is {}.", locale);
		return "basic2";
	}
	@RequestMapping(value="test")
	public String test(Locale locale) {
		logger.info("basic GET locale is {}.", locale);
		return "sample/mytest";
	}
	
	@RequestMapping("dto")
	public void dto(SampleDTO dto) {
	// class 로 한 경우, setter 의 이름 set 뒤에오는 단어   와  데이터 이름이 같아야 자동으로 set 됨
		logger.info("dto: "+dto);
//		logger.info("dto: "+dto);

	}
	
	
	@RequestMapping("param")
	public void param(@RequestParam("name") String MyName, int age) {
		logger.info("name: "+MyName+ ", age :"+age);
	}
	
	@RequestMapping("list")
	public String list(@RequestParam("ids") ArrayList<String> ids) {
		logger.info("ids: "+ids.toString());
		
		return "sample/list";
	}
	
	@RequestMapping("array")
	public String array(@RequestParam("ids") String[] ids) {
		logger.info("ids: "+ids);
		System.out.println(ids);
		
		return "sample/array";
	}
	
	
	@RequestMapping("objList")
	public String objectList(SampleDTOList list) {
		System.out.println(list);
		return "sample/object";
	}
	
	@RequestMapping("binder")
	public void myBinder(TodoDTO todo) {
		System.out.println(todo);
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dataFormat,false));
//	}
	
	
	@RequestMapping("model")///sample/model?name=scpark&age=20&page=2
	public String testModelAttr(SampleDTO dto, @ModelAttribute("page") int page, Model model) {
		System.out.println(dto);
		System.out.println(page);
		model.addAttribute("myValue","123");
		
		return "sample/modelAttr";
	}
	
	@RequestMapping("redirect")
	public String testRedirect(RedirectAttributes rttr) {
		rttr.addAttribute("name","hi hi hi");
		rttr.addAttribute("age","18");
		rttr.addAttribute("page","100");
		return "redirect: /sample/model";
	}
	
	@GetMapping("json")
	public @ResponseBody SampleDTO testJson(){
		SampleDTO dto = new SampleDTO();
		dto.setName("Lasdfasdfadsf");
		dto.setAge(20);
		return dto;
	}
	
	@GetMapping("resEntity")
	public ResponseEntity<String> testEntity(){
		String msg = "{'name':'홍길동','age':18, 'gender':'남'}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		return new ResponseEntity<>(msg,header,HttpStatus.OK);
	}
}

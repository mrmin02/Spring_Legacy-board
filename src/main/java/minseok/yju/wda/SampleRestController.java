package minseok.yju.wda;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import minseok.yju.wda.domain.SampleVO;
import minseok.yju.wda.domain.Ticket;

@RestController
@RequestMapping("/rest")
public class SampleRestController {
	Logger log = LoggerFactory.getLogger(SampleRestController.class);
	
	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String getText() {
		log.info("MIME TYPE: "+MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	
	
	
	@GetMapping(value="/getSample", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SampleVO getSample() {// /rest/getSample.json  --> json 형태 리턴 , /rest/getSample --> XML 형태로 리턴
		return new SampleVO(112,"경찰","서장");
	}
	
	@GetMapping(value="/getList")
	public List<SampleVO> getList(){
//		return IntStream.range(1,10).mapToObj(i->new SampleVO(1,i+"Lirst",i+"Last")).collect(Collectors.toList());
		List<SampleVO> list = new ArrayList<>();
		for(int i =1; i <10; i++) {
			list.add(new SampleVO(i,i+"First",i+"Last"));
		}
		return list;
	}
	
	@GetMapping(value="/check", params= {"height", "weight"})
	public ResponseEntity<SampleVO> check(int height, int weight){
		SampleVO vo = new SampleVO(0,""+height, ""+weight);
		ResponseEntity<SampleVO> result = null;
		
		if (height <150) { 
			result = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vo);
			// F12의 console에 오류가 뜸, 에러 발생시키고, 에러 정보를 줄 수 있음.
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
	
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") int pid) {
		
		return new String[] {"category: " + cat, "product id: "+pid};
		
	}
	
	@PostMapping("/ticket")
	public Ticket convert(@RequestBody Ticket ticket) {
		
		log.info("convert ............ticket: "+ticket);
		
		return ticket;
	}
}

package minseok.yju.wda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/main/*")
public class TestController {
	
	@RequestMapping(value="")
	public void index() {
		System.out.println("---- index 호출 ----");
	}
	
	
	
	@RequestMapping(value="aaa")
	public void aaa() {
		System.out.println("---- aaa 호출 ----");
	}
	
	@RequestMapping(value="main")
	public void main() {
		System.out.println("---- 메인 호출 ----");
	}
	
}

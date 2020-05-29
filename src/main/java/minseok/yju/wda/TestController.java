package minseok.yju.wda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/main/*")
public class TestController {
	
	@RequestMapping(value="")
	public void index() {
		System.out.println("---- index ȣ�� ----");
	}
	
	
	
	@RequestMapping(value="aaa")
	public void aaa() {
		System.out.println("---- aaa ȣ�� ----");
	}
	
	@RequestMapping(value="main")
	public void main() {
		System.out.println("---- ���� ȣ�� ----");
	}
	
}

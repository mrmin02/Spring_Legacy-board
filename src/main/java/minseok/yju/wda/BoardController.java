package minseok.yju.wda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import minseok.yju.wda.domain.BoardVO;
import minseok.yju.wda.domain.Criteria;
import minseok.yju.wda.domain.PageDTO;
import minseok.yju.wda.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Autowired
	private BoardService service;
	
	Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@GetMapping("/list")
	public void list(Criteria crt,Model model) {
		log.info("list");
//		
		System.out.println("crt: "+crt.getPageNum());
		log.info(crt.toString());
		
		log.info(""+service.getTotal(crt));
		
		int total = service.getTotal(crt);
		
		log.info("total: "+total);
		
		
		model.addAttribute("list",service.getList(crt));
		model.addAttribute("pageMaker",new PageDTO(crt,total));
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("register"+board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list"; 
	}
	
	@GetMapping({"/get", "/modify"})//java bean 으로 등록되면 자동으로 ModelAttribute 가 넘어감. ( 그 경우, 소문자 클래스 명으로 사용.)
	public void get(@RequestParam("bno") int bno, @ModelAttribute("crt") Criteria crt,Model model) {
		//원래 Model 에 criteria 이름으로 정보 넘어가는데, 변수 이름을 crt 로 지정하고 싶어서 @modelAttirbute 로 변수명 지정
		log.info("get");
		log.info("data: "+service.get(bno));
		model.addAttribute("board",service.get(bno));
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, Criteria crt,RedirectAttributes rttr) {
		log.info("modify");
		service.modify(board);
		rttr.addFlashAttribute("result","succes");
		
		rttr.addAttribute("pageNum",crt.getPageNum());
		rttr.addAttribute("amount",crt.getAmount());
		rttr.addAttribute("type",crt.getType());
		rttr.addAttribute("keyword",crt.getKeyword());
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") int bno, Criteria crt ,RedirectAttributes rttr) {
		
		log.info("remove....:"+bno);
		service.remove(bno);
		rttr.addFlashAttribute("result","success");
		
		rttr.addAttribute("pageNum",crt.getPageNum());
		rttr.addAttribute("amount",crt.getAmount());
		rttr.addAttribute("type",crt.getType());
		rttr.addAttribute("keyword",crt.getKeyword());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
}

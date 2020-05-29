package minseok.yju.wda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class CommonExceptionAdvice {
	@ExceptionHandler(Exception.class)
	public String except(Exception ex, Model model) {
		System.out.println("Exception Handler exception ");
		model.addAttribute("exception",ex);
		
		return "sample/error_page";
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex) {
		System.out.println("404 error");
		return "sample/custom404";
	}
}
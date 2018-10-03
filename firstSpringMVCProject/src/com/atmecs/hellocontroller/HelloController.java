package com.atmecs.hellocontroller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
/*
 * import javax.servlet.http.HttpServletRequest;
 * import javax.servlet.http.HttpServletResponse;
*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 * import org.springframework.web.servlet.mvc.AbstractController;
 */

/*
 * we need to extend AbstractController class if we don't use @Controller annotation.
 * eg. public class HelloController extends AbstractController
 */
 @org.springframework.stereotype.Controller
@RequestMapping("/nilendra")//class level mapping i.e. from now url must have prefix as /nilendra
 public class HelloController{
	@RequestMapping("/welcome")
	 /*@Override
	  *protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception{
	  *We have to write this code in case we don't use annotation
		*/
	public ModelAndView helloworld() {
		ModelAndView modelandview=new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User! Welcome to the MVC world");
		return modelandview;
	}
	/*
	 *We can can have as many Request Handler methods as we want in our controller class 
	  */	
		//By putting variable into the {} we are giving permission to the client to make changes into it
	//and @PathVariable is used to store these value
		@RequestMapping("/hi/{country}/{userName}")
		//public ModelAndView sayHi(@PathVariable("country")String place,@PathVariable("userName")String user) {
		public ModelAndView sayHi(@PathVariable Map<String,String> pathVars) {	
		    String user=pathVars.get("userName");
			String place=pathVars.get("country");
			ModelAndView model=new ModelAndView("HelloPage");
			model.addObject("welcomeMessage", "Hi! This is "+user+" from "+place);
			return model;
	
	}

}

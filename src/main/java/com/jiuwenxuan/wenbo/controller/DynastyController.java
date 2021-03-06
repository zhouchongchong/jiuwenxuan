package com.jiuwenxuan.wenbo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuwenxuan.wenbo.domain.Dynasty;
import com.jiuwenxuan.wenbo.service.IDynastyService;

@Controller
@RequestMapping("/dynasty")
public class DynastyController {
	@Resource
	private IDynastyService dynastyService;
	
	
	/**  
	 * getDynastys:获取未删除的朝代. <br/>    
	 * @author zhouchong  
	 * @return  
	 * @since JDK 1.8  
	 */
	@RequestMapping("/getdynasties")
	@ResponseBody
	public String getDynastys(HttpServletRequest request, Model model){
		model.addAttribute("dynastys", dynastyService.searchAllDynasty());
		return  "";
	}
}

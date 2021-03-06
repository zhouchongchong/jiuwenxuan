package com.jiuwenxuan.wenbo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.jiuwenxuan.wenbo.service.ITreasureService;
import com.jiuwenxuan.wenbo.utils.UploadUtils;
import com.jiuwenxuan.wenbo.utils.beans.FileBean;

@Controller
@RequestMapping("/treasure")
public class TreasureController {
	@Resource
	private ITreasureService treasureService;
	
	
	
	/**  
	 * getTreasurePic:藏品封面图上传. <br/>    
	 * @author zhouchong  
	 * @return  
	 * @since JDK 1.8  
	 */
	@RequestMapping(value="/uptreasurpic",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getTreasurePic(@RequestParam CommonsMultipartFile file, HttpServletRequest request ){
		@SuppressWarnings("unused")
		Map<String, String> pathMap = new HashMap<>();
		FileBean picfile = UploadUtils.getInstance().upload(request, file, "");
		pathMap.put("path", picfile.getRemoteUrl());
		return pathMap;
	}
	
}

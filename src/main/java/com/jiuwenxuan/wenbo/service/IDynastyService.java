/**  
 * Project Name:jiuwenxuan  
 * File Name:IDynastyService.java  
 * Package Name:com.jiuwenxuan.wenbo.service  
 * Date:2017年5月13日上午10:55:33  
 * Copyright (c) 2017, 7640*****@qq.com All Rights Reserved.  
 *  
*/  
  
package com.jiuwenxuan.wenbo.service;  
/**  
 * ClassName:IDynastyService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年5月13日 上午10:55:33 <br/>  
 * @author   zhouchong  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

import java.util.List;

import com.jiuwenxuan.wenbo.domain.Dynasty;

public interface IDynastyService {
	
	/**  
	 * searchAllDynasty:返回所有未删除的朝代. <br/>    
	 * @author zhouchong  
	 * @return  list
	 * @since JDK 1.8  
	 */
	public List<Dynasty> searchAllDynasty();
}
  

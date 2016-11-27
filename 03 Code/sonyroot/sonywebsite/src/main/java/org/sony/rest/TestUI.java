package org.sony.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sonyCheng
 * @version [V100R001C00 2016年11月16日]
 * @see [类/声明]
 */
@Controller
public class TestUI
{
	@ResponseBody
	@RequestMapping(value="rest/sony/service/test", method=RequestMethod.GET, 
			produces="application/json;charset=UTF-8")
	public String getString(HttpServletRequest request)
	{
		return "SonyCheng..";
	}
}

package com.jss.web;


import com.jss.common.constant.Constants;
import com.jss.model.product.Category;
import com.jss.service.product.CategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName dell
 * @Description TOOD
 * @Author X
 * @Data 2019/9/2
 * @Version 1.0
 **/

@Controller
/**
 * 前台所有请求controller
 */
@RequestMapping(value = "/fore")
public class ForeController {
    @Autowired
   private CategoryInfoService categoryInfoService;
    /**
     * 前端首页
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/foreIndex")
    public String index(HttpServletRequest request, Model model) {
        /**
         * 产品类型
         */
       List<Category> category = categoryInfoService.queryCategory();
       model.addAttribute(Constants.CATEGORY,category);
        return "foreinclude/foreHander";
    }
}

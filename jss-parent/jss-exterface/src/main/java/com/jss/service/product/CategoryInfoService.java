package com.jss.service.product;

import com.jss.model.product.Category;

import java.util.List;

/**
 * @ClassName dell
 * @Description TOOD
 * @Author X
 * @Data 2019/9/25-20:37
 * @Version 1.0
 **/
public interface CategoryInfoService {

    /**
     * 查询商品种类
     * @return
     */
    List<Category> queryCategory();
}

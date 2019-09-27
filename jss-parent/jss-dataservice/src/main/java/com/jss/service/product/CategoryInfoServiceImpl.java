package com.jss.service.product;


import com.jss.mapper.product.CategoryMapper;
import com.jss.model.product.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName dell
 * @Description TOOD
 * @Author X
 * @Data 2019/9/25
 * @Version 1.0
 **/
@Service("categoryInfoServiceImpl")
public class CategoryInfoServiceImpl implements CategoryInfoService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategory() {
        //去数据库中查询商品种类
        List<Category> categoryList = categoryMapper.selectCategory();
        return categoryList;
    }
}

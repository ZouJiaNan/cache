package com.casit.cache.service.ServiceImpl;

import com.casit.cache.bean.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casit.cache.service.categoryService;
import com.casit.cache.mapper.categoryMapper;

@Service
public class CategoryServiceImpl implements categoryService {
    @Autowired
    categoryMapper mapper;

    @Override
    public category findByName(String name) {
        return mapper.findByName(name);
    }
}

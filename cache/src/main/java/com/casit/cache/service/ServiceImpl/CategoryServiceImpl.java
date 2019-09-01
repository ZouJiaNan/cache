package com.casit.cache.service.ServiceImpl;

import com.casit.cache.bean.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.casit.cache.service.categoryService;
import com.casit.cache.mapper.categoryMapper;

@Service
public class CategoryServiceImpl implements categoryService {
    @Autowired
    categoryMapper mapper;

    @Override
    @Cacheable(cacheNames = {"categoryCache"},key="#c.name")
    public category findByName(category c) {
        return mapper.findByName(c);
    }

    @Override
    @CachePut(value="categoryCache",key="#c.name")
    public category update(category c) {
        mapper.update(c);
        return c;
    }

    @Override
    @CacheEvict(value = "categoryCache",key="#c.name")
    public category delete(category c) {
//        mapper.delete(c);
        return c;
    }
}

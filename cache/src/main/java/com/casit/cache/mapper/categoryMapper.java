package com.casit.cache.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.casit.cache.bean.category;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface categoryMapper {
    @Cacheable(cacheNames = {"categoryCache"})
    category findByName(String name);
}

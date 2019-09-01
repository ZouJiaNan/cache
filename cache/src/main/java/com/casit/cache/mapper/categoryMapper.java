package com.casit.cache.mapper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import com.casit.cache.bean.category;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface categoryMapper {
    category findByName(category c);
    void update(category c);
    void delete(category c);
}

package com.casit.cache.service;

import com.casit.cache.bean.category;

public interface categoryService {
    category findByName(String name);
}

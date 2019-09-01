package com.casit.cache.service;

import com.casit.cache.bean.category;

public interface categoryService {
    category findByName(category c);
    category update(category c);
    category delete(category c);
}

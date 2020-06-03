package com.wanghang.projectsdk.third.service;

import com.wanghang.projectsdk.base.entity.Product;
import com.wanghang.projectsdk.third.controller.IProductController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wanghang
 * 2020/5/26
 **/
public abstract class AbstractProductService<T>  implements IProductController {


    @Override
    public List<Product> getListByRandom(Integer num) {
        return getThirdListByRandom(num).stream().map(this::convertThird).collect(Collectors.toList());
    }

    @Override
    public Product getOneByNo(String no) {
        return convertThird(getThirdOneByNo(no));
    }

    protected abstract List<T> getThirdListByRandom(Integer num);

    protected abstract T getThirdOneByNo(String no);

    protected abstract Product convertThird(T thirdProduct);
}

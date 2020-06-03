package com.wanghang.projectsdk.third.service;

import com.wanghang.projectsdk.base.entity.Product;
import com.wanghang.projectsdk.base.entity.Remark;
import com.wanghang.projectsdk.third.controller.IRemarkController;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wanghang
 * 2020/5/26
 **/
public abstract class AbstractRemarkService<T> implements IRemarkController {

    @Override
    public List<Remark> getListByProductNoAndSkipAndLimit(String productNo, Integer skip, Integer limit) {
        return getThirdListByProductNoAndSkipAndLimit(productNo, skip, limit)
                .stream().map(this::convertThird).collect(Collectors.toList());
    }

    protected abstract List<T> getThirdListByProductNoAndSkipAndLimit(String productNo, Integer skip, Integer limit);

    protected abstract Remark convertThird(T thirdRemark);


    @Override
    public String doRemark(Remark remark) {
        return remarkThird(convertToThird(remark));
    }

    protected abstract T convertToThird(Remark remark);

    protected abstract String remarkThird(T thirdRemark);

}

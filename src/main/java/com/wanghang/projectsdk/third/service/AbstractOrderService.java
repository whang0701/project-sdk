package com.wanghang.projectsdk.third.service;

import com.wanghang.projectsdk.base.entity.Order;
import com.wanghang.projectsdk.base.entity.Product;
import com.wanghang.projectsdk.third.controller.IOrderController;
import com.wanghang.projectsdk.third.controller.IProductController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wanghang
 * 2020/5/26
 **/
public abstract class AbstractOrderService<T>  implements IOrderController {


    @Override
    public String doPlace(Order order) {
        return placeThirdOrder(convertToThird(order));
    }

    protected abstract String placeThirdOrder(T thirdOrder);

    protected abstract T convertToThird(Order order);
}

package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);

    /**
     * 设置订单为已支付（根据订单号）
     * @param orders
     */
    @Update("update orders set pay_method=#{payMethod},status=#{status},pay_status=#{payStatus},checkout_time=#{checkoutTime} where number=#{number}")
    void setPaid(Orders orders);
}

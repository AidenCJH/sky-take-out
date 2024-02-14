package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     *
     * @param orders
     */
    void insert(Orders orders);

    /**
     * 设置订单为已支付（根据订单号）
     *
     * @param orders
     */
    @Update("update orders set pay_method=#{payMethod},status=#{status},pay_status=#{payStatus},checkout_time=#{checkoutTime} where number=#{number}")
    void setPaid(Orders orders);

    /**
     * 根据状态和下单时间查询订单
     *
     * @param status
     * @param orderTime
     * @return
     */
    @Select("select * from orders where status=#{status} and order_time<#{orderTime}")
    List<Orders> getByStatusAndOrderTimeLT(Integer status, LocalDateTime orderTime);

    /**
     * 更新订单
     * @param orders
     */
    void update(Orders orders);
}

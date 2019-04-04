package vip.anjun.dubbo.one.model.mapper;

import vip.anjun.dubbo.one.model.entity.OrderRecord;

/**
 * @author anjun
 * @date 2019-04-04 16:52
 */
public interface OrderRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    OrderRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}

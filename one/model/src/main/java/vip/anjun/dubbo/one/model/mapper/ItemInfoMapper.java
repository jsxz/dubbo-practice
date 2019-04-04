package vip.anjun.dubbo.one.model.mapper;

/**
 * @author anjun
 * @date 2019-04-04 16:52
 */
import org.apache.ibatis.annotations.Param;
import vip.anjun.dubbo.one.model.entity.ItemInfo;

import java.util.List;

public interface ItemInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    ItemInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    List<ItemInfo> selectAll();

    List<ItemInfo> selectAllByParams(@Param("search") String search);
}



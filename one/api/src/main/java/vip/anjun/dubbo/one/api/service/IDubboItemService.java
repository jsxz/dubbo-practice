package vip.anjun.dubbo.one.api.service;

import vip.anjun.dubbo.one.api.response.BaseResponse;

/**
 * @author anjun
 * @date 2019-04-04 16:58
 */
public interface IDubboItemService {

    BaseResponse listItems();

    BaseResponse listPageItems(Integer pageNo,Integer pageSize);

    BaseResponse listPageItemsParams(Integer pageNo,Integer pageSize,String search);

}
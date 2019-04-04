package vip.anjun.dubbo.one.api.service;

import vip.anjun.dubbo.one.api.request.PushOrderDto;
import vip.anjun.dubbo.one.api.response.BaseResponse;

/**
 * @author anjun
 * @date 2019-04-04 16:59
 */
public interface IDubboRecordService {

    public BaseResponse pushOrder(PushOrderDto dto);

}

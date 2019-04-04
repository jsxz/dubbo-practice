package vip.anjun.dubbo.one.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author anjun
 * @date 2019-04-04 17:00
 */
@Data
public class PushOrderDto implements Serializable {

    //商品id
    private Integer itemId;

    //下单数量
    private Integer total;

    //客户姓名
    private String customerName;
}


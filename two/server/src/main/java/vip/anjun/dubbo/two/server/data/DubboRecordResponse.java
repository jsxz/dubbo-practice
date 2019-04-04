package vip.anjun.dubbo.two.server.data;/**
 * Created by Administrator on 2019/1/20.
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author:anjun
 * @Date: 2019/1/20 18:35
 **/
@Data
@ToString
public class DubboRecordResponse implements Serializable{

    private Integer code;

    private String msg;

    private Integer data;
}
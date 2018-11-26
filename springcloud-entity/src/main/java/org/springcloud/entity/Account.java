package org.springcloud.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户实体类
 * @author chenxinming
 */
@Data
public class Account  implements Serializable{
    private static final long serialVersionUID = -81849676368907419L;
    /**
     * 帐号id
     */
    private Integer id;

    /**
     * 帐号对应的用户id
     */
    private String userId;
    /**
     * 用户余额
     */
    private BigDecimal balance;

    /**
     * 冻结金额，扣款暂存余额
     */
    private BigDecimal freezeAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}

package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 饲养员基本信息对象 sys_breeder
 * 
 * @author cjh
 * @date 2021-01-02
 */
public class SysBreeder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 饲养员ID */
    private Long breederId;

    /** 饲养员昵称 */
    @Excel(name = "饲养员昵称")
    private String breederName;

    /** 饲养员工龄 */
    @Excel(name = "饲养员工龄")
    private String breederSl;

    /** 饲养员年龄 */
    @Excel(name = "饲养员年龄")
    private Integer breederAge;

    /** 饲养员出生日期 */
    @Excel(name = "饲养员出生日期")
    private String breederBirth;

    public void setBreederId(Long breederId) 
    {
        this.breederId = breederId;
    }

    public Long getBreederId() 
    {
        return breederId;
    }
    public void setBreederName(String breederName) 
    {
        this.breederName = breederName;
    }

    public String getBreederName() 
    {
        return breederName;
    }
    public void setBreederSl(String breederSl) 
    {
        this.breederSl = breederSl;
    }

    public String getBreederSl() 
    {
        return breederSl;
    }
    public void setBreederAge(Integer breederAge) 
    {
        this.breederAge = breederAge;
    }

    public Integer getBreederAge() 
    {
        return breederAge;
    }
    public void setBreederBirth(String breederBirth) 
    {
        this.breederBirth = breederBirth;
    }

    public String getBreederBirth() 
    {
        return breederBirth;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("breederId", getBreederId())
            .append("breederName", getBreederName())
            .append("breederSl", getBreederSl())
            .append("breederAge", getBreederAge())
            .append("breederBirth", getBreederBirth())
            .toString();
    }
}

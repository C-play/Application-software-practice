package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宠物基本信息对象 sys_pet
 * 
 * @author cjh
 * @date 2021-01-01
 */
public class SysPet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 宠物ID */
    private Long petId;

    /** 宠物昵称 */
    @Excel(name = "宠物昵称")
    private String petName;

    /** 宠物种类 */
    @Excel(name = "宠物种类")
    private String petKind;

    /** 宠物年龄 */
    @Excel(name = "宠物年龄")
    private Integer petAge;

    /** 宠物出生日期 */
    @Excel(name = "宠物出生日期")
    private String petBirth;

    /** 宠物体重 */
    @Excel(name = "宠物体重")
    private String petWeight;

    /** 宠物毛色 */
    @Excel(name = "宠物毛色")
    private String petColor;

    /** 宠物喜好 */
    @Excel(name = "宠物喜好")
    private String petLike;

    public void setPetId(Long petId) 
    {
        this.petId = petId;
    }

    public Long getPetId() 
    {
        return petId;
    }
    public void setPetName(String petName) 
    {
        this.petName = petName;
    }

    public String getPetName() 
    {
        return petName;
    }
    public void setPetKind(String petKind) 
    {
        this.petKind = petKind;
    }

    public String getPetKind() 
    {
        return petKind;
    }
    public void setPetAge(Integer petAge) 
    {
        this.petAge = petAge;
    }

    public Integer getPetAge() 
    {
        return petAge;
    }
    public void setPetBirth(String petBirth) 
    {
        this.petBirth = petBirth;
    }

    public String getPetBirth() 
    {
        return petBirth;
    }
    public void setPetWeight(String petWeight) 
    {
        this.petWeight = petWeight;
    }

    public String getPetWeight() 
    {
        return petWeight;
    }
    public void setPetColor(String petColor) 
    {
        this.petColor = petColor;
    }

    public String getPetColor() 
    {
        return petColor;
    }
    public void setPetLike(String petLike) 
    {
        this.petLike = petLike;
    }

    public String getPetLike() 
    {
        return petLike;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("petId", getPetId())
            .append("petName", getPetName())
            .append("petKind", getPetKind())
            .append("petAge", getPetAge())
            .append("petBirth", getPetBirth())
            .append("petWeight", getPetWeight())
            .append("petColor", getPetColor())
            .append("petLike", getPetLike())
            .toString();
    }
}

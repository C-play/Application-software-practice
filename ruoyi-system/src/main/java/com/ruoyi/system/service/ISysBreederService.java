package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysBreeder;

/**
 * 饲养员基本信息Service接口
 * 
 * @author cjh
 * @date 2021-01-02
 */
public interface ISysBreederService 
{
    /**
     * 查询饲养员基本信息
     * 
     * @param breederId 饲养员基本信息ID
     * @return 饲养员基本信息
     */
    public SysBreeder selectSysBreederById(Long breederId);

    /**
     * 查询饲养员基本信息列表
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 饲养员基本信息集合
     */
    public List<SysBreeder> selectSysBreederList(SysBreeder sysBreeder);

    /**
     * 新增饲养员基本信息
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 结果
     */
    public int insertSysBreeder(SysBreeder sysBreeder);

    /**
     * 修改饲养员基本信息
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 结果
     */
    public int updateSysBreeder(SysBreeder sysBreeder);

    /**
     * 批量删除饲养员基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysBreederByIds(String ids);

    /**
     * 删除饲养员基本信息信息
     * 
     * @param breederId 饲养员基本信息ID
     * @return 结果
     */
    public int deleteSysBreederById(Long breederId);
}

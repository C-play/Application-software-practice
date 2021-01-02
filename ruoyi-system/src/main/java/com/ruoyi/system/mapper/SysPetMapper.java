package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPet;

/**
 * 宠物基本信息Mapper接口
 * 
 * @author cjh
 * @date 2021-01-01
 */
public interface SysPetMapper 
{
    /**
     * 查询宠物基本信息
     * 
     * @param petId 宠物基本信息ID
     * @return 宠物基本信息
     */
    public SysPet selectSysPetById(Long petId);

    /**
     * 查询宠物基本信息列表
     * 
     * @param sysPet 宠物基本信息
     * @return 宠物基本信息集合
     */
    public List<SysPet> selectSysPetList(SysPet sysPet);

    /**
     * 新增宠物基本信息
     * 
     * @param sysPet 宠物基本信息
     * @return 结果
     */
    public int insertSysPet(SysPet sysPet);

    /**
     * 修改宠物基本信息
     * 
     * @param sysPet 宠物基本信息
     * @return 结果
     */
    public int updateSysPet(SysPet sysPet);

    /**
     * 删除宠物基本信息
     * 
     * @param petId 宠物基本信息ID
     * @return 结果
     */
    public int deleteSysPetById(Long petId);

    /**
     * 批量删除宠物基本信息
     * 
     * @param petIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPetByIds(String[] petIds);
}

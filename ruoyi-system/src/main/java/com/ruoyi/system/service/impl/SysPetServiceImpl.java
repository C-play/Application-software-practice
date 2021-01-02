package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPetMapper;
import com.ruoyi.system.domain.SysPet;
import com.ruoyi.system.service.ISysPetService;
import com.ruoyi.common.core.text.Convert;

/**
 * 宠物基本信息Service业务层处理
 * 
 * @author cjh
 * @date 2021-01-01
 */
@Service
public class SysPetServiceImpl implements ISysPetService 
{
    @Autowired
    private SysPetMapper sysPetMapper;

    /**
     * 查询宠物基本信息
     * 
     * @param petId 宠物基本信息ID
     * @return 宠物基本信息
     */
    @Override
    public SysPet selectSysPetById(Long petId)
    {
        return sysPetMapper.selectSysPetById(petId);
    }

    /**
     * 查询宠物基本信息列表
     * 
     * @param sysPet 宠物基本信息
     * @return 宠物基本信息
     */
    @Override
    public List<SysPet> selectSysPetList(SysPet sysPet)
    {
        return sysPetMapper.selectSysPetList(sysPet);
    }

    /**
     * 新增宠物基本信息
     * 
     * @param sysPet 宠物基本信息
     * @return 结果
     */
    @Override
    public int insertSysPet(SysPet sysPet)
    {
        return sysPetMapper.insertSysPet(sysPet);
    }

    /**
     * 修改宠物基本信息
     * 
     * @param sysPet 宠物基本信息
     * @return 结果
     */
    @Override
    public int updateSysPet(SysPet sysPet)
    {
        return sysPetMapper.updateSysPet(sysPet);
    }

    /**
     * 删除宠物基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPetByIds(String ids)
    {
        return sysPetMapper.deleteSysPetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除宠物基本信息信息
     * 
     * @param petId 宠物基本信息ID
     * @return 结果
     */
    @Override
    public int deleteSysPetById(Long petId)
    {
        return sysPetMapper.deleteSysPetById(petId);
    }
}

package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysBreederMapper;
import com.ruoyi.system.domain.SysBreeder;
import com.ruoyi.system.service.ISysBreederService;
import com.ruoyi.common.core.text.Convert;

/**
 * 饲养员基本信息Service业务层处理
 * 
 * @author cjh
 * @date 2021-01-02
 */
@Service
public class SysBreederServiceImpl implements ISysBreederService 
{
    @Autowired
    private SysBreederMapper sysBreederMapper;

    /**
     * 查询饲养员基本信息
     * 
     * @param breederId 饲养员基本信息ID
     * @return 饲养员基本信息
     */
    @Override
    public SysBreeder selectSysBreederById(Long breederId)
    {
        return sysBreederMapper.selectSysBreederById(breederId);
    }

    /**
     * 查询饲养员基本信息列表
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 饲养员基本信息
     */
    @Override
    public List<SysBreeder> selectSysBreederList(SysBreeder sysBreeder)
    {
        return sysBreederMapper.selectSysBreederList(sysBreeder);
    }

    /**
     * 新增饲养员基本信息
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 结果
     */
    @Override
    public int insertSysBreeder(SysBreeder sysBreeder)
    {
        return sysBreederMapper.insertSysBreeder(sysBreeder);
    }

    /**
     * 修改饲养员基本信息
     * 
     * @param sysBreeder 饲养员基本信息
     * @return 结果
     */
    @Override
    public int updateSysBreeder(SysBreeder sysBreeder)
    {
        return sysBreederMapper.updateSysBreeder(sysBreeder);
    }

    /**
     * 删除饲养员基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysBreederByIds(String ids)
    {
        return sysBreederMapper.deleteSysBreederByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除饲养员基本信息信息
     * 
     * @param breederId 饲养员基本信息ID
     * @return 结果
     */
    @Override
    public int deleteSysBreederById(Long breederId)
    {
        return sysBreederMapper.deleteSysBreederById(breederId);
    }
}

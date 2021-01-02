package com.ruoyi.web.controller.system;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPet;
import com.ruoyi.system.service.ISysPetService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宠物基本信息Controller
 * 
 * @author cjh
 * @date 2021-01-01
 */
@Controller
@RequestMapping("/system/pet")
public class SysPetController extends BaseController
{
    private String prefix = "system/pet";

    @Autowired
    private ISysPetService sysPetService;

    @RequiresPermissions("system:pet:view")
    @GetMapping()
    public String pet()
    {
        return prefix + "/pet";
    }

    /**
     * 查询宠物基本信息列表
     */
    @RequiresPermissions("system:pet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPet sysPet)
    {
        startPage();
        List<SysPet> list = sysPetService.selectSysPetList(sysPet);
        return getDataTable(list);
    }

    /**
     * 导出宠物基本信息列表
     */
    @RequiresPermissions("system:pet:export")
    @Log(title = "宠物基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPet sysPet)
    {
        List<SysPet> list = sysPetService.selectSysPetList(sysPet);
        ExcelUtil<SysPet> util = new ExcelUtil<SysPet>(SysPet.class);
        return util.exportExcel(list, "pet");
    }

    /**
     * 新增宠物基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宠物基本信息
     */
    @RequiresPermissions("system:pet:add")
    @Log(title = "宠物基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPet sysPet)
    {
        return toAjax(sysPetService.insertSysPet(sysPet));
    }

    /**
     * 修改宠物基本信息
     */
    @GetMapping("/edit/{petId}")
    public String edit(@PathVariable("petId") Long petId, ModelMap mmap)
    {
        SysPet sysPet = sysPetService.selectSysPetById(petId);
        mmap.put("sysPet", sysPet);
        return prefix + "/edit";
    }

    /**
     * 修改保存宠物基本信息
     */
    @RequiresPermissions("system:pet:edit")
    @Log(title = "宠物基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPet sysPet)
    {
        return toAjax(sysPetService.updateSysPet(sysPet));
    }

    /**
     * 删除宠物基本信息
     */
    @RequiresPermissions("system:pet:remove")
    @Log(title = "宠物基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysPetService.deleteSysPetByIds(ids));
    }
}

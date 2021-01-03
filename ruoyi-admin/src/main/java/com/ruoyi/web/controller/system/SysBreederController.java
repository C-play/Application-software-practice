package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.ruoyi.system.domain.SysBreeder;
import com.ruoyi.system.service.ISysBreederService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 饲养员基本信息Controller
 * 
 * @author cjh
 * @date 2021-01-02
 */
@Controller
@RequestMapping("/system/breeder")
public class SysBreederController extends BaseController
{
    private String prefix = "system/breeder";

    @Autowired
    private ISysBreederService sysBreederService;

    @RequiresPermissions("system:breeder:view")
    @GetMapping()
    public String breeder()
    {
        return prefix + "/breeder";
    }

    /**
     * 查询饲养员基本信息列表
     */
    @RequiresPermissions("system:breeder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysBreeder sysBreeder)
    {
        startPage();
        List<SysBreeder> list = sysBreederService.selectSysBreederList(sysBreeder);
        return getDataTable(list);
    }

    /**
     * 导出饲养员基本信息列表
     */
    @RequiresPermissions("system:breeder:export")
    @Log(title = "饲养员基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysBreeder sysBreeder)
    {
        List<SysBreeder> list = sysBreederService.selectSysBreederList(sysBreeder);
        ExcelUtil<SysBreeder> util = new ExcelUtil<SysBreeder>(SysBreeder.class);
        return util.exportExcel(list, "breeder");
    }

    /**
     * 新增饲养员基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存饲养员基本信息
     */
    @RequiresPermissions("system:breeder:add")
    @Log(title = "饲养员基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysBreeder sysBreeder)
    {
        return toAjax(sysBreederService.insertSysBreeder(sysBreeder));
    }

    /**
     * 修改饲养员基本信息
     */
    @GetMapping("/edit/{breederId}")
    public String edit(@PathVariable("breederId") Long breederId, ModelMap mmap)
    {
        SysBreeder sysBreeder = sysBreederService.selectSysBreederById(breederId);
        mmap.put("sysBreeder", sysBreeder);
        return prefix + "/edit";
    }

    /**
     * 修改保存饲养员基本信息
     */
    @RequiresPermissions("system:breeder:edit")
    @Log(title = "饲养员基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysBreeder sysBreeder)
    {
        return toAjax(sysBreederService.updateSysBreeder(sysBreeder));
    }

    /**
     * 删除饲养员基本信息
     */
    @RequiresPermissions("system:breeder:remove")
    @Log(title = "饲养员基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysBreederService.deleteSysBreederByIds(ids));
    }
}

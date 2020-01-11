package com.jc.api.controller;

import com.jc.api.entity.SwmsBasicMaterialSubType;
import com.jc.api.service.restservice.ISwmsBasicMaterialSubTypeService;
import com.jinchi.common.core.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @Auther: River
 * @Date: 2020/1/11 18:02
 * @Description:    物料子类型controller层
 */
@RestController
@Api(tags = "智能仓库-物料子类型信息管理界面")
@RequestMapping(value = "/swmsBasicMaterialSubType")
@Slf4j
public class SwmsBasicMaterialSubTypeController {

    @Autowired
    private ISwmsBasicMaterialSubTypeService ISwmsBasicMaterialSubTypeService;

    @ApiOperation(value = "获取所有物料子类型", notes = "获取所有物料子类型")
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @GetMapping(value = "/getAll")
    public Result getAll(){
        SwmsBasicMaterialSubType subType = new SwmsBasicMaterialSubType();
        return Result.success(ISwmsBasicMaterialSubTypeService.getAll(subType));
    }

    @ApiOperation(value = "新增物料子类型信息", notes = "新增")
    @ApiImplicitParam(name = "swmsBasicMaterialSubType", value = "新增参数", required = true, dataType = "SwmsBasicMaterialSubType")
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @PostMapping(value = "/add")
    public Result add(@Valid @RequestBody SwmsBasicMaterialSubType swmsBasicMaterialSubType) {
        swmsBasicMaterialSubType.setAutoFlag(false);
        return Result.success(ISwmsBasicMaterialSubTypeService.add(swmsBasicMaterialSubType));
    }

    @ApiOperation(value = "仅供测试使用-自动新增物料子类型信息", notes = "自动新增,存在则无动作,不存在则新增")
    @ApiImplicitParam(name = "typeCode", value = "物料类型代号", required = true, dataType = "String")
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @PostMapping(value = "/autoAdd")
    public Result autoAdd(@RequestParam @NotBlank(message = "物料类型代号不能为空白") String subTypeCode, @RequestParam @NotBlank(message = "父类型ID不能为空白")Integer typeId) {
        return Result.success(ISwmsBasicMaterialSubTypeService.autoAdd(new SwmsBasicMaterialSubType().setSubTypeCode(subTypeCode).setTypeId(typeId)));
    }

    @ApiOperation(value = "更新物料子类型信息", notes = "更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "swmsBasicMaterialSubTypeService", value = "更新参数", required = true, dataType = "SwmsBasicMaterialSubType")})
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @PutMapping(value = "/{id}")
    public Result update(@RequestBody SwmsBasicMaterialSubType swmsBasicMaterialSubType) {
        return Result.success(ISwmsBasicMaterialSubTypeService.update(swmsBasicMaterialSubType));
    }

    @ApiOperation(value = "删除物料子类型信息", notes = "根据id删除物料子类型信息")
    @ApiImplicitParam(name = "id", value = "物料子类型信息id", required = true, dataType = "long")
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Integer id) {
        log.debug("根据id删除物料子类型记录:{}", id);
        return Result.success(ISwmsBasicMaterialSubTypeService.delete(id));
    }
}

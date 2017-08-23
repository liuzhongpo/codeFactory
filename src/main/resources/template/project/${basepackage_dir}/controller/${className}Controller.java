<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.*;
import springfox.documentation.annotations.ApiIgnore;

import com.eztcn.web.BaseController;

import com.github.pagehelper.PageInfo;
import ${basepackage}.service.*;
<#include "/java_imports.include">

@Api(description = "${className}CRUD",tags = "${className}Controller",basePath = "/${classNameLower}s")
@RestController
@RequestMapping("/${classNameLower}s")
public class ${className}Controller extends BaseController {

	@Resource
	I${className}Service ${classNameLower}Service;


    @ApiOperation(value="查询列表", notes="")
    @ApiResponse(code = 200,message = "",response = PageInfo.class)
	@RequestMapping(value = "",method = RequestMethod.GET)
	public PageInfo list() {
        PageInfo<${className}> ${classNameLower}s = ${classNameLower}Service.findList(getPageNumber(), getPageSize());

        return ${classNameLower}s;
	}

    @ApiOperation(value="根据id查询指定的${className}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, defaultValue = "",dataType = "Long",paramType = "path"),
    })
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ${className} get(@PathVariable("id") Long id){
        ${className} ${classNameLower} = ${classNameLower}Service.findById(id);

        return ${classNameLower};
	}

    @ApiOperation(value="新增${className}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, defaultValue = "",dataType = "Long",paramType = "path"),
    })
    @RequestMapping(value = "",method = RequestMethod.POST)
	public ${className} add(@RequestBody ${className} ${classNameLower}) {

        ${classNameLower}Service.save(${classNameLower});

        return ${classNameLower};
	}

    @ApiOperation(value="更新指定的${className}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, defaultValue = "",dataType = "Long",paramType = "path"),
    })
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
	public ${className} update(@PathVariable("id") Long id, @RequestBody ${className} ${classNameLower}) {
        ${className} db${className}=${classNameLower}Service.findById(id);
        BeanUtils.copyProperties(${classNameLower},db${className});

        ${classNameLower}Service.update(db${className});

        return ${classNameLower};
	}

    @ApiOperation(value="根据id删除指定的${className}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, defaultValue = "",dataType = "Long",paramType = "path"),
    })
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
        ${classNameLower}Service.deleteById(id);
    }
	
}

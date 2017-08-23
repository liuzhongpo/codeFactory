<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ${basepackage}.mapper.${className}Mapper;
import ${basepackage}.service.I${className}Service;
import ${basepackage}.entity.${className};
import ${basepackage}.entity.${className}Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("${classNameLower}Service")
public class ${className}ServiceImpl implements I${className}Service {

	@Resource
	${className}Mapper ${classNameLower}Mapper;
	
	public PageInfo<${className}> findList(Integer pageNumber, Integer pageSize) {
        ${className}Example ${classNameLower}Example=new ${className}Example();

        ${className}Example.Criteria criteria=${classNameLower}Example.createCriteria();


        PageHelper.startPage(pageNumber, pageSize);
        List<${className}> list =  ${classNameLower}Mapper.selectByExample(${classNameLower}Example);

        PageInfo<${className}> ${classNameLower}s = new PageInfo<>(list);

        return ${classNameLower}s;
	}
	
	public ${className} findById(Long id){
		return ${classNameLower}Mapper.findById(id);
	}
	 
    public void deleteById(Long id){
    	${classNameLower}Mapper.deleteById(id);
    }
    
    public void update(${className} ${classNameLower}){
    	${classNameLower}Mapper.update(${classNameLower});
    }
    
	public void save(${className} ${classNameLower}){
		${classNameLower}Mapper.insert(${classNameLower});
	}
    
  
}

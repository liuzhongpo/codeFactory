<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import java.util.List;
import java.util.Map;

<#include "/java_imports.include">
import com.github.pagehelper.PageInfo;

public interface I${className}Service {

	void save(${className} ${classNameLower});
	
    void update(${className} ${classNameLower});
    
    void deleteById(Long id);
    
    ${className} findById(Long id);

    PageInfo<${className}> findList(Integer pageNumber, Integer pageSize);
    
}

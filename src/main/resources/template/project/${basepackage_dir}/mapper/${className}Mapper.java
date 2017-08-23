<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.mapper;

import java.util.List;
<#include "/java_imports.include">

public interface ${className}Mapper {

	void insert(${className} ${classNameLower});

    void update(${className} ${classNameLower});

    void deleteById(Long id);

    ${className} findById(Long id);

	List<${className}> selectByExample(${className}Example example);

}

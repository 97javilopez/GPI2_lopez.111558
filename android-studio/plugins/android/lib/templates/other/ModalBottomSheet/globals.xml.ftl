<?xml version="1.0"?>
<globals>
    <global id="resOut" value="${resDir}" />
    <global id="srcOut" value="${srcDir}/${slashedPackageName(packageName)}" />
    <global id="collection_name" value="${extractLetters(objectKind?lower_case)}" />
    <#include "root://activities/common/kotlin_globals.xml.ftl" />
    <#include "root://activities/common/common_globals.xml.ftl" />
</globals>

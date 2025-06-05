// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class FunctionInfoPb {
  @JsonProperty("browse_only")
  private Boolean browseOnly;

  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  @JsonProperty("external_language")
  private String externalLanguage;

  @JsonProperty("external_name")
  private String externalName;

  @JsonProperty("full_data_type")
  private String fullDataType;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("function_id")
  private String functionId;

  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  @JsonProperty("is_deterministic")
  private Boolean isDeterministic;

  @JsonProperty("is_null_call")
  private Boolean isNullCall;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("parameter_style")
  private FunctionInfoParameterStyle parameterStyle;

  @JsonProperty("properties")
  private String properties;

  @JsonProperty("return_params")
  private FunctionParameterInfos returnParams;

  @JsonProperty("routine_body")
  private FunctionInfoRoutineBody routineBody;

  @JsonProperty("routine_definition")
  private String routineDefinition;

  @JsonProperty("routine_dependencies")
  private DependencyList routineDependencies;

  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("security_type")
  private FunctionInfoSecurityType securityType;

  @JsonProperty("specific_name")
  private String specificName;

  @JsonProperty("sql_data_access")
  private FunctionInfoSqlDataAccess sqlDataAccess;

  @JsonProperty("sql_path")
  private String sqlPath;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  public FunctionInfoPb setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public FunctionInfoPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public FunctionInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FunctionInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public FunctionInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public FunctionInfoPb setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public FunctionInfoPb setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

  public String getExternalLanguage() {
    return externalLanguage;
  }

  public FunctionInfoPb setExternalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  public String getExternalName() {
    return externalName;
  }

  public FunctionInfoPb setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public FunctionInfoPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public FunctionInfoPb setFunctionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

  public String getFunctionId() {
    return functionId;
  }

  public FunctionInfoPb setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }

  public FunctionInfoPb setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

  public Boolean getIsDeterministic() {
    return isDeterministic;
  }

  public FunctionInfoPb setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

  public Boolean getIsNullCall() {
    return isNullCall;
  }

  public FunctionInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public FunctionInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FunctionInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public FunctionInfoPb setParameterStyle(FunctionInfoParameterStyle parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

  public FunctionInfoParameterStyle getParameterStyle() {
    return parameterStyle;
  }

  public FunctionInfoPb setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public FunctionInfoPb setReturnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  public FunctionParameterInfos getReturnParams() {
    return returnParams;
  }

  public FunctionInfoPb setRoutineBody(FunctionInfoRoutineBody routineBody) {
    this.routineBody = routineBody;
    return this;
  }

  public FunctionInfoRoutineBody getRoutineBody() {
    return routineBody;
  }

  public FunctionInfoPb setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public FunctionInfoPb setRoutineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  public DependencyList getRoutineDependencies() {
    return routineDependencies;
  }

  public FunctionInfoPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public FunctionInfoPb setSecurityType(FunctionInfoSecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

  public FunctionInfoSecurityType getSecurityType() {
    return securityType;
  }

  public FunctionInfoPb setSpecificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

  public String getSpecificName() {
    return specificName;
  }

  public FunctionInfoPb setSqlDataAccess(FunctionInfoSqlDataAccess sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

  public FunctionInfoSqlDataAccess getSqlDataAccess() {
    return sqlDataAccess;
  }

  public FunctionInfoPb setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  public String getSqlPath() {
    return sqlPath;
  }

  public FunctionInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public FunctionInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionInfoPb that = (FunctionInfoPb) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataType, that.dataType)
        && Objects.equals(externalLanguage, that.externalLanguage)
        && Objects.equals(externalName, that.externalName)
        && Objects.equals(fullDataType, that.fullDataType)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(functionId, that.functionId)
        && Objects.equals(inputParams, that.inputParams)
        && Objects.equals(isDeterministic, that.isDeterministic)
        && Objects.equals(isNullCall, that.isNullCall)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(parameterStyle, that.parameterStyle)
        && Objects.equals(properties, that.properties)
        && Objects.equals(returnParams, that.returnParams)
        && Objects.equals(routineBody, that.routineBody)
        && Objects.equals(routineDefinition, that.routineDefinition)
        && Objects.equals(routineDependencies, that.routineDependencies)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(securityType, that.securityType)
        && Objects.equals(specificName, that.specificName)
        && Objects.equals(sqlDataAccess, that.sqlDataAccess)
        && Objects.equals(sqlPath, that.sqlPath)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogName,
        comment,
        createdAt,
        createdBy,
        dataType,
        externalLanguage,
        externalName,
        fullDataType,
        fullName,
        functionId,
        inputParams,
        isDeterministic,
        isNullCall,
        metastoreId,
        name,
        owner,
        parameterStyle,
        properties,
        returnParams,
        routineBody,
        routineDefinition,
        routineDependencies,
        schemaName,
        securityType,
        specificName,
        sqlDataAccess,
        sqlPath,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionInfoPb.class)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataType", dataType)
        .add("externalLanguage", externalLanguage)
        .add("externalName", externalName)
        .add("fullDataType", fullDataType)
        .add("fullName", fullName)
        .add("functionId", functionId)
        .add("inputParams", inputParams)
        .add("isDeterministic", isDeterministic)
        .add("isNullCall", isNullCall)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("parameterStyle", parameterStyle)
        .add("properties", properties)
        .add("returnParams", returnParams)
        .add("routineBody", routineBody)
        .add("routineDefinition", routineDefinition)
        .add("routineDependencies", routineDependencies)
        .add("schemaName", schemaName)
        .add("securityType", securityType)
        .add("specificName", specificName)
        .add("sqlDataAccess", sqlDataAccess)
        .add("sqlPath", sqlPath)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateFunctionPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  @JsonProperty("external_language")
  private String externalLanguage;

  @JsonProperty("external_name")
  private String externalName;

  @JsonProperty("full_data_type")
  private String fullDataType;

  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  @JsonProperty("is_deterministic")
  private Boolean isDeterministic;

  @JsonProperty("is_null_call")
  private Boolean isNullCall;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parameter_style")
  private CreateFunctionParameterStyle parameterStyle;

  @JsonProperty("properties")
  private String properties;

  @JsonProperty("return_params")
  private FunctionParameterInfos returnParams;

  @JsonProperty("routine_body")
  private CreateFunctionRoutineBody routineBody;

  @JsonProperty("routine_definition")
  private String routineDefinition;

  @JsonProperty("routine_dependencies")
  private DependencyList routineDependencies;

  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("security_type")
  private CreateFunctionSecurityType securityType;

  @JsonProperty("specific_name")
  private String specificName;

  @JsonProperty("sql_data_access")
  private CreateFunctionSqlDataAccess sqlDataAccess;

  @JsonProperty("sql_path")
  private String sqlPath;

  public CreateFunctionPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateFunctionPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateFunctionPb setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public CreateFunctionPb setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

  public String getExternalLanguage() {
    return externalLanguage;
  }

  public CreateFunctionPb setExternalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  public String getExternalName() {
    return externalName;
  }

  public CreateFunctionPb setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public CreateFunctionPb setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }

  public CreateFunctionPb setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

  public Boolean getIsDeterministic() {
    return isDeterministic;
  }

  public CreateFunctionPb setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

  public Boolean getIsNullCall() {
    return isNullCall;
  }

  public CreateFunctionPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateFunctionPb setParameterStyle(CreateFunctionParameterStyle parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

  public CreateFunctionParameterStyle getParameterStyle() {
    return parameterStyle;
  }

  public CreateFunctionPb setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public CreateFunctionPb setReturnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  public FunctionParameterInfos getReturnParams() {
    return returnParams;
  }

  public CreateFunctionPb setRoutineBody(CreateFunctionRoutineBody routineBody) {
    this.routineBody = routineBody;
    return this;
  }

  public CreateFunctionRoutineBody getRoutineBody() {
    return routineBody;
  }

  public CreateFunctionPb setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public CreateFunctionPb setRoutineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  public DependencyList getRoutineDependencies() {
    return routineDependencies;
  }

  public CreateFunctionPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateFunctionPb setSecurityType(CreateFunctionSecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

  public CreateFunctionSecurityType getSecurityType() {
    return securityType;
  }

  public CreateFunctionPb setSpecificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

  public String getSpecificName() {
    return specificName;
  }

  public CreateFunctionPb setSqlDataAccess(CreateFunctionSqlDataAccess sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

  public CreateFunctionSqlDataAccess getSqlDataAccess() {
    return sqlDataAccess;
  }

  public CreateFunctionPb setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  public String getSqlPath() {
    return sqlPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFunctionPb that = (CreateFunctionPb) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(dataType, that.dataType)
        && Objects.equals(externalLanguage, that.externalLanguage)
        && Objects.equals(externalName, that.externalName)
        && Objects.equals(fullDataType, that.fullDataType)
        && Objects.equals(inputParams, that.inputParams)
        && Objects.equals(isDeterministic, that.isDeterministic)
        && Objects.equals(isNullCall, that.isNullCall)
        && Objects.equals(name, that.name)
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
        && Objects.equals(sqlPath, that.sqlPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        comment,
        dataType,
        externalLanguage,
        externalName,
        fullDataType,
        inputParams,
        isDeterministic,
        isNullCall,
        name,
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
        sqlPath);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFunctionPb.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("dataType", dataType)
        .add("externalLanguage", externalLanguage)
        .add("externalName", externalName)
        .add("fullDataType", fullDataType)
        .add("inputParams", inputParams)
        .add("isDeterministic", isDeterministic)
        .add("isNullCall", isNullCall)
        .add("name", name)
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
        .toString();
  }
}

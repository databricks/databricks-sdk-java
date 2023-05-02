// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class FunctionInfo {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this function was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of function creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Scalar function return data type. */
  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  /** External function language. */
  @JsonProperty("external_language")
  private String externalLanguage;

  /** External function name. */
  @JsonProperty("external_name")
  private String externalName;

  /** Pretty printed function data type. */
  @JsonProperty("full_data_type")
  private String fullDataType;

  /** Full name of function, in form of __catalog_name__.__schema_name__.__function__name__ */
  @JsonProperty("full_name")
  private String fullName;

  /** Id of Function, relative to parent schema. */
  @JsonProperty("function_id")
  private String functionId;

  /** The array of __FunctionParameterInfo__ definitions of the function's parameters. */
  @JsonProperty("input_params")
  private Collection<FunctionParameterInfo> inputParams;

  /** Whether the function is deterministic. */
  @JsonProperty("is_deterministic")
  private Boolean isDeterministic;

  /** Function null call. */
  @JsonProperty("is_null_call")
  private Boolean isNullCall;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of function, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of function. */
  @JsonProperty("owner")
  private String owner;

  /** Function parameter style. **S** is the value for SQL. */
  @JsonProperty("parameter_style")
  private FunctionInfoParameterStyle parameterStyle;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Table function return parameters. */
  @JsonProperty("return_params")
  private Collection<FunctionParameterInfo> returnParams;

  /**
   * Function language. When **EXTERNAL** is used, the language of the routine function should be
   * specified in the __external_language__ field, and the __return_params__ of the function cannot
   * be used (as **TABLE** return type is not supported), and the __sql_data_access__ field must be
   * **NO_SQL**.
   */
  @JsonProperty("routine_body")
  private FunctionInfoRoutineBody routineBody;

  /** Function body. */
  @JsonProperty("routine_definition")
  private String routineDefinition;

  /** Function dependencies. */
  @JsonProperty("routine_dependencies")
  private Collection<Dependency> routineDependencies;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Function security type. */
  @JsonProperty("security_type")
  private FunctionInfoSecurityType securityType;

  /** Specific name of the function; Reserved for future use. */
  @JsonProperty("specific_name")
  private String specificName;

  /** Function SQL data access. */
  @JsonProperty("sql_data_access")
  private FunctionInfoSqlDataAccess sqlDataAccess;

  /** List of schemes whose objects can be referenced without qualification. */
  @JsonProperty("sql_path")
  private String sqlPath;

  /** Time at which this function was created, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified function. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public FunctionInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public FunctionInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FunctionInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public FunctionInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public FunctionInfo setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public FunctionInfo setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

  public String getExternalLanguage() {
    return externalLanguage;
  }

  public FunctionInfo setExternalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  public String getExternalName() {
    return externalName;
  }

  public FunctionInfo setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public FunctionInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public FunctionInfo setFunctionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

  public String getFunctionId() {
    return functionId;
  }

  public FunctionInfo setInputParams(Collection<FunctionParameterInfo> inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public Collection<FunctionParameterInfo> getInputParams() {
    return inputParams;
  }

  public FunctionInfo setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

  public Boolean getIsDeterministic() {
    return isDeterministic;
  }

  public FunctionInfo setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

  public Boolean getIsNullCall() {
    return isNullCall;
  }

  public FunctionInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public FunctionInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FunctionInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public FunctionInfo setParameterStyle(FunctionInfoParameterStyle parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

  public FunctionInfoParameterStyle getParameterStyle() {
    return parameterStyle;
  }

  public FunctionInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public FunctionInfo setReturnParams(Collection<FunctionParameterInfo> returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  public Collection<FunctionParameterInfo> getReturnParams() {
    return returnParams;
  }

  public FunctionInfo setRoutineBody(FunctionInfoRoutineBody routineBody) {
    this.routineBody = routineBody;
    return this;
  }

  public FunctionInfoRoutineBody getRoutineBody() {
    return routineBody;
  }

  public FunctionInfo setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public FunctionInfo setRoutineDependencies(Collection<Dependency> routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  public Collection<Dependency> getRoutineDependencies() {
    return routineDependencies;
  }

  public FunctionInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public FunctionInfo setSecurityType(FunctionInfoSecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

  public FunctionInfoSecurityType getSecurityType() {
    return securityType;
  }

  public FunctionInfo setSpecificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

  public String getSpecificName() {
    return specificName;
  }

  public FunctionInfo setSqlDataAccess(FunctionInfoSqlDataAccess sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

  public FunctionInfoSqlDataAccess getSqlDataAccess() {
    return sqlDataAccess;
  }

  public FunctionInfo setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  public String getSqlPath() {
    return sqlPath;
  }

  public FunctionInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public FunctionInfo setUpdatedBy(String updatedBy) {
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
    FunctionInfo that = (FunctionInfo) o;
    return Objects.equals(catalogName, that.catalogName)
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
    return new ToStringer(FunctionInfo.class)
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

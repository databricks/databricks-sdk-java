// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFunction {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

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

  /** */
  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  /** Whether the function is deterministic. */
  @JsonProperty("is_deterministic")
  private Boolean isDeterministic;

  /** Function null call. */
  @JsonProperty("is_null_call")
  private Boolean isNullCall;

  /** Name of function, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /** Function parameter style. **S** is the value for SQL. */
  @JsonProperty("parameter_style")
  private CreateFunctionParameterStyle parameterStyle;

  /** JSON-serialized key-value pair map, encoded (escaped) as a string. */
  @JsonProperty("properties")
  private String properties;

  /** Table function return parameters. */
  @JsonProperty("return_params")
  private FunctionParameterInfos returnParams;

  /**
   * Function language. When **EXTERNAL** is used, the language of the routine function should be
   * specified in the __external_language__ field, and the __return_params__ of the function cannot
   * be used (as **TABLE** return type is not supported), and the __sql_data_access__ field must be
   * **NO_SQL**.
   */
  @JsonProperty("routine_body")
  private CreateFunctionRoutineBody routineBody;

  /** Function body. */
  @JsonProperty("routine_definition")
  private String routineDefinition;

  /** Function dependencies. */
  @JsonProperty("routine_dependencies")
  private DependencyList routineDependencies;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Function security type. */
  @JsonProperty("security_type")
  private CreateFunctionSecurityType securityType;

  /** Specific name of the function; Reserved for future use. */
  @JsonProperty("specific_name")
  private String specificName;

  /** Function SQL data access. */
  @JsonProperty("sql_data_access")
  private CreateFunctionSqlDataAccess sqlDataAccess;

  /** List of schemes whose objects can be referenced without qualification. */
  @JsonProperty("sql_path")
  private String sqlPath;

  public CreateFunction setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateFunction setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateFunction setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public CreateFunction setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

  public String getExternalLanguage() {
    return externalLanguage;
  }

  public CreateFunction setExternalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  public String getExternalName() {
    return externalName;
  }

  public CreateFunction setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public CreateFunction setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }

  public CreateFunction setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

  public Boolean getIsDeterministic() {
    return isDeterministic;
  }

  public CreateFunction setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

  public Boolean getIsNullCall() {
    return isNullCall;
  }

  public CreateFunction setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateFunction setParameterStyle(CreateFunctionParameterStyle parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

  public CreateFunctionParameterStyle getParameterStyle() {
    return parameterStyle;
  }

  public CreateFunction setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public CreateFunction setReturnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  public FunctionParameterInfos getReturnParams() {
    return returnParams;
  }

  public CreateFunction setRoutineBody(CreateFunctionRoutineBody routineBody) {
    this.routineBody = routineBody;
    return this;
  }

  public CreateFunctionRoutineBody getRoutineBody() {
    return routineBody;
  }

  public CreateFunction setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public CreateFunction setRoutineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  public DependencyList getRoutineDependencies() {
    return routineDependencies;
  }

  public CreateFunction setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateFunction setSecurityType(CreateFunctionSecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

  public CreateFunctionSecurityType getSecurityType() {
    return securityType;
  }

  public CreateFunction setSpecificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

  public String getSpecificName() {
    return specificName;
  }

  public CreateFunction setSqlDataAccess(CreateFunctionSqlDataAccess sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

  public CreateFunctionSqlDataAccess getSqlDataAccess() {
    return sqlDataAccess;
  }

  public CreateFunction setSqlPath(String sqlPath) {
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
    CreateFunction that = (CreateFunction) o;
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
    return new ToStringer(CreateFunction.class)
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

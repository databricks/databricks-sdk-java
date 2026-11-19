// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A user-defined function (UDF) registered in Unity Catalog. A function belongs to a schema and is
 * referenced as catalog_name.schema_name.function_name. Its body is either a SQL expression or
 * query, or source code in an external language such as Python. See
 * https://docs.databricks.com/aws/en/udf/unity-catalog for an overview.
 */
@Generated
public class CreateFunction {
  /** Name of parent Catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Data type of the value the function returns. A table function uses TABLE_TYPE and describes its
   * result columns in return_params, except for a polymorphic Python UDTF, which omits them.
   */
  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  /**
   * Language of the function body for an EXTERNAL function. It is required when routine_body is
   * EXTERNAL.
   */
  @JsonProperty("external_language")
  private String externalLanguage;

  /** Name of the function in its external language. It is reserved for future use. */
  @JsonProperty("external_name")
  private String externalName;

  /**
   * Return data type of the function in SQL syntax, including any type parameters such as precision
   * and scale.
   */
  @JsonProperty("full_data_type")
  private String fullDataType;

  /**
   * Input parameters of the function. When it is set, parameters must contain at least one entry. A
   * function that takes no arguments omits input_params, even though the Create request schema
   * marks it as required.
   */
  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  /**
   * Whether the function returns the same result for the same arguments. It corresponds to the
   * DETERMINISTIC characteristic of CREATE FUNCTION.
   */
  @JsonProperty("is_deterministic")
  private Boolean isDeterministic;

  /**
   * Whether the function is a null-call function in the sense of the SQL standard, which returns
   * NULL whenever any argument is NULL.
   */
  @JsonProperty("is_null_call")
  private Boolean isNullCall;

  /** Name of function, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /**
   * How arguments are passed to the function body. S means that each argument is passed as a single
   * scalar value.
   */
  @JsonProperty("parameter_style")
  private CreateFunctionParameterStyle parameterStyle;

  /** JSON-serialized key-value pair map, encoded (escaped) as a string. */
  @JsonProperty("properties")
  private String properties;

  /**
   * Result columns of a table function. Set it when data_type is TABLE_TYPE, except for a
   * polymorphic Python UDTF (an EXTERNAL Python function with full_data_type "()"), which must not
   * set it.
   */
  @JsonProperty("return_params")
  private FunctionParameterInfos returnParams;

  /**
   * Language of the function body. SQL means that routine_definition holds a SQL expression or
   * query. EXTERNAL means that it holds source code in the language named by external_language, and
   * sql_data_access must then be NO_SQL.
   */
  @JsonProperty("routine_body")
  private CreateFunctionRoutineBody routineBody;

  /**
   * Body of the function. For a SQL function it is the expression or query that computes the
   * result; for an EXTERNAL function it is the source code of the function. It is omitted when the
   * caller can only browse the function.
   */
  @JsonProperty("routine_definition")
  private String routineDefinition;

  /**
   * Function dependencies. For external UDFs, dependencies may contain only credential, secret, or
   * volume objects.
   */
  @JsonProperty("routine_dependencies")
  private DependencyList routineDependencies;

  /** Name of parent Schema relative to its parent Catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * Whose privileges the function body runs with. DEFINER runs it with the privileges of the
   * function owner.
   */
  @JsonProperty("security_type")
  private CreateFunctionSecurityType securityType;

  /** Specific name of the function. Set it to the same value as name. */
  @JsonProperty("specific_name")
  private String specificName;

  /**
   * How the function body interacts with SQL data. CONTAINS_SQL means that the body contains SQL
   * but reads no table or view, READS_SQL_DATA means that it reads a table or view, and NO_SQL is
   * required for EXTERNAL functions.
   */
  @JsonProperty("sql_data_access")
  private CreateFunctionSqlDataAccess sqlDataAccess;

  /** List of schemas whose objects can be referenced without qualification. */
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

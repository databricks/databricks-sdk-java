// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>CreateFunction class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /** The array of __FunctionParameterInfo__ definitions of the function's parameters. */
  @JsonProperty("input_params")
  private Collection<FunctionParameterInfo> inputParams;

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
  private CreateFunctionRoutineBody routineBody;

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

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>dataType</code>.</p>
   *
   * @param dataType a {@link com.databricks.sdk.service.catalog.ColumnTypeName} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ColumnTypeName} object
   */
  public ColumnTypeName getDataType() {
    return dataType;
  }

  /**
   * <p>Setter for the field <code>externalLanguage</code>.</p>
   *
   * @param externalLanguage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalLanguage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalLanguage() {
    return externalLanguage;
  }

  /**
   * <p>Setter for the field <code>externalName</code>.</p>
   *
   * @param externalName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setExternalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalName() {
    return externalName;
  }

  /**
   * <p>Setter for the field <code>fullDataType</code>.</p>
   *
   * @param fullDataType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullDataType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullDataType() {
    return fullDataType;
  }

  /**
   * <p>Setter for the field <code>inputParams</code>.</p>
   *
   * @param inputParams a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setInputParams(Collection<FunctionParameterInfo> inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>inputParams</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FunctionParameterInfo> getInputParams() {
    return inputParams;
  }

  /**
   * <p>Setter for the field <code>isDeterministic</code>.</p>
   *
   * @param isDeterministic a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setIsDeterministic(Boolean isDeterministic) {
    this.isDeterministic = isDeterministic;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDeterministic</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDeterministic() {
    return isDeterministic;
  }

  /**
   * <p>Setter for the field <code>isNullCall</code>.</p>
   *
   * @param isNullCall a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setIsNullCall(Boolean isNullCall) {
    this.isNullCall = isNullCall;
    return this;
  }

  /**
   * <p>Getter for the field <code>isNullCall</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsNullCall() {
    return isNullCall;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>parameterStyle</code>.</p>
   *
   * @param parameterStyle a {@link com.databricks.sdk.service.catalog.CreateFunctionParameterStyle} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setParameterStyle(CreateFunctionParameterStyle parameterStyle) {
    this.parameterStyle = parameterStyle;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameterStyle</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunctionParameterStyle} object
   */
  public CreateFunctionParameterStyle getParameterStyle() {
    return parameterStyle;
  }

  /**
   * <p>Setter for the field <code>properties</code>.</p>
   *
   * @param properties a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * <p>Getter for the field <code>properties</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getProperties() {
    return properties;
  }

  /**
   * <p>Setter for the field <code>returnParams</code>.</p>
   *
   * @param returnParams a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setReturnParams(Collection<FunctionParameterInfo> returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>returnParams</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FunctionParameterInfo> getReturnParams() {
    return returnParams;
  }

  /**
   * <p>Setter for the field <code>routineBody</code>.</p>
   *
   * @param routineBody a {@link com.databricks.sdk.service.catalog.CreateFunctionRoutineBody} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setRoutineBody(CreateFunctionRoutineBody routineBody) {
    this.routineBody = routineBody;
    return this;
  }

  /**
   * <p>Getter for the field <code>routineBody</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunctionRoutineBody} object
   */
  public CreateFunctionRoutineBody getRoutineBody() {
    return routineBody;
  }

  /**
   * <p>Setter for the field <code>routineDefinition</code>.</p>
   *
   * @param routineDefinition a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  /**
   * <p>Getter for the field <code>routineDefinition</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRoutineDefinition() {
    return routineDefinition;
  }

  /**
   * <p>Setter for the field <code>routineDependencies</code>.</p>
   *
   * @param routineDependencies a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setRoutineDependencies(Collection<Dependency> routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  /**
   * <p>Getter for the field <code>routineDependencies</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Dependency> getRoutineDependencies() {
    return routineDependencies;
  }

  /**
   * <p>Setter for the field <code>schemaName</code>.</p>
   *
   * @param schemaName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * <p>Setter for the field <code>securityType</code>.</p>
   *
   * @param securityType a {@link com.databricks.sdk.service.catalog.CreateFunctionSecurityType} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setSecurityType(CreateFunctionSecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

  /**
   * <p>Getter for the field <code>securityType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunctionSecurityType} object
   */
  public CreateFunctionSecurityType getSecurityType() {
    return securityType;
  }

  /**
   * <p>Setter for the field <code>specificName</code>.</p>
   *
   * @param specificName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setSpecificName(String specificName) {
    this.specificName = specificName;
    return this;
  }

  /**
   * <p>Getter for the field <code>specificName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSpecificName() {
    return specificName;
  }

  /**
   * <p>Setter for the field <code>sqlDataAccess</code>.</p>
   *
   * @param sqlDataAccess a {@link com.databricks.sdk.service.catalog.CreateFunctionSqlDataAccess} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setSqlDataAccess(CreateFunctionSqlDataAccess sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlDataAccess</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunctionSqlDataAccess} object
   */
  public CreateFunctionSqlDataAccess getSqlDataAccess() {
    return sqlDataAccess;
  }

  /**
   * <p>Setter for the field <code>sqlPath</code>.</p>
   *
   * @param sqlPath a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateFunction} object
   */
  public CreateFunction setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlPath</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSqlPath() {
    return sqlPath;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

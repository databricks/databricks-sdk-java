// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateFunction {
    /**
     * Name of parent catalog.
     */
    @JsonProperty("catalog_name")
    private String catalogName;
    
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Scalar function return data type.
     */
    @JsonProperty("data_type")
    private ColumnTypeName dataType;
    
    /**
     * External function language.
     */
    @JsonProperty("external_language")
    private String externalLanguage;
    
    /**
     * External function name.
     */
    @JsonProperty("external_name")
    private String externalName;
    
    /**
     * Pretty printed function data type.
     */
    @JsonProperty("full_data_type")
    private String fullDataType;
    
    /**
     * The array of __FunctionParameterInfo__ definitions of the function's
     * parameters.
     */
    @JsonProperty("input_params")
    private java.util.List<FunctionParameterInfo> inputParams;
    
    /**
     * Whether the function is deterministic.
     */
    @JsonProperty("is_deterministic")
    private Boolean isDeterministic;
    
    /**
     * Function null call.
     */
    @JsonProperty("is_null_call")
    private Boolean isNullCall;
    
    /**
     * Name of function, relative to parent schema.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Function parameter style. **S** is the value for SQL.
     */
    @JsonProperty("parameter_style")
    private CreateFunctionParameterStyle parameterStyle;
    
    /**
     * A map of key-value properties attached to the securable.
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * Table function return parameters.
     */
    @JsonProperty("return_params")
    private java.util.List<FunctionParameterInfo> returnParams;
    
    /**
     * Function language. When **EXTERNAL** is used, the language of the routine
     * function should be specified in the __external_language__ field, and the
     * __return_params__ of the function cannot be used (as **TABLE** return
     * type is not supported), and the __sql_data_access__ field must be
     * **NO_SQL**.
     */
    @JsonProperty("routine_body")
    private CreateFunctionRoutineBody routineBody;
    
    /**
     * Function body.
     */
    @JsonProperty("routine_definition")
    private String routineDefinition;
    
    /**
     * Function dependencies.
     */
    @JsonProperty("routine_dependencies")
    private java.util.List<Dependency> routineDependencies;
    
    /**
     * Name of parent schema relative to its parent catalog.
     */
    @JsonProperty("schema_name")
    private String schemaName;
    
    /**
     * Function security type.
     */
    @JsonProperty("security_type")
    private CreateFunctionSecurityType securityType;
    
    /**
     * Specific name of the function; Reserved for future use.
     */
    @JsonProperty("specific_name")
    private String specificName;
    
    /**
     * Function SQL data access.
     */
    @JsonProperty("sql_data_access")
    private CreateFunctionSqlDataAccess sqlDataAccess;
    
    /**
     * List of schemes whose objects can be referenced without qualification.
     */
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
    
    public CreateFunction setInputParams(java.util.List<FunctionParameterInfo> inputParams) {
        this.inputParams = inputParams;
        return this;
    }

    public java.util.List<FunctionParameterInfo> getInputParams() {
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
    
    public CreateFunction setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
    public CreateFunction setReturnParams(java.util.List<FunctionParameterInfo> returnParams) {
        this.returnParams = returnParams;
        return this;
    }

    public java.util.List<FunctionParameterInfo> getReturnParams() {
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
    
    public CreateFunction setRoutineDependencies(java.util.List<Dependency> routineDependencies) {
        this.routineDependencies = routineDependencies;
        return this;
    }

    public java.util.List<Dependency> getRoutineDependencies() {
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
    
}

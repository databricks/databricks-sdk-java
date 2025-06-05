// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateFunction.CreateFunctionSerializer.class)
@JsonDeserialize(using = CreateFunction.CreateFunctionDeserializer.class)
public class CreateFunction {
  /** Name of parent catalog. */
  private String catalogName;

  /** User-provided free-form text description. */
  private String comment;

  /** Scalar function return data type. */
  private ColumnTypeName dataType;

  /** External function language. */
  private String externalLanguage;

  /** External function name. */
  private String externalName;

  /** Pretty printed function data type. */
  private String fullDataType;

  /** */
  private FunctionParameterInfos inputParams;

  /** Whether the function is deterministic. */
  private Boolean isDeterministic;

  /** Function null call. */
  private Boolean isNullCall;

  /** Name of function, relative to parent schema. */
  private String name;

  /** Function parameter style. **S** is the value for SQL. */
  private CreateFunctionParameterStyle parameterStyle;

  /** JSON-serialized key-value pair map, encoded (escaped) as a string. */
  private String properties;

  /** Table function return parameters. */
  private FunctionParameterInfos returnParams;

  /**
   * Function language. When **EXTERNAL** is used, the language of the routine function should be
   * specified in the __external_language__ field, and the __return_params__ of the function cannot
   * be used (as **TABLE** return type is not supported), and the __sql_data_access__ field must be
   * **NO_SQL**.
   */
  private CreateFunctionRoutineBody routineBody;

  /** Function body. */
  private String routineDefinition;

  /** Function dependencies. */
  private DependencyList routineDependencies;

  /** Name of parent schema relative to its parent catalog. */
  private String schemaName;

  /** Function security type. */
  private CreateFunctionSecurityType securityType;

  /** Specific name of the function; Reserved for future use. */
  private String specificName;

  /** Function SQL data access. */
  private CreateFunctionSqlDataAccess sqlDataAccess;

  /** List of schemes whose objects can be referenced without qualification. */
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

  CreateFunctionPb toPb() {
    CreateFunctionPb pb = new CreateFunctionPb();
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setDataType(dataType);
    pb.setExternalLanguage(externalLanguage);
    pb.setExternalName(externalName);
    pb.setFullDataType(fullDataType);
    pb.setInputParams(inputParams);
    pb.setIsDeterministic(isDeterministic);
    pb.setIsNullCall(isNullCall);
    pb.setName(name);
    pb.setParameterStyle(parameterStyle);
    pb.setProperties(properties);
    pb.setReturnParams(returnParams);
    pb.setRoutineBody(routineBody);
    pb.setRoutineDefinition(routineDefinition);
    pb.setRoutineDependencies(routineDependencies);
    pb.setSchemaName(schemaName);
    pb.setSecurityType(securityType);
    pb.setSpecificName(specificName);
    pb.setSqlDataAccess(sqlDataAccess);
    pb.setSqlPath(sqlPath);

    return pb;
  }

  static CreateFunction fromPb(CreateFunctionPb pb) {
    CreateFunction model = new CreateFunction();
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setDataType(pb.getDataType());
    model.setExternalLanguage(pb.getExternalLanguage());
    model.setExternalName(pb.getExternalName());
    model.setFullDataType(pb.getFullDataType());
    model.setInputParams(pb.getInputParams());
    model.setIsDeterministic(pb.getIsDeterministic());
    model.setIsNullCall(pb.getIsNullCall());
    model.setName(pb.getName());
    model.setParameterStyle(pb.getParameterStyle());
    model.setProperties(pb.getProperties());
    model.setReturnParams(pb.getReturnParams());
    model.setRoutineBody(pb.getRoutineBody());
    model.setRoutineDefinition(pb.getRoutineDefinition());
    model.setRoutineDependencies(pb.getRoutineDependencies());
    model.setSchemaName(pb.getSchemaName());
    model.setSecurityType(pb.getSecurityType());
    model.setSpecificName(pb.getSpecificName());
    model.setSqlDataAccess(pb.getSqlDataAccess());
    model.setSqlPath(pb.getSqlPath());

    return model;
  }

  public static class CreateFunctionSerializer extends JsonSerializer<CreateFunction> {
    @Override
    public void serialize(CreateFunction value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateFunctionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateFunctionDeserializer extends JsonDeserializer<CreateFunction> {
    @Override
    public CreateFunction deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateFunctionPb pb = mapper.readValue(p, CreateFunctionPb.class);
      return CreateFunction.fromPb(pb);
    }
  }
}

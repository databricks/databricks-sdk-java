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
@JsonSerialize(using = FunctionInfo.FunctionInfoSerializer.class)
@JsonDeserialize(using = FunctionInfo.FunctionInfoDeserializer.class)
public class FunctionInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  private Boolean browseOnly;

  /** Name of parent catalog. */
  private String catalogName;

  /** User-provided free-form text description. */
  private String comment;

  /** Time at which this function was created, in epoch milliseconds. */
  private Long createdAt;

  /** Username of function creator. */
  private String createdBy;

  /** Scalar function return data type. */
  private ColumnTypeName dataType;

  /** External function language. */
  private String externalLanguage;

  /** External function name. */
  private String externalName;

  /** Pretty printed function data type. */
  private String fullDataType;

  /** Full name of function, in form of __catalog_name__.__schema_name__.__function__name__ */
  private String fullName;

  /** Id of Function, relative to parent schema. */
  private String functionId;

  /** */
  private FunctionParameterInfos inputParams;

  /** Whether the function is deterministic. */
  private Boolean isDeterministic;

  /** Function null call. */
  private Boolean isNullCall;

  /** Unique identifier of parent metastore. */
  private String metastoreId;

  /** Name of function, relative to parent schema. */
  private String name;

  /** Username of current owner of function. */
  private String owner;

  /** Function parameter style. **S** is the value for SQL. */
  private FunctionInfoParameterStyle parameterStyle;

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
  private FunctionInfoRoutineBody routineBody;

  /** Function body. */
  private String routineDefinition;

  /** Function dependencies. */
  private DependencyList routineDependencies;

  /** Name of parent schema relative to its parent catalog. */
  private String schemaName;

  /** Function security type. */
  private FunctionInfoSecurityType securityType;

  /** Specific name of the function; Reserved for future use. */
  private String specificName;

  /** Function SQL data access. */
  private FunctionInfoSqlDataAccess sqlDataAccess;

  /** List of schemes whose objects can be referenced without qualification. */
  private String sqlPath;

  /** Time at which this function was created, in epoch milliseconds. */
  private Long updatedAt;

  /** Username of user who last modified function. */
  private String updatedBy;

  public FunctionInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

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

  public FunctionInfo setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
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

  public FunctionInfo setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public FunctionInfo setReturnParams(FunctionParameterInfos returnParams) {
    this.returnParams = returnParams;
    return this;
  }

  public FunctionParameterInfos getReturnParams() {
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

  public FunctionInfo setRoutineDependencies(DependencyList routineDependencies) {
    this.routineDependencies = routineDependencies;
    return this;
  }

  public DependencyList getRoutineDependencies() {
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
    return new ToStringer(FunctionInfo.class)
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

  FunctionInfoPb toPb() {
    FunctionInfoPb pb = new FunctionInfoPb();
    pb.setBrowseOnly(browseOnly);
    pb.setCatalogName(catalogName);
    pb.setComment(comment);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setDataType(dataType);
    pb.setExternalLanguage(externalLanguage);
    pb.setExternalName(externalName);
    pb.setFullDataType(fullDataType);
    pb.setFullName(fullName);
    pb.setFunctionId(functionId);
    pb.setInputParams(inputParams);
    pb.setIsDeterministic(isDeterministic);
    pb.setIsNullCall(isNullCall);
    pb.setMetastoreId(metastoreId);
    pb.setName(name);
    pb.setOwner(owner);
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
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);

    return pb;
  }

  static FunctionInfo fromPb(FunctionInfoPb pb) {
    FunctionInfo model = new FunctionInfo();
    model.setBrowseOnly(pb.getBrowseOnly());
    model.setCatalogName(pb.getCatalogName());
    model.setComment(pb.getComment());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setDataType(pb.getDataType());
    model.setExternalLanguage(pb.getExternalLanguage());
    model.setExternalName(pb.getExternalName());
    model.setFullDataType(pb.getFullDataType());
    model.setFullName(pb.getFullName());
    model.setFunctionId(pb.getFunctionId());
    model.setInputParams(pb.getInputParams());
    model.setIsDeterministic(pb.getIsDeterministic());
    model.setIsNullCall(pb.getIsNullCall());
    model.setMetastoreId(pb.getMetastoreId());
    model.setName(pb.getName());
    model.setOwner(pb.getOwner());
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
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());

    return model;
  }

  public static class FunctionInfoSerializer extends JsonSerializer<FunctionInfo> {
    @Override
    public void serialize(FunctionInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FunctionInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FunctionInfoDeserializer extends JsonDeserializer<FunctionInfo> {
    @Override
    public FunctionInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FunctionInfoPb pb = mapper.readValue(p, FunctionInfoPb.class);
      return FunctionInfo.fromPb(pb);
    }
  }
}

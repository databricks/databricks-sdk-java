// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = DeltaSharingFunction.DeltaSharingFunctionSerializer.class)
@JsonDeserialize(using = DeltaSharingFunction.DeltaSharingFunctionDeserializer.class)
public class DeltaSharingFunction {
  /** The aliass of registered model. */
  private Collection<RegisteredModelAlias> aliases;

  /** The comment of the function. */
  private String comment;

  /** The data type of the function. */
  private ColumnTypeName dataType;

  /** The dependency list of the function. */
  private DeltaSharingDependencyList dependencyList;

  /** The full data type of the function. */
  private String fullDataType;

  /** The id of the function. */
  private String id;

  /** The function parameter information. */
  private FunctionParameterInfos inputParams;

  /** The name of the function. */
  private String name;

  /** The properties of the function. */
  private String properties;

  /** The routine definition of the function. */
  private String routineDefinition;

  /** The name of the schema that the function belongs to. */
  private String schema;

  /** The securable kind of the function. */
  private SharedSecurableKind securableKind;

  /** The name of the share that the function belongs to. */
  private String share;

  /** The id of the share that the function belongs to. */
  private String shareId;

  /** The storage location of the function. */
  private String storageLocation;

  /** The tags of the function. */
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public DeltaSharingFunction setAliases(Collection<RegisteredModelAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<RegisteredModelAlias> getAliases() {
    return aliases;
  }

  public DeltaSharingFunction setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public DeltaSharingFunction setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public DeltaSharingFunction setDependencyList(DeltaSharingDependencyList dependencyList) {
    this.dependencyList = dependencyList;
    return this;
  }

  public DeltaSharingDependencyList getDependencyList() {
    return dependencyList;
  }

  public DeltaSharingFunction setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public DeltaSharingFunction setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DeltaSharingFunction setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }

  public DeltaSharingFunction setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeltaSharingFunction setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public DeltaSharingFunction setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public DeltaSharingFunction setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public DeltaSharingFunction setSecurableKind(SharedSecurableKind securableKind) {
    this.securableKind = securableKind;
    return this;
  }

  public SharedSecurableKind getSecurableKind() {
    return securableKind;
  }

  public DeltaSharingFunction setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public DeltaSharingFunction setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public DeltaSharingFunction setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public DeltaSharingFunction setTags(
      Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.TagKeyValue> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSharingFunction that = (DeltaSharingFunction) o;
    return Objects.equals(aliases, that.aliases)
        && Objects.equals(comment, that.comment)
        && Objects.equals(dataType, that.dataType)
        && Objects.equals(dependencyList, that.dependencyList)
        && Objects.equals(fullDataType, that.fullDataType)
        && Objects.equals(id, that.id)
        && Objects.equals(inputParams, that.inputParams)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(routineDefinition, that.routineDefinition)
        && Objects.equals(schema, that.schema)
        && Objects.equals(securableKind, that.securableKind)
        && Objects.equals(share, that.share)
        && Objects.equals(shareId, that.shareId)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aliases,
        comment,
        dataType,
        dependencyList,
        fullDataType,
        id,
        inputParams,
        name,
        properties,
        routineDefinition,
        schema,
        securableKind,
        share,
        shareId,
        storageLocation,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSharingFunction.class)
        .add("aliases", aliases)
        .add("comment", comment)
        .add("dataType", dataType)
        .add("dependencyList", dependencyList)
        .add("fullDataType", fullDataType)
        .add("id", id)
        .add("inputParams", inputParams)
        .add("name", name)
        .add("properties", properties)
        .add("routineDefinition", routineDefinition)
        .add("schema", schema)
        .add("securableKind", securableKind)
        .add("share", share)
        .add("shareId", shareId)
        .add("storageLocation", storageLocation)
        .add("tags", tags)
        .toString();
  }

  DeltaSharingFunctionPb toPb() {
    DeltaSharingFunctionPb pb = new DeltaSharingFunctionPb();
    pb.setAliases(aliases);
    pb.setComment(comment);
    pb.setDataType(dataType);
    pb.setDependencyList(dependencyList);
    pb.setFullDataType(fullDataType);
    pb.setId(id);
    pb.setInputParams(inputParams);
    pb.setName(name);
    pb.setProperties(properties);
    pb.setRoutineDefinition(routineDefinition);
    pb.setSchema(schema);
    pb.setSecurableKind(securableKind);
    pb.setShare(share);
    pb.setShareId(shareId);
    pb.setStorageLocation(storageLocation);
    pb.setTags(tags);

    return pb;
  }

  static DeltaSharingFunction fromPb(DeltaSharingFunctionPb pb) {
    DeltaSharingFunction model = new DeltaSharingFunction();
    model.setAliases(pb.getAliases());
    model.setComment(pb.getComment());
    model.setDataType(pb.getDataType());
    model.setDependencyList(pb.getDependencyList());
    model.setFullDataType(pb.getFullDataType());
    model.setId(pb.getId());
    model.setInputParams(pb.getInputParams());
    model.setName(pb.getName());
    model.setProperties(pb.getProperties());
    model.setRoutineDefinition(pb.getRoutineDefinition());
    model.setSchema(pb.getSchema());
    model.setSecurableKind(pb.getSecurableKind());
    model.setShare(pb.getShare());
    model.setShareId(pb.getShareId());
    model.setStorageLocation(pb.getStorageLocation());
    model.setTags(pb.getTags());

    return model;
  }

  public static class DeltaSharingFunctionSerializer extends JsonSerializer<DeltaSharingFunction> {
    @Override
    public void serialize(
        DeltaSharingFunction value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaSharingFunctionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaSharingFunctionDeserializer
      extends JsonDeserializer<DeltaSharingFunction> {
    @Override
    public DeltaSharingFunction deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaSharingFunctionPb pb = mapper.readValue(p, DeltaSharingFunctionPb.class);
      return DeltaSharingFunction.fromPb(pb);
    }
  }
}

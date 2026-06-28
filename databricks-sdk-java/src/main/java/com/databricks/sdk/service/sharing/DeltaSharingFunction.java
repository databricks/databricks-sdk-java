// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeltaSharingFunction {
  /** The aliass of registered model. */
  @JsonProperty("aliases")
  private Collection<RegisteredModelAlias> aliases;

  /** The comment of the function. */
  @JsonProperty("comment")
  private String comment;

  /** The data type of the function. */
  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  /** The dependency list of the function. */
  @JsonProperty("dependency_list")
  private DeltaSharingDependencyList dependencyList;

  /** The full data type of the function. */
  @JsonProperty("full_data_type")
  private String fullDataType;

  /** The id of the function. */
  @JsonProperty("id")
  private String id;

  /** The function parameter information. */
  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  /** The name of the function. */
  @JsonProperty("name")
  private String name;

  /** The properties of the function. */
  @JsonProperty("properties")
  private String properties;

  /** The routine definition of the function. */
  @JsonProperty("routine_definition")
  private String routineDefinition;

  /** The name of the schema that the function belongs to. */
  @JsonProperty("schema")
  private String schema;

  /** The securable kind of the function. */
  @JsonProperty("securable_kind")
  private SharedSecurableKind securableKind;

  /** The name of the share that the function belongs to. */
  @JsonProperty("share")
  private String share;

  /** The id of the share that the function belongs to. */
  @JsonProperty("share_id")
  private String shareId;

  /** The storage location of the function. */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** The tags of the function. */
  @JsonProperty("tags")
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
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DeltaSharingFunctionPb {
  @JsonProperty("aliases")
  private Collection<RegisteredModelAlias> aliases;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("data_type")
  private ColumnTypeName dataType;

  @JsonProperty("dependency_list")
  private DeltaSharingDependencyList dependencyList;

  @JsonProperty("full_data_type")
  private String fullDataType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("input_params")
  private FunctionParameterInfos inputParams;

  @JsonProperty("name")
  private String name;

  @JsonProperty("properties")
  private String properties;

  @JsonProperty("routine_definition")
  private String routineDefinition;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("securable_kind")
  private SharedSecurableKind securableKind;

  @JsonProperty("share")
  private String share;

  @JsonProperty("share_id")
  private String shareId;

  @JsonProperty("storage_location")
  private String storageLocation;

  @JsonProperty("tags")
  private Collection<com.databricks.sdk.service.catalog.TagKeyValue> tags;

  public DeltaSharingFunctionPb setAliases(Collection<RegisteredModelAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<RegisteredModelAlias> getAliases() {
    return aliases;
  }

  public DeltaSharingFunctionPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public DeltaSharingFunctionPb setDataType(ColumnTypeName dataType) {
    this.dataType = dataType;
    return this;
  }

  public ColumnTypeName getDataType() {
    return dataType;
  }

  public DeltaSharingFunctionPb setDependencyList(DeltaSharingDependencyList dependencyList) {
    this.dependencyList = dependencyList;
    return this;
  }

  public DeltaSharingDependencyList getDependencyList() {
    return dependencyList;
  }

  public DeltaSharingFunctionPb setFullDataType(String fullDataType) {
    this.fullDataType = fullDataType;
    return this;
  }

  public String getFullDataType() {
    return fullDataType;
  }

  public DeltaSharingFunctionPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public DeltaSharingFunctionPb setInputParams(FunctionParameterInfos inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  public FunctionParameterInfos getInputParams() {
    return inputParams;
  }

  public DeltaSharingFunctionPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeltaSharingFunctionPb setProperties(String properties) {
    this.properties = properties;
    return this;
  }

  public String getProperties() {
    return properties;
  }

  public DeltaSharingFunctionPb setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
    return this;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public DeltaSharingFunctionPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public DeltaSharingFunctionPb setSecurableKind(SharedSecurableKind securableKind) {
    this.securableKind = securableKind;
    return this;
  }

  public SharedSecurableKind getSecurableKind() {
    return securableKind;
  }

  public DeltaSharingFunctionPb setShare(String share) {
    this.share = share;
    return this;
  }

  public String getShare() {
    return share;
  }

  public DeltaSharingFunctionPb setShareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  public String getShareId() {
    return shareId;
  }

  public DeltaSharingFunctionPb setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public DeltaSharingFunctionPb setTags(
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
    DeltaSharingFunctionPb that = (DeltaSharingFunctionPb) o;
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
    return new ToStringer(DeltaSharingFunctionPb.class)
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

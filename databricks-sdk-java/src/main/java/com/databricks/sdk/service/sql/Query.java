// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = Query.QuerySerializer.class)
@JsonDeserialize(using = Query.QueryDeserializer.class)
public class Query {
  /** Whether to apply a 1000 row limit to the query result. */
  private Boolean applyAutoLimit;

  /** Name of the catalog where this query will be executed. */
  private String catalog;

  /** Timestamp when this query was created. */
  private String createTime;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  private String description;

  /**
   * Display name of the query that appears in list views, widget headings, and on the query page.
   */
  private String displayName;

  /** UUID identifying the query. */
  private String id;

  /** Username of the user who last saved changes to this query. */
  private String lastModifierUserName;

  /** Indicates whether the query is trashed. */
  private LifecycleState lifecycleState;

  /** Username of the user that owns the query. */
  private String ownerUserName;

  /** List of query parameter definitions. */
  private Collection<QueryParameter> parameters;

  /** Workspace path of the workspace folder containing the object. */
  private String parentPath;

  /** Text of the query to be run. */
  private String queryText;

  /** Sets the "Run as" role for the object. */
  private RunAsMode runAsMode;

  /** Name of the schema where this query will be executed. */
  private String schema;

  /** */
  private Collection<String> tags;

  /** Timestamp when this query was last updated. */
  private String updateTime;

  /** ID of the SQL warehouse attached to the query. */
  private String warehouseId;

  public Query setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public Query setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public Query setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Query setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Query setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Query setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Query setLastModifierUserName(String lastModifierUserName) {
    this.lastModifierUserName = lastModifierUserName;
    return this;
  }

  public String getLastModifierUserName() {
    return lastModifierUserName;
  }

  public Query setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public Query setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public Query setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public Query setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public Query setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public Query setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public Query setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public Query setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public Query setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public Query setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Query that = (Query) o;
    return Objects.equals(applyAutoLimit, that.applyAutoLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(lastModifierUserName, that.lastModifierUserName)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(runAsMode, that.runAsMode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyAutoLimit,
        catalog,
        createTime,
        description,
        displayName,
        id,
        lastModifierUserName,
        lifecycleState,
        ownerUserName,
        parameters,
        parentPath,
        queryText,
        runAsMode,
        schema,
        tags,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(Query.class)
        .add("applyAutoLimit", applyAutoLimit)
        .add("catalog", catalog)
        .add("createTime", createTime)
        .add("description", description)
        .add("displayName", displayName)
        .add("id", id)
        .add("lastModifierUserName", lastModifierUserName)
        .add("lifecycleState", lifecycleState)
        .add("ownerUserName", ownerUserName)
        .add("parameters", parameters)
        .add("parentPath", parentPath)
        .add("queryText", queryText)
        .add("runAsMode", runAsMode)
        .add("schema", schema)
        .add("tags", tags)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }

  QueryPb toPb() {
    QueryPb pb = new QueryPb();
    pb.setApplyAutoLimit(applyAutoLimit);
    pb.setCatalog(catalog);
    pb.setCreateTime(createTime);
    pb.setDescription(description);
    pb.setDisplayName(displayName);
    pb.setId(id);
    pb.setLastModifierUserName(lastModifierUserName);
    pb.setLifecycleState(lifecycleState);
    pb.setOwnerUserName(ownerUserName);
    pb.setParameters(parameters);
    pb.setParentPath(parentPath);
    pb.setQueryText(queryText);
    pb.setRunAsMode(runAsMode);
    pb.setSchema(schema);
    pb.setTags(tags);
    pb.setUpdateTime(updateTime);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static Query fromPb(QueryPb pb) {
    Query model = new Query();
    model.setApplyAutoLimit(pb.getApplyAutoLimit());
    model.setCatalog(pb.getCatalog());
    model.setCreateTime(pb.getCreateTime());
    model.setDescription(pb.getDescription());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());
    model.setLastModifierUserName(pb.getLastModifierUserName());
    model.setLifecycleState(pb.getLifecycleState());
    model.setOwnerUserName(pb.getOwnerUserName());
    model.setParameters(pb.getParameters());
    model.setParentPath(pb.getParentPath());
    model.setQueryText(pb.getQueryText());
    model.setRunAsMode(pb.getRunAsMode());
    model.setSchema(pb.getSchema());
    model.setTags(pb.getTags());
    model.setUpdateTime(pb.getUpdateTime());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class QuerySerializer extends JsonSerializer<Query> {
    @Override
    public void serialize(Query value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryDeserializer extends JsonDeserializer<Query> {
    @Override
    public Query deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryPb pb = mapper.readValue(p, QueryPb.class);
      return Query.fromPb(pb);
    }
  }
}

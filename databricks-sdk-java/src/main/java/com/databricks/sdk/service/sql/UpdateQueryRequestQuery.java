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
@JsonSerialize(using = UpdateQueryRequestQuery.UpdateQueryRequestQuerySerializer.class)
@JsonDeserialize(using = UpdateQueryRequestQuery.UpdateQueryRequestQueryDeserializer.class)
public class UpdateQueryRequestQuery {
  /** Whether to apply a 1000 row limit to the query result. */
  private Boolean applyAutoLimit;

  /** Name of the catalog where this query will be executed. */
  private String catalog;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  private String description;

  /**
   * Display name of the query that appears in list views, widget headings, and on the query page.
   */
  private String displayName;

  /** Username of the user that owns the query. */
  private String ownerUserName;

  /** List of query parameter definitions. */
  private Collection<QueryParameter> parameters;

  /** Text of the query to be run. */
  private String queryText;

  /** Sets the "Run as" role for the object. */
  private RunAsMode runAsMode;

  /** Name of the schema where this query will be executed. */
  private String schema;

  /** */
  private Collection<String> tags;

  /** ID of the SQL warehouse attached to the query. */
  private String warehouseId;

  public UpdateQueryRequestQuery setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public UpdateQueryRequestQuery setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public UpdateQueryRequestQuery setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateQueryRequestQuery setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateQueryRequestQuery setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public UpdateQueryRequestQuery setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public UpdateQueryRequestQuery setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public UpdateQueryRequestQuery setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public UpdateQueryRequestQuery setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public UpdateQueryRequestQuery setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public UpdateQueryRequestQuery setWarehouseId(String warehouseId) {
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
    UpdateQueryRequestQuery that = (UpdateQueryRequestQuery) o;
    return Objects.equals(applyAutoLimit, that.applyAutoLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(runAsMode, that.runAsMode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(tags, that.tags)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyAutoLimit,
        catalog,
        description,
        displayName,
        ownerUserName,
        parameters,
        queryText,
        runAsMode,
        schema,
        tags,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQueryRequestQuery.class)
        .add("applyAutoLimit", applyAutoLimit)
        .add("catalog", catalog)
        .add("description", description)
        .add("displayName", displayName)
        .add("ownerUserName", ownerUserName)
        .add("parameters", parameters)
        .add("queryText", queryText)
        .add("runAsMode", runAsMode)
        .add("schema", schema)
        .add("tags", tags)
        .add("warehouseId", warehouseId)
        .toString();
  }

  UpdateQueryRequestQueryPb toPb() {
    UpdateQueryRequestQueryPb pb = new UpdateQueryRequestQueryPb();
    pb.setApplyAutoLimit(applyAutoLimit);
    pb.setCatalog(catalog);
    pb.setDescription(description);
    pb.setDisplayName(displayName);
    pb.setOwnerUserName(ownerUserName);
    pb.setParameters(parameters);
    pb.setQueryText(queryText);
    pb.setRunAsMode(runAsMode);
    pb.setSchema(schema);
    pb.setTags(tags);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static UpdateQueryRequestQuery fromPb(UpdateQueryRequestQueryPb pb) {
    UpdateQueryRequestQuery model = new UpdateQueryRequestQuery();
    model.setApplyAutoLimit(pb.getApplyAutoLimit());
    model.setCatalog(pb.getCatalog());
    model.setDescription(pb.getDescription());
    model.setDisplayName(pb.getDisplayName());
    model.setOwnerUserName(pb.getOwnerUserName());
    model.setParameters(pb.getParameters());
    model.setQueryText(pb.getQueryText());
    model.setRunAsMode(pb.getRunAsMode());
    model.setSchema(pb.getSchema());
    model.setTags(pb.getTags());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class UpdateQueryRequestQuerySerializer
      extends JsonSerializer<UpdateQueryRequestQuery> {
    @Override
    public void serialize(
        UpdateQueryRequestQuery value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateQueryRequestQueryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateQueryRequestQueryDeserializer
      extends JsonDeserializer<UpdateQueryRequestQuery> {
    @Override
    public UpdateQueryRequestQuery deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateQueryRequestQueryPb pb = mapper.readValue(p, UpdateQueryRequestQueryPb.class);
      return UpdateQueryRequestQuery.fromPb(pb);
    }
  }
}

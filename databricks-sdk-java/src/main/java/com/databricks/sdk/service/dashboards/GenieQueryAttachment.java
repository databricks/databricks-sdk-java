// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = GenieQueryAttachment.GenieQueryAttachmentSerializer.class)
@JsonDeserialize(using = GenieQueryAttachment.GenieQueryAttachmentDeserializer.class)
public class GenieQueryAttachment {
  /** Description of the query */
  private String description;

  /** */
  private String id;

  /** Time when the user updated the query last */
  private Long lastUpdatedTimestamp;

  /** AI generated SQL query */
  private String query;

  /** Metadata associated with the query result. */
  private GenieResultMetadata queryResultMetadata;

  /**
   * Statement Execution API statement id. Use [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) to get the full result data.
   */
  private String statementId;

  /** Name of the query */
  private String title;

  public GenieQueryAttachment setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieQueryAttachment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieQueryAttachment setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieQueryAttachment setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public GenieQueryAttachment setQueryResultMetadata(GenieResultMetadata queryResultMetadata) {
    this.queryResultMetadata = queryResultMetadata;
    return this;
  }

  public GenieResultMetadata getQueryResultMetadata() {
    return queryResultMetadata;
  }

  public GenieQueryAttachment setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public GenieQueryAttachment setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieQueryAttachment that = (GenieQueryAttachment) o;
    return Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(query, that.query)
        && Objects.equals(queryResultMetadata, that.queryResultMetadata)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, id, lastUpdatedTimestamp, query, queryResultMetadata, statementId, title);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieQueryAttachment.class)
        .add("description", description)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("query", query)
        .add("queryResultMetadata", queryResultMetadata)
        .add("statementId", statementId)
        .add("title", title)
        .toString();
  }

  GenieQueryAttachmentPb toPb() {
    GenieQueryAttachmentPb pb = new GenieQueryAttachmentPb();
    pb.setDescription(description);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setQuery(query);
    pb.setQueryResultMetadata(queryResultMetadata);
    pb.setStatementId(statementId);
    pb.setTitle(title);

    return pb;
  }

  static GenieQueryAttachment fromPb(GenieQueryAttachmentPb pb) {
    GenieQueryAttachment model = new GenieQueryAttachment();
    model.setDescription(pb.getDescription());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setQuery(pb.getQuery());
    model.setQueryResultMetadata(pb.getQueryResultMetadata());
    model.setStatementId(pb.getStatementId());
    model.setTitle(pb.getTitle());

    return model;
  }

  public static class GenieQueryAttachmentSerializer extends JsonSerializer<GenieQueryAttachment> {
    @Override
    public void serialize(
        GenieQueryAttachment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieQueryAttachmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieQueryAttachmentDeserializer
      extends JsonDeserializer<GenieQueryAttachment> {
    @Override
    public GenieQueryAttachment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieQueryAttachmentPb pb = mapper.readValue(p, GenieQueryAttachmentPb.class);
      return GenieQueryAttachment.fromPb(pb);
    }
  }
}

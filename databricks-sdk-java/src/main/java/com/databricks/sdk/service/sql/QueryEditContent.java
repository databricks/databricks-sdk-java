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
@JsonSerialize(using = QueryEditContent.QueryEditContentSerializer.class)
@JsonDeserialize(using = QueryEditContent.QueryEditContentDeserializer.class)
public class QueryEditContent {
  /**
   * Data source ID maps to the ID of the data source used by the resource and is distinct from the
   * warehouse ID. [Learn more]
   *
   * <p>[Learn more]: https://docs.databricks.com/api/workspace/datasources/list
   */
  private String dataSourceId;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  private String description;

  /** The title of this query that appears in list views, widget headings, and on the query page. */
  private String name;

  /**
   * Exclusively used for storing a list parameter definitions. A parameter is an object with
   * `title`, `name`, `type`, and `value` properties. The `value` field here is the default value.
   * It can be overridden at runtime.
   */
  private Object options;

  /** The text of the query to be run. */
  private String query;

  /** */
  private String queryId;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  private RunAsRole runAsRole;

  /** */
  private Collection<String> tags;

  public QueryEditContent setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public QueryEditContent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QueryEditContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryEditContent setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public QueryEditContent setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public QueryEditContent setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryEditContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public QueryEditContent setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEditContent that = (QueryEditContent) o;
    return Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(query, that.query)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, query, queryId, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEditContent.class)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("query", query)
        .add("queryId", queryId)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }

  QueryEditContentPb toPb() {
    QueryEditContentPb pb = new QueryEditContentPb();
    pb.setDataSourceId(dataSourceId);
    pb.setDescription(description);
    pb.setName(name);
    pb.setOptions(options);
    pb.setQuery(query);
    pb.setQueryId(queryId);
    pb.setRunAsRole(runAsRole);
    pb.setTags(tags);

    return pb;
  }

  static QueryEditContent fromPb(QueryEditContentPb pb) {
    QueryEditContent model = new QueryEditContent();
    model.setDataSourceId(pb.getDataSourceId());
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setQuery(pb.getQuery());
    model.setQueryId(pb.getQueryId());
    model.setRunAsRole(pb.getRunAsRole());
    model.setTags(pb.getTags());

    return model;
  }

  public static class QueryEditContentSerializer extends JsonSerializer<QueryEditContent> {
    @Override
    public void serialize(QueryEditContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryEditContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryEditContentDeserializer extends JsonDeserializer<QueryEditContent> {
    @Override
    public QueryEditContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryEditContentPb pb = mapper.readValue(p, QueryEditContentPb.class);
      return QueryEditContent.fromPb(pb);
    }
  }
}

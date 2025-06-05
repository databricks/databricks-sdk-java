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
@JsonSerialize(using = QueryPostContent.QueryPostContentSerializer.class)
@JsonDeserialize(using = QueryPostContent.QueryPostContentDeserializer.class)
public class QueryPostContent {
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

  /** The identifier of the workspace folder containing the object. */
  private String parent;

  /** The text of the query to be run. */
  private String query;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  private RunAsRole runAsRole;

  /** */
  private Collection<String> tags;

  public QueryPostContent setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public QueryPostContent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public QueryPostContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryPostContent setOptions(Object options) {
    this.options = options;
    return this;
  }

  public Object getOptions() {
    return options;
  }

  public QueryPostContent setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public QueryPostContent setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public QueryPostContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public QueryPostContent setTags(Collection<String> tags) {
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
    QueryPostContent that = (QueryPostContent) o;
    return Objects.equals(dataSourceId, that.dataSourceId)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(parent, that.parent)
        && Objects.equals(query, that.query)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, description, name, options, parent, query, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryPostContent.class)
        .add("dataSourceId", dataSourceId)
        .add("description", description)
        .add("name", name)
        .add("options", options)
        .add("parent", parent)
        .add("query", query)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }

  QueryPostContentPb toPb() {
    QueryPostContentPb pb = new QueryPostContentPb();
    pb.setDataSourceId(dataSourceId);
    pb.setDescription(description);
    pb.setName(name);
    pb.setOptions(options);
    pb.setParent(parent);
    pb.setQuery(query);
    pb.setRunAsRole(runAsRole);
    pb.setTags(tags);

    return pb;
  }

  static QueryPostContent fromPb(QueryPostContentPb pb) {
    QueryPostContent model = new QueryPostContent();
    model.setDataSourceId(pb.getDataSourceId());
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setParent(pb.getParent());
    model.setQuery(pb.getQuery());
    model.setRunAsRole(pb.getRunAsRole());
    model.setTags(pb.getTags());

    return model;
  }

  public static class QueryPostContentSerializer extends JsonSerializer<QueryPostContent> {
    @Override
    public void serialize(QueryPostContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryPostContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryPostContentDeserializer extends JsonDeserializer<QueryPostContent> {
    @Override
    public QueryPostContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryPostContentPb pb = mapper.readValue(p, QueryPostContentPb.class);
      return QueryPostContent.fromPb(pb);
    }
  }
}

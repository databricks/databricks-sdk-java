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
@JsonSerialize(using = QueryOptions.QueryOptionsSerializer.class)
@JsonDeserialize(using = QueryOptions.QueryOptionsDeserializer.class)
public class QueryOptions {
  /** The name of the catalog to execute this query in. */
  private String catalog;

  /**
   * The timestamp when this query was moved to trash. Only present when the `is_archived` property
   * is `true`. Trashed items are deleted after thirty days.
   */
  private String movedToTrashAt;

  /** */
  private Collection<Parameter> parameters;

  /** The name of the schema to execute this query in. */
  private String schema;

  public QueryOptions setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public QueryOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  public QueryOptions setParameters(Collection<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<Parameter> getParameters() {
    return parameters;
  }

  public QueryOptions setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryOptions that = (QueryOptions) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(movedToTrashAt, that.movedToTrashAt)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, movedToTrashAt, parameters, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryOptions.class)
        .add("catalog", catalog)
        .add("movedToTrashAt", movedToTrashAt)
        .add("parameters", parameters)
        .add("schema", schema)
        .toString();
  }

  QueryOptionsPb toPb() {
    QueryOptionsPb pb = new QueryOptionsPb();
    pb.setCatalog(catalog);
    pb.setMovedToTrashAt(movedToTrashAt);
    pb.setParameters(parameters);
    pb.setSchema(schema);

    return pb;
  }

  static QueryOptions fromPb(QueryOptionsPb pb) {
    QueryOptions model = new QueryOptions();
    model.setCatalog(pb.getCatalog());
    model.setMovedToTrashAt(pb.getMovedToTrashAt());
    model.setParameters(pb.getParameters());
    model.setSchema(pb.getSchema());

    return model;
  }

  public static class QueryOptionsSerializer extends JsonSerializer<QueryOptions> {
    @Override
    public void serialize(QueryOptions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryOptionsDeserializer extends JsonDeserializer<QueryOptions> {
    @Override
    public QueryOptions deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryOptionsPb pb = mapper.readValue(p, QueryOptionsPb.class);
      return QueryOptions.fromPb(pb);
    }
  }
}

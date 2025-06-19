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
@JsonSerialize(using = QueryBackedValue.QueryBackedValueSerializer.class)
@JsonDeserialize(using = QueryBackedValue.QueryBackedValueDeserializer.class)
public class QueryBackedValue {
  /** If specified, allows multiple values to be selected for this parameter. */
  private MultiValuesOptions multiValuesOptions;

  /** UUID of the query that provides the parameter values. */
  private String queryId;

  /** List of selected query parameter values. */
  private Collection<String> values;

  public QueryBackedValue setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public QueryBackedValue setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryBackedValue setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryBackedValue that = (QueryBackedValue) o;
    return Objects.equals(multiValuesOptions, that.multiValuesOptions)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiValuesOptions, queryId, values);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryBackedValue.class)
        .add("multiValuesOptions", multiValuesOptions)
        .add("queryId", queryId)
        .add("values", values)
        .toString();
  }

  QueryBackedValuePb toPb() {
    QueryBackedValuePb pb = new QueryBackedValuePb();
    pb.setMultiValuesOptions(multiValuesOptions);
    pb.setQueryId(queryId);
    pb.setValues(values);

    return pb;
  }

  static QueryBackedValue fromPb(QueryBackedValuePb pb) {
    QueryBackedValue model = new QueryBackedValue();
    model.setMultiValuesOptions(pb.getMultiValuesOptions());
    model.setQueryId(pb.getQueryId());
    model.setValues(pb.getValues());

    return model;
  }

  public static class QueryBackedValueSerializer extends JsonSerializer<QueryBackedValue> {
    @Override
    public void serialize(QueryBackedValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryBackedValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryBackedValueDeserializer extends JsonDeserializer<QueryBackedValue> {
    @Override
    public QueryBackedValue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryBackedValuePb pb = mapper.readValue(p, QueryBackedValuePb.class);
      return QueryBackedValue.fromPb(pb);
    }
  }
}

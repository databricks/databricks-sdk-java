// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = ListSchemasResponse.ListSchemasResponseSerializer.class)
@JsonDeserialize(using = ListSchemasResponse.ListSchemasResponseDeserializer.class)
public class ListSchemasResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of schema information objects. */
  private Collection<SchemaInfo> schemas;

  public ListSchemasResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSchemasResponse setSchemas(Collection<SchemaInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<SchemaInfo> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchemasResponse that = (ListSchemasResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchemasResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("schemas", schemas)
        .toString();
  }

  ListSchemasResponsePb toPb() {
    ListSchemasResponsePb pb = new ListSchemasResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSchemas(schemas);

    return pb;
  }

  static ListSchemasResponse fromPb(ListSchemasResponsePb pb) {
    ListSchemasResponse model = new ListSchemasResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSchemas(pb.getSchemas());

    return model;
  }

  public static class ListSchemasResponseSerializer extends JsonSerializer<ListSchemasResponse> {
    @Override
    public void serialize(ListSchemasResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSchemasResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSchemasResponseDeserializer
      extends JsonDeserializer<ListSchemasResponse> {
    @Override
    public ListSchemasResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSchemasResponsePb pb = mapper.readValue(p, ListSchemasResponsePb.class);
      return ListSchemasResponse.fromPb(pb);
    }
  }
}

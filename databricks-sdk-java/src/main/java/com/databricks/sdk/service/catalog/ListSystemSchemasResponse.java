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
@JsonSerialize(using = ListSystemSchemasResponse.ListSystemSchemasResponseSerializer.class)
@JsonDeserialize(using = ListSystemSchemasResponse.ListSystemSchemasResponseDeserializer.class)
public class ListSystemSchemasResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of system schema information objects. */
  private Collection<SystemSchemaInfo> schemas;

  public ListSystemSchemasResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSystemSchemasResponse setSchemas(Collection<SystemSchemaInfo> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<SystemSchemaInfo> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSystemSchemasResponse that = (ListSystemSchemasResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("schemas", schemas)
        .toString();
  }

  ListSystemSchemasResponsePb toPb() {
    ListSystemSchemasResponsePb pb = new ListSystemSchemasResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSchemas(schemas);

    return pb;
  }

  static ListSystemSchemasResponse fromPb(ListSystemSchemasResponsePb pb) {
    ListSystemSchemasResponse model = new ListSystemSchemasResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSchemas(pb.getSchemas());

    return model;
  }

  public static class ListSystemSchemasResponseSerializer
      extends JsonSerializer<ListSystemSchemasResponse> {
    @Override
    public void serialize(
        ListSystemSchemasResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSystemSchemasResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSystemSchemasResponseDeserializer
      extends JsonDeserializer<ListSystemSchemasResponse> {
    @Override
    public ListSystemSchemasResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSystemSchemasResponsePb pb = mapper.readValue(p, ListSystemSchemasResponsePb.class);
      return ListSystemSchemasResponse.fromPb(pb);
    }
  }
}

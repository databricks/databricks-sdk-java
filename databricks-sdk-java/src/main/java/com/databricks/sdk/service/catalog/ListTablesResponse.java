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
@JsonSerialize(using = ListTablesResponse.ListTablesResponseSerializer.class)
@JsonDeserialize(using = ListTablesResponse.ListTablesResponseDeserializer.class)
public class ListTablesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of table information objects. */
  private Collection<TableInfo> tables;

  public ListTablesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTablesResponse setTables(Collection<TableInfo> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<TableInfo> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTablesResponse that = (ListTablesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }

  ListTablesResponsePb toPb() {
    ListTablesResponsePb pb = new ListTablesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setTables(tables);

    return pb;
  }

  static ListTablesResponse fromPb(ListTablesResponsePb pb) {
    ListTablesResponse model = new ListTablesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setTables(pb.getTables());

    return model;
  }

  public static class ListTablesResponseSerializer extends JsonSerializer<ListTablesResponse> {
    @Override
    public void serialize(ListTablesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTablesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTablesResponseDeserializer extends JsonDeserializer<ListTablesResponse> {
    @Override
    public ListTablesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTablesResponsePb pb = mapper.readValue(p, ListTablesResponsePb.class);
      return ListTablesResponse.fromPb(pb);
    }
  }
}

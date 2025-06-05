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
@JsonSerialize(using = ListTableSummariesResponse.ListTableSummariesResponseSerializer.class)
@JsonDeserialize(using = ListTableSummariesResponse.ListTableSummariesResponseDeserializer.class)
public class ListTableSummariesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** List of table summaries. */
  private Collection<TableSummary> tables;

  public ListTableSummariesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListTableSummariesResponse setTables(Collection<TableSummary> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<TableSummary> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTableSummariesResponse that = (ListTableSummariesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTableSummariesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("tables", tables)
        .toString();
  }

  ListTableSummariesResponsePb toPb() {
    ListTableSummariesResponsePb pb = new ListTableSummariesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setTables(tables);

    return pb;
  }

  static ListTableSummariesResponse fromPb(ListTableSummariesResponsePb pb) {
    ListTableSummariesResponse model = new ListTableSummariesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setTables(pb.getTables());

    return model;
  }

  public static class ListTableSummariesResponseSerializer
      extends JsonSerializer<ListTableSummariesResponse> {
    @Override
    public void serialize(
        ListTableSummariesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTableSummariesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTableSummariesResponseDeserializer
      extends JsonDeserializer<ListTableSummariesResponse> {
    @Override
    public ListTableSummariesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTableSummariesResponsePb pb = mapper.readValue(p, ListTableSummariesResponsePb.class);
      return ListTableSummariesResponse.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = ListAlertsResponse.ListAlertsResponseSerializer.class)
@JsonDeserialize(using = ListAlertsResponse.ListAlertsResponseDeserializer.class)
public class ListAlertsResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<ListAlertsResponseAlert> results;

  public ListAlertsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAlertsResponse setResults(Collection<ListAlertsResponseAlert> results) {
    this.results = results;
    return this;
  }

  public Collection<ListAlertsResponseAlert> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsResponse that = (ListAlertsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }

  ListAlertsResponsePb toPb() {
    ListAlertsResponsePb pb = new ListAlertsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setResults(results);

    return pb;
  }

  static ListAlertsResponse fromPb(ListAlertsResponsePb pb) {
    ListAlertsResponse model = new ListAlertsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListAlertsResponseSerializer extends JsonSerializer<ListAlertsResponse> {
    @Override
    public void serialize(ListAlertsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAlertsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAlertsResponseDeserializer extends JsonDeserializer<ListAlertsResponse> {
    @Override
    public ListAlertsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAlertsResponsePb pb = mapper.readValue(p, ListAlertsResponsePb.class);
      return ListAlertsResponse.fromPb(pb);
    }
  }
}

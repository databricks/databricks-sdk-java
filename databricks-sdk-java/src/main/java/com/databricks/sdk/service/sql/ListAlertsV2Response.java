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
@JsonSerialize(using = ListAlertsV2Response.ListAlertsV2ResponseSerializer.class)
@JsonDeserialize(using = ListAlertsV2Response.ListAlertsV2ResponseDeserializer.class)
public class ListAlertsV2Response {
  /** */
  private String nextPageToken;

  /** */
  private Collection<AlertV2> results;

  public ListAlertsV2Response setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAlertsV2Response setResults(Collection<AlertV2> results) {
    this.results = results;
    return this;
  }

  public Collection<AlertV2> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsV2Response that = (ListAlertsV2Response) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsV2Response.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }

  ListAlertsV2ResponsePb toPb() {
    ListAlertsV2ResponsePb pb = new ListAlertsV2ResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setResults(results);

    return pb;
  }

  static ListAlertsV2Response fromPb(ListAlertsV2ResponsePb pb) {
    ListAlertsV2Response model = new ListAlertsV2Response();
    model.setNextPageToken(pb.getNextPageToken());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListAlertsV2ResponseSerializer extends JsonSerializer<ListAlertsV2Response> {
    @Override
    public void serialize(
        ListAlertsV2Response value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAlertsV2ResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAlertsV2ResponseDeserializer
      extends JsonDeserializer<ListAlertsV2Response> {
    @Override
    public ListAlertsV2Response deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAlertsV2ResponsePb pb = mapper.readValue(p, ListAlertsV2ResponsePb.class);
      return ListAlertsV2Response.fromPb(pb);
    }
  }
}

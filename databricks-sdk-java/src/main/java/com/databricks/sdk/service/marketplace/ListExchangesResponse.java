// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ListExchangesResponse.ListExchangesResponseSerializer.class)
@JsonDeserialize(using = ListExchangesResponse.ListExchangesResponseDeserializer.class)
public class ListExchangesResponse {
  /** */
  private Collection<Exchange> exchanges;

  /** */
  private String nextPageToken;

  public ListExchangesResponse setExchanges(Collection<Exchange> exchanges) {
    this.exchanges = exchanges;
    return this;
  }

  public Collection<Exchange> getExchanges() {
    return exchanges;
  }

  public ListExchangesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExchangesResponse that = (ListExchangesResponse) o;
    return Objects.equals(exchanges, that.exchanges)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchanges, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesResponse.class)
        .add("exchanges", exchanges)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListExchangesResponsePb toPb() {
    ListExchangesResponsePb pb = new ListExchangesResponsePb();
    pb.setExchanges(exchanges);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListExchangesResponse fromPb(ListExchangesResponsePb pb) {
    ListExchangesResponse model = new ListExchangesResponse();
    model.setExchanges(pb.getExchanges());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListExchangesResponseSerializer
      extends JsonSerializer<ListExchangesResponse> {
    @Override
    public void serialize(
        ListExchangesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangesResponseDeserializer
      extends JsonDeserializer<ListExchangesResponse> {
    @Override
    public ListExchangesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangesResponsePb pb = mapper.readValue(p, ListExchangesResponsePb.class);
      return ListExchangesResponse.fromPb(pb);
    }
  }
}

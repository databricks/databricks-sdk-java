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
@JsonSerialize(using = ListExchangeFiltersResponse.ListExchangeFiltersResponseSerializer.class)
@JsonDeserialize(using = ListExchangeFiltersResponse.ListExchangeFiltersResponseDeserializer.class)
public class ListExchangeFiltersResponse {
  /** */
  private Collection<ExchangeFilter> filters;

  /** */
  private String nextPageToken;

  public ListExchangeFiltersResponse setFilters(Collection<ExchangeFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<ExchangeFilter> getFilters() {
    return filters;
  }

  public ListExchangeFiltersResponse setNextPageToken(String nextPageToken) {
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
    ListExchangeFiltersResponse that = (ListExchangeFiltersResponse) o;
    return Objects.equals(filters, that.filters)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangeFiltersResponse.class)
        .add("filters", filters)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListExchangeFiltersResponsePb toPb() {
    ListExchangeFiltersResponsePb pb = new ListExchangeFiltersResponsePb();
    pb.setFilters(filters);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListExchangeFiltersResponse fromPb(ListExchangeFiltersResponsePb pb) {
    ListExchangeFiltersResponse model = new ListExchangeFiltersResponse();
    model.setFilters(pb.getFilters());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListExchangeFiltersResponseSerializer
      extends JsonSerializer<ListExchangeFiltersResponse> {
    @Override
    public void serialize(
        ListExchangeFiltersResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangeFiltersResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangeFiltersResponseDeserializer
      extends JsonDeserializer<ListExchangeFiltersResponse> {
    @Override
    public ListExchangeFiltersResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangeFiltersResponsePb pb = mapper.readValue(p, ListExchangeFiltersResponsePb.class);
      return ListExchangeFiltersResponse.fromPb(pb);
    }
  }
}

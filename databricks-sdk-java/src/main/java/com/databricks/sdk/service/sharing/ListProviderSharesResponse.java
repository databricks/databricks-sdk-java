// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = ListProviderSharesResponse.ListProviderSharesResponseSerializer.class)
@JsonDeserialize(using = ListProviderSharesResponse.ListProviderSharesResponseDeserializer.class)
public class ListProviderSharesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of provider shares. */
  private Collection<ProviderShare> shares;

  public ListProviderSharesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProviderSharesResponse setShares(Collection<ProviderShare> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ProviderShare> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderSharesResponse that = (ListProviderSharesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderSharesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("shares", shares)
        .toString();
  }

  ListProviderSharesResponsePb toPb() {
    ListProviderSharesResponsePb pb = new ListProviderSharesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setShares(shares);

    return pb;
  }

  static ListProviderSharesResponse fromPb(ListProviderSharesResponsePb pb) {
    ListProviderSharesResponse model = new ListProviderSharesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setShares(pb.getShares());

    return model;
  }

  public static class ListProviderSharesResponseSerializer
      extends JsonSerializer<ListProviderSharesResponse> {
    @Override
    public void serialize(
        ListProviderSharesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProviderSharesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProviderSharesResponseDeserializer
      extends JsonDeserializer<ListProviderSharesResponse> {
    @Override
    public ListProviderSharesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProviderSharesResponsePb pb = mapper.readValue(p, ListProviderSharesResponsePb.class);
      return ListProviderSharesResponse.fromPb(pb);
    }
  }
}

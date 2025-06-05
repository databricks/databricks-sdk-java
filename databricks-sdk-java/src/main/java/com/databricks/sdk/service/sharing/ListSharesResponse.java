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
@JsonSerialize(using = ListSharesResponse.ListSharesResponseSerializer.class)
@JsonDeserialize(using = ListSharesResponse.ListSharesResponseDeserializer.class)
public class ListSharesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of data share information objects. */
  private Collection<ShareInfo> shares;

  public ListSharesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSharesResponse setShares(Collection<ShareInfo> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ShareInfo> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSharesResponse that = (ListSharesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSharesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("shares", shares)
        .toString();
  }

  ListSharesResponsePb toPb() {
    ListSharesResponsePb pb = new ListSharesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setShares(shares);

    return pb;
  }

  static ListSharesResponse fromPb(ListSharesResponsePb pb) {
    ListSharesResponse model = new ListSharesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setShares(pb.getShares());

    return model;
  }

  public static class ListSharesResponseSerializer extends JsonSerializer<ListSharesResponse> {
    @Override
    public void serialize(ListSharesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSharesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSharesResponseDeserializer extends JsonDeserializer<ListSharesResponse> {
    @Override
    public ListSharesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSharesResponsePb pb = mapper.readValue(p, ListSharesResponsePb.class);
      return ListSharesResponse.fromPb(pb);
    }
  }
}

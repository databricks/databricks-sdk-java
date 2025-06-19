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
@JsonSerialize(using = ListProvidersResponse.ListProvidersResponseSerializer.class)
@JsonDeserialize(using = ListProvidersResponse.ListProvidersResponseDeserializer.class)
public class ListProvidersResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<ProviderInfo> providers;

  public ListProvidersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProvidersResponse setProviders(Collection<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  public Collection<ProviderInfo> getProviders() {
    return providers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersResponse that = (ListProvidersResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, providers);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("providers", providers)
        .toString();
  }

  ListProvidersResponsePb toPb() {
    ListProvidersResponsePb pb = new ListProvidersResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setProviders(providers);

    return pb;
  }

  static ListProvidersResponse fromPb(ListProvidersResponsePb pb) {
    ListProvidersResponse model = new ListProvidersResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setProviders(pb.getProviders());

    return model;
  }

  public static class ListProvidersResponseSerializer
      extends JsonSerializer<ListProvidersResponse> {
    @Override
    public void serialize(
        ListProvidersResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProvidersResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProvidersResponseDeserializer
      extends JsonDeserializer<ListProvidersResponse> {
    @Override
    public ListProvidersResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProvidersResponsePb pb = mapper.readValue(p, ListProvidersResponsePb.class);
      return ListProvidersResponse.fromPb(pb);
    }
  }
}

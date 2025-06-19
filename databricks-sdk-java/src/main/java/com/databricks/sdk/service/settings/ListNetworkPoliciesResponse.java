// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = ListNetworkPoliciesResponse.ListNetworkPoliciesResponseSerializer.class)
@JsonDeserialize(using = ListNetworkPoliciesResponse.ListNetworkPoliciesResponseDeserializer.class)
public class ListNetworkPoliciesResponse {
  /** List of network policies. */
  private Collection<AccountNetworkPolicy> items;

  /**
   * A token that can be used to get the next page of results. If null, there are no more results to
   * show.
   */
  private String nextPageToken;

  public ListNetworkPoliciesResponse setItems(Collection<AccountNetworkPolicy> items) {
    this.items = items;
    return this;
  }

  public Collection<AccountNetworkPolicy> getItems() {
    return items;
  }

  public ListNetworkPoliciesResponse setNextPageToken(String nextPageToken) {
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
    ListNetworkPoliciesResponse that = (ListNetworkPoliciesResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkPoliciesResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListNetworkPoliciesResponsePb toPb() {
    ListNetworkPoliciesResponsePb pb = new ListNetworkPoliciesResponsePb();
    pb.setItems(items);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListNetworkPoliciesResponse fromPb(ListNetworkPoliciesResponsePb pb) {
    ListNetworkPoliciesResponse model = new ListNetworkPoliciesResponse();
    model.setItems(pb.getItems());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListNetworkPoliciesResponseSerializer
      extends JsonSerializer<ListNetworkPoliciesResponse> {
    @Override
    public void serialize(
        ListNetworkPoliciesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNetworkPoliciesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNetworkPoliciesResponseDeserializer
      extends JsonDeserializer<ListNetworkPoliciesResponse> {
    @Override
    public ListNetworkPoliciesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNetworkPoliciesResponsePb pb = mapper.readValue(p, ListNetworkPoliciesResponsePb.class);
      return ListNetworkPoliciesResponse.fromPb(pb);
    }
  }
}

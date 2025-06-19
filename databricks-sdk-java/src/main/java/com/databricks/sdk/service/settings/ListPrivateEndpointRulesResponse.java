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

/** The private endpoint rule list was successfully retrieved. */
@Generated
@JsonSerialize(
    using = ListPrivateEndpointRulesResponse.ListPrivateEndpointRulesResponseSerializer.class)
@JsonDeserialize(
    using = ListPrivateEndpointRulesResponse.ListPrivateEndpointRulesResponseDeserializer.class)
public class ListPrivateEndpointRulesResponse {
  /** */
  private Collection<NccPrivateEndpointRule> items;

  /**
   * A token that can be used to get the next page of results. If null, there are no more results to
   * show.
   */
  private String nextPageToken;

  public ListPrivateEndpointRulesResponse setItems(Collection<NccPrivateEndpointRule> items) {
    this.items = items;
    return this;
  }

  public Collection<NccPrivateEndpointRule> getItems() {
    return items;
  }

  public ListPrivateEndpointRulesResponse setNextPageToken(String nextPageToken) {
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
    ListPrivateEndpointRulesResponse that = (ListPrivateEndpointRulesResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateEndpointRulesResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListPrivateEndpointRulesResponsePb toPb() {
    ListPrivateEndpointRulesResponsePb pb = new ListPrivateEndpointRulesResponsePb();
    pb.setItems(items);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListPrivateEndpointRulesResponse fromPb(ListPrivateEndpointRulesResponsePb pb) {
    ListPrivateEndpointRulesResponse model = new ListPrivateEndpointRulesResponse();
    model.setItems(pb.getItems());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListPrivateEndpointRulesResponseSerializer
      extends JsonSerializer<ListPrivateEndpointRulesResponse> {
    @Override
    public void serialize(
        ListPrivateEndpointRulesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPrivateEndpointRulesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPrivateEndpointRulesResponseDeserializer
      extends JsonDeserializer<ListPrivateEndpointRulesResponse> {
    @Override
    public ListPrivateEndpointRulesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPrivateEndpointRulesResponsePb pb =
          mapper.readValue(p, ListPrivateEndpointRulesResponsePb.class);
      return ListPrivateEndpointRulesResponse.fromPb(pb);
    }
  }
}

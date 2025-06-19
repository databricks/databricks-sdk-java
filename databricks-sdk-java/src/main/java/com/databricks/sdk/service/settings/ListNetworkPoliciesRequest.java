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
import java.util.Objects;

/** List network policies */
@Generated
@JsonSerialize(using = ListNetworkPoliciesRequest.ListNetworkPoliciesRequestSerializer.class)
@JsonDeserialize(using = ListNetworkPoliciesRequest.ListNetworkPoliciesRequestDeserializer.class)
public class ListNetworkPoliciesRequest {
  /** Pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListNetworkPoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNetworkPoliciesRequest that = (ListNetworkPoliciesRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkPoliciesRequest.class).add("pageToken", pageToken).toString();
  }

  ListNetworkPoliciesRequestPb toPb() {
    ListNetworkPoliciesRequestPb pb = new ListNetworkPoliciesRequestPb();
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListNetworkPoliciesRequest fromPb(ListNetworkPoliciesRequestPb pb) {
    ListNetworkPoliciesRequest model = new ListNetworkPoliciesRequest();
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListNetworkPoliciesRequestSerializer
      extends JsonSerializer<ListNetworkPoliciesRequest> {
    @Override
    public void serialize(
        ListNetworkPoliciesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNetworkPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNetworkPoliciesRequestDeserializer
      extends JsonDeserializer<ListNetworkPoliciesRequest> {
    @Override
    public ListNetworkPoliciesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNetworkPoliciesRequestPb pb = mapper.readValue(p, ListNetworkPoliciesRequestPb.class);
      return ListNetworkPoliciesRequest.fromPb(pb);
    }
  }
}

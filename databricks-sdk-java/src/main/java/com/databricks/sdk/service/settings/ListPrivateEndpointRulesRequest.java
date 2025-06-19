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

/** List private endpoint rules */
@Generated
@JsonSerialize(
    using = ListPrivateEndpointRulesRequest.ListPrivateEndpointRulesRequestSerializer.class)
@JsonDeserialize(
    using = ListPrivateEndpointRulesRequest.ListPrivateEndpointRulesRequestDeserializer.class)
public class ListPrivateEndpointRulesRequest {
  /** Your Network Connectvity Configuration ID. */
  private String networkConnectivityConfigId;

  /** Pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListPrivateEndpointRulesRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public ListPrivateEndpointRulesRequest setPageToken(String pageToken) {
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
    ListPrivateEndpointRulesRequest that = (ListPrivateEndpointRulesRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateEndpointRulesRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("pageToken", pageToken)
        .toString();
  }

  ListPrivateEndpointRulesRequestPb toPb() {
    ListPrivateEndpointRulesRequestPb pb = new ListPrivateEndpointRulesRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListPrivateEndpointRulesRequest fromPb(ListPrivateEndpointRulesRequestPb pb) {
    ListPrivateEndpointRulesRequest model = new ListPrivateEndpointRulesRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListPrivateEndpointRulesRequestSerializer
      extends JsonSerializer<ListPrivateEndpointRulesRequest> {
    @Override
    public void serialize(
        ListPrivateEndpointRulesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPrivateEndpointRulesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPrivateEndpointRulesRequestDeserializer
      extends JsonDeserializer<ListPrivateEndpointRulesRequest> {
    @Override
    public ListPrivateEndpointRulesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPrivateEndpointRulesRequestPb pb =
          mapper.readValue(p, ListPrivateEndpointRulesRequestPb.class);
      return ListPrivateEndpointRulesRequest.fromPb(pb);
    }
  }
}

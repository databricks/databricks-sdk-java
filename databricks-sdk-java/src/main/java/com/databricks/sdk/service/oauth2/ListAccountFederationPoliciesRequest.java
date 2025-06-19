// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** List account federation policies */
@Generated
@JsonSerialize(
    using =
        ListAccountFederationPoliciesRequest.ListAccountFederationPoliciesRequestSerializer.class)
@JsonDeserialize(
    using =
        ListAccountFederationPoliciesRequest.ListAccountFederationPoliciesRequestDeserializer.class)
public class ListAccountFederationPoliciesRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListAccountFederationPoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAccountFederationPoliciesRequest setPageToken(String pageToken) {
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
    ListAccountFederationPoliciesRequest that = (ListAccountFederationPoliciesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountFederationPoliciesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAccountFederationPoliciesRequestPb toPb() {
    ListAccountFederationPoliciesRequestPb pb = new ListAccountFederationPoliciesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAccountFederationPoliciesRequest fromPb(ListAccountFederationPoliciesRequestPb pb) {
    ListAccountFederationPoliciesRequest model = new ListAccountFederationPoliciesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAccountFederationPoliciesRequestSerializer
      extends JsonSerializer<ListAccountFederationPoliciesRequest> {
    @Override
    public void serialize(
        ListAccountFederationPoliciesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAccountFederationPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountFederationPoliciesRequestDeserializer
      extends JsonDeserializer<ListAccountFederationPoliciesRequest> {
    @Override
    public ListAccountFederationPoliciesRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountFederationPoliciesRequestPb pb =
          mapper.readValue(p, ListAccountFederationPoliciesRequestPb.class);
      return ListAccountFederationPoliciesRequest.fromPb(pb);
    }
  }
}

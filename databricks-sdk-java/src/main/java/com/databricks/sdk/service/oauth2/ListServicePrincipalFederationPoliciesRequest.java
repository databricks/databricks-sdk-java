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

/** List service principal federation policies */
@Generated
@JsonSerialize(
    using =
        ListServicePrincipalFederationPoliciesRequest
            .ListServicePrincipalFederationPoliciesRequestSerializer.class)
@JsonDeserialize(
    using =
        ListServicePrincipalFederationPoliciesRequest
            .ListServicePrincipalFederationPoliciesRequestDeserializer.class)
public class ListServicePrincipalFederationPoliciesRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  /** The service principal id for the federation policy. */
  private Long servicePrincipalId;

  public ListServicePrincipalFederationPoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListServicePrincipalFederationPoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListServicePrincipalFederationPoliciesRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalFederationPoliciesRequest that =
        (ListServicePrincipalFederationPoliciesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalFederationPoliciesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  ListServicePrincipalFederationPoliciesRequestPb toPb() {
    ListServicePrincipalFederationPoliciesRequestPb pb =
        new ListServicePrincipalFederationPoliciesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static ListServicePrincipalFederationPoliciesRequest fromPb(
      ListServicePrincipalFederationPoliciesRequestPb pb) {
    ListServicePrincipalFederationPoliciesRequest model =
        new ListServicePrincipalFederationPoliciesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class ListServicePrincipalFederationPoliciesRequestSerializer
      extends JsonSerializer<ListServicePrincipalFederationPoliciesRequest> {
    @Override
    public void serialize(
        ListServicePrincipalFederationPoliciesRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListServicePrincipalFederationPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListServicePrincipalFederationPoliciesRequestDeserializer
      extends JsonDeserializer<ListServicePrincipalFederationPoliciesRequest> {
    @Override
    public ListServicePrincipalFederationPoliciesRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListServicePrincipalFederationPoliciesRequestPb pb =
          mapper.readValue(p, ListServicePrincipalFederationPoliciesRequestPb.class);
      return ListServicePrincipalFederationPoliciesRequest.fromPb(pb);
    }
  }
}

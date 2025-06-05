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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = ListFederationPoliciesResponse.ListFederationPoliciesResponseSerializer.class)
@JsonDeserialize(
    using = ListFederationPoliciesResponse.ListFederationPoliciesResponseDeserializer.class)
public class ListFederationPoliciesResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<FederationPolicy> policies;

  public ListFederationPoliciesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListFederationPoliciesResponse setPolicies(Collection<FederationPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<FederationPolicy> getPolicies() {
    return policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFederationPoliciesResponse that = (ListFederationPoliciesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFederationPoliciesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("policies", policies)
        .toString();
  }

  ListFederationPoliciesResponsePb toPb() {
    ListFederationPoliciesResponsePb pb = new ListFederationPoliciesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPolicies(policies);

    return pb;
  }

  static ListFederationPoliciesResponse fromPb(ListFederationPoliciesResponsePb pb) {
    ListFederationPoliciesResponse model = new ListFederationPoliciesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPolicies(pb.getPolicies());

    return model;
  }

  public static class ListFederationPoliciesResponseSerializer
      extends JsonSerializer<ListFederationPoliciesResponse> {
    @Override
    public void serialize(
        ListFederationPoliciesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFederationPoliciesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFederationPoliciesResponseDeserializer
      extends JsonDeserializer<ListFederationPoliciesResponse> {
    @Override
    public ListFederationPoliciesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFederationPoliciesResponsePb pb =
          mapper.readValue(p, ListFederationPoliciesResponsePb.class);
      return ListFederationPoliciesResponse.fromPb(pb);
    }
  }
}

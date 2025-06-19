// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = ListPoliciesResponse.ListPoliciesResponseSerializer.class)
@JsonDeserialize(using = ListPoliciesResponse.ListPoliciesResponseDeserializer.class)
public class ListPoliciesResponse {
  /** List of policies. */
  private Collection<Policy> policies;

  public ListPoliciesResponse setPolicies(Collection<Policy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<Policy> getPolicies() {
    return policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPoliciesResponse that = (ListPoliciesResponse) o;
    return Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPoliciesResponse.class).add("policies", policies).toString();
  }

  ListPoliciesResponsePb toPb() {
    ListPoliciesResponsePb pb = new ListPoliciesResponsePb();
    pb.setPolicies(policies);

    return pb;
  }

  static ListPoliciesResponse fromPb(ListPoliciesResponsePb pb) {
    ListPoliciesResponse model = new ListPoliciesResponse();
    model.setPolicies(pb.getPolicies());

    return model;
  }

  public static class ListPoliciesResponseSerializer extends JsonSerializer<ListPoliciesResponse> {
    @Override
    public void serialize(
        ListPoliciesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPoliciesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPoliciesResponseDeserializer
      extends JsonDeserializer<ListPoliciesResponse> {
    @Override
    public ListPoliciesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPoliciesResponsePb pb = mapper.readValue(p, ListPoliciesResponsePb.class);
      return ListPoliciesResponse.fromPb(pb);
    }
  }
}

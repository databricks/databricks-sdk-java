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
@JsonSerialize(using = ListPolicyFamiliesResponse.ListPolicyFamiliesResponseSerializer.class)
@JsonDeserialize(using = ListPolicyFamiliesResponse.ListPolicyFamiliesResponseDeserializer.class)
public class ListPolicyFamiliesResponse {
  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  private String nextPageToken;

  /** List of policy families. */
  private Collection<PolicyFamily> policyFamilies;

  public ListPolicyFamiliesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPolicyFamiliesResponse setPolicyFamilies(Collection<PolicyFamily> policyFamilies) {
    this.policyFamilies = policyFamilies;
    return this;
  }

  public Collection<PolicyFamily> getPolicyFamilies() {
    return policyFamilies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPolicyFamiliesResponse that = (ListPolicyFamiliesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policyFamilies, that.policyFamilies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policyFamilies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("policyFamilies", policyFamilies)
        .toString();
  }

  ListPolicyFamiliesResponsePb toPb() {
    ListPolicyFamiliesResponsePb pb = new ListPolicyFamiliesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPolicyFamilies(policyFamilies);

    return pb;
  }

  static ListPolicyFamiliesResponse fromPb(ListPolicyFamiliesResponsePb pb) {
    ListPolicyFamiliesResponse model = new ListPolicyFamiliesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPolicyFamilies(pb.getPolicyFamilies());

    return model;
  }

  public static class ListPolicyFamiliesResponseSerializer
      extends JsonSerializer<ListPolicyFamiliesResponse> {
    @Override
    public void serialize(
        ListPolicyFamiliesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPolicyFamiliesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPolicyFamiliesResponseDeserializer
      extends JsonDeserializer<ListPolicyFamiliesResponse> {
    @Override
    public ListPolicyFamiliesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPolicyFamiliesResponsePb pb = mapper.readValue(p, ListPolicyFamiliesResponsePb.class);
      return ListPolicyFamiliesResponse.fromPb(pb);
    }
  }
}

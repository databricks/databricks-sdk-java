// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** A list of policies. */
@Generated
@JsonSerialize(using = ListBudgetPoliciesResponse.ListBudgetPoliciesResponseSerializer.class)
@JsonDeserialize(using = ListBudgetPoliciesResponse.ListBudgetPoliciesResponseDeserializer.class)
public class ListBudgetPoliciesResponse {
  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  private String nextPageToken;

  /** */
  private Collection<BudgetPolicy> policies;

  /**
   * A token that can be sent as `page_token` to retrieve the previous page. In this field is
   * omitted, there are no previous pages.
   */
  private String previousPageToken;

  public ListBudgetPoliciesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListBudgetPoliciesResponse setPolicies(Collection<BudgetPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<BudgetPolicy> getPolicies() {
    return policies;
  }

  public ListBudgetPoliciesResponse setPreviousPageToken(String previousPageToken) {
    this.previousPageToken = previousPageToken;
    return this;
  }

  public String getPreviousPageToken() {
    return previousPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBudgetPoliciesResponse that = (ListBudgetPoliciesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policies, that.policies)
        && Objects.equals(previousPageToken, that.previousPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policies, previousPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetPoliciesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("policies", policies)
        .add("previousPageToken", previousPageToken)
        .toString();
  }

  ListBudgetPoliciesResponsePb toPb() {
    ListBudgetPoliciesResponsePb pb = new ListBudgetPoliciesResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPolicies(policies);
    pb.setPreviousPageToken(previousPageToken);

    return pb;
  }

  static ListBudgetPoliciesResponse fromPb(ListBudgetPoliciesResponsePb pb) {
    ListBudgetPoliciesResponse model = new ListBudgetPoliciesResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPolicies(pb.getPolicies());
    model.setPreviousPageToken(pb.getPreviousPageToken());

    return model;
  }

  public static class ListBudgetPoliciesResponseSerializer
      extends JsonSerializer<ListBudgetPoliciesResponse> {
    @Override
    public void serialize(
        ListBudgetPoliciesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListBudgetPoliciesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListBudgetPoliciesResponseDeserializer
      extends JsonDeserializer<ListBudgetPoliciesResponse> {
    @Override
    public ListBudgetPoliciesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListBudgetPoliciesResponsePb pb = mapper.readValue(p, ListBudgetPoliciesResponsePb.class);
      return ListBudgetPoliciesResponse.fromPb(pb);
    }
  }
}

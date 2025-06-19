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

@Generated
@JsonSerialize(
    using = ListBudgetConfigurationsResponse.ListBudgetConfigurationsResponseSerializer.class)
@JsonDeserialize(
    using = ListBudgetConfigurationsResponse.ListBudgetConfigurationsResponseDeserializer.class)
public class ListBudgetConfigurationsResponse {
  /** */
  private Collection<BudgetConfiguration> budgets;

  /**
   * Token which can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no subsequent budgets.
   */
  private String nextPageToken;

  public ListBudgetConfigurationsResponse setBudgets(Collection<BudgetConfiguration> budgets) {
    this.budgets = budgets;
    return this;
  }

  public Collection<BudgetConfiguration> getBudgets() {
    return budgets;
  }

  public ListBudgetConfigurationsResponse setNextPageToken(String nextPageToken) {
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
    ListBudgetConfigurationsResponse that = (ListBudgetConfigurationsResponse) o;
    return Objects.equals(budgets, that.budgets)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetConfigurationsResponse.class)
        .add("budgets", budgets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListBudgetConfigurationsResponsePb toPb() {
    ListBudgetConfigurationsResponsePb pb = new ListBudgetConfigurationsResponsePb();
    pb.setBudgets(budgets);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListBudgetConfigurationsResponse fromPb(ListBudgetConfigurationsResponsePb pb) {
    ListBudgetConfigurationsResponse model = new ListBudgetConfigurationsResponse();
    model.setBudgets(pb.getBudgets());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListBudgetConfigurationsResponseSerializer
      extends JsonSerializer<ListBudgetConfigurationsResponse> {
    @Override
    public void serialize(
        ListBudgetConfigurationsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListBudgetConfigurationsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListBudgetConfigurationsResponseDeserializer
      extends JsonDeserializer<ListBudgetConfigurationsResponse> {
    @Override
    public ListBudgetConfigurationsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListBudgetConfigurationsResponsePb pb =
          mapper.readValue(p, ListBudgetConfigurationsResponsePb.class);
      return ListBudgetConfigurationsResponse.fromPb(pb);
    }
  }
}

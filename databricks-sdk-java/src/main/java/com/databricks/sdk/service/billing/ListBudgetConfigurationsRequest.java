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
import java.util.Objects;

/** Get all budgets */
@Generated
@JsonSerialize(
    using = ListBudgetConfigurationsRequest.ListBudgetConfigurationsRequestSerializer.class)
@JsonDeserialize(
    using = ListBudgetConfigurationsRequest.ListBudgetConfigurationsRequestDeserializer.class)
public class ListBudgetConfigurationsRequest {
  /**
   * A page token received from a previous get all budget configurations call. This token can be
   * used to retrieve the subsequent page. Requests first page if absent.
   */
  private String pageToken;

  public ListBudgetConfigurationsRequest setPageToken(String pageToken) {
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
    ListBudgetConfigurationsRequest that = (ListBudgetConfigurationsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetConfigurationsRequest.class)
        .add("pageToken", pageToken)
        .toString();
  }

  ListBudgetConfigurationsRequestPb toPb() {
    ListBudgetConfigurationsRequestPb pb = new ListBudgetConfigurationsRequestPb();
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListBudgetConfigurationsRequest fromPb(ListBudgetConfigurationsRequestPb pb) {
    ListBudgetConfigurationsRequest model = new ListBudgetConfigurationsRequest();
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListBudgetConfigurationsRequestSerializer
      extends JsonSerializer<ListBudgetConfigurationsRequest> {
    @Override
    public void serialize(
        ListBudgetConfigurationsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListBudgetConfigurationsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListBudgetConfigurationsRequestDeserializer
      extends JsonDeserializer<ListBudgetConfigurationsRequest> {
    @Override
    public ListBudgetConfigurationsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListBudgetConfigurationsRequestPb pb =
          mapper.readValue(p, ListBudgetConfigurationsRequestPb.class);
      return ListBudgetConfigurationsRequest.fromPb(pb);
    }
  }
}

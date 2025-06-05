// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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

/** Cancel the results for the a query for a published, embedded dashboard */
@Generated
@JsonSerialize(
    using =
        CancelPublishedQueryExecutionRequest.CancelPublishedQueryExecutionRequestSerializer.class)
@JsonDeserialize(
    using =
        CancelPublishedQueryExecutionRequest.CancelPublishedQueryExecutionRequestDeserializer.class)
public class CancelPublishedQueryExecutionRequest {
  /** */
  private String dashboardName;

  /** */
  private String dashboardRevisionId;

  /** Example: EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ */
  private Collection<String> tokens;

  public CancelPublishedQueryExecutionRequest setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public String getDashboardName() {
    return dashboardName;
  }

  public CancelPublishedQueryExecutionRequest setDashboardRevisionId(String dashboardRevisionId) {
    this.dashboardRevisionId = dashboardRevisionId;
    return this;
  }

  public String getDashboardRevisionId() {
    return dashboardRevisionId;
  }

  public CancelPublishedQueryExecutionRequest setTokens(Collection<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public Collection<String> getTokens() {
    return tokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelPublishedQueryExecutionRequest that = (CancelPublishedQueryExecutionRequest) o;
    return Objects.equals(dashboardName, that.dashboardName)
        && Objects.equals(dashboardRevisionId, that.dashboardRevisionId)
        && Objects.equals(tokens, that.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardName, dashboardRevisionId, tokens);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelPublishedQueryExecutionRequest.class)
        .add("dashboardName", dashboardName)
        .add("dashboardRevisionId", dashboardRevisionId)
        .add("tokens", tokens)
        .toString();
  }

  CancelPublishedQueryExecutionRequestPb toPb() {
    CancelPublishedQueryExecutionRequestPb pb = new CancelPublishedQueryExecutionRequestPb();
    pb.setDashboardName(dashboardName);
    pb.setDashboardRevisionId(dashboardRevisionId);
    pb.setTokens(tokens);

    return pb;
  }

  static CancelPublishedQueryExecutionRequest fromPb(CancelPublishedQueryExecutionRequestPb pb) {
    CancelPublishedQueryExecutionRequest model = new CancelPublishedQueryExecutionRequest();
    model.setDashboardName(pb.getDashboardName());
    model.setDashboardRevisionId(pb.getDashboardRevisionId());
    model.setTokens(pb.getTokens());

    return model;
  }

  public static class CancelPublishedQueryExecutionRequestSerializer
      extends JsonSerializer<CancelPublishedQueryExecutionRequest> {
    @Override
    public void serialize(
        CancelPublishedQueryExecutionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CancelPublishedQueryExecutionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CancelPublishedQueryExecutionRequestDeserializer
      extends JsonDeserializer<CancelPublishedQueryExecutionRequest> {
    @Override
    public CancelPublishedQueryExecutionRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CancelPublishedQueryExecutionRequestPb pb =
          mapper.readValue(p, CancelPublishedQueryExecutionRequestPb.class);
      return CancelPublishedQueryExecutionRequest.fromPb(pb);
    }
  }
}

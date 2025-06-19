// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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

/** List app deployments */
@Generated
@JsonSerialize(using = ListAppDeploymentsRequest.ListAppDeploymentsRequestSerializer.class)
@JsonDeserialize(using = ListAppDeploymentsRequest.ListAppDeploymentsRequestDeserializer.class)
public class ListAppDeploymentsRequest {
  /** The name of the app. */
  private String appName;

  /** Upper bound for items returned. */
  private Long pageSize;

  /** Pagination token to go to the next page of apps. Requests first page if absent. */
  private String pageToken;

  public ListAppDeploymentsRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public ListAppDeploymentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAppDeploymentsRequest setPageToken(String pageToken) {
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
    ListAppDeploymentsRequest that = (ListAppDeploymentsRequest) o;
    return Objects.equals(appName, that.appName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppDeploymentsRequest.class)
        .add("appName", appName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAppDeploymentsRequestPb toPb() {
    ListAppDeploymentsRequestPb pb = new ListAppDeploymentsRequestPb();
    pb.setAppName(appName);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAppDeploymentsRequest fromPb(ListAppDeploymentsRequestPb pb) {
    ListAppDeploymentsRequest model = new ListAppDeploymentsRequest();
    model.setAppName(pb.getAppName());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAppDeploymentsRequestSerializer
      extends JsonSerializer<ListAppDeploymentsRequest> {
    @Override
    public void serialize(
        ListAppDeploymentsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAppDeploymentsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAppDeploymentsRequestDeserializer
      extends JsonDeserializer<ListAppDeploymentsRequest> {
    @Override
    public ListAppDeploymentsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAppDeploymentsRequestPb pb = mapper.readValue(p, ListAppDeploymentsRequestPb.class);
      return ListAppDeploymentsRequest.fromPb(pb);
    }
  }
}

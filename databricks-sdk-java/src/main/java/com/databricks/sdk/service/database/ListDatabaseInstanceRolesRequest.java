// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** List roles for a Database Instance */
@Generated
@JsonSerialize(
    using = ListDatabaseInstanceRolesRequest.ListDatabaseInstanceRolesRequestSerializer.class)
@JsonDeserialize(
    using = ListDatabaseInstanceRolesRequest.ListDatabaseInstanceRolesRequestDeserializer.class)
public class ListDatabaseInstanceRolesRequest {
  /** */
  private String instanceName;

  /** Upper bound for items returned. */
  private Long pageSize;

  /**
   * Pagination token to go to the next page of Database Instances. Requests first page if absent.
   */
  private String pageToken;

  public ListDatabaseInstanceRolesRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public ListDatabaseInstanceRolesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatabaseInstanceRolesRequest setPageToken(String pageToken) {
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
    ListDatabaseInstanceRolesRequest that = (ListDatabaseInstanceRolesRequest) o;
    return Objects.equals(instanceName, that.instanceName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstanceRolesRequest.class)
        .add("instanceName", instanceName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListDatabaseInstanceRolesRequestPb toPb() {
    ListDatabaseInstanceRolesRequestPb pb = new ListDatabaseInstanceRolesRequestPb();
    pb.setInstanceName(instanceName);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListDatabaseInstanceRolesRequest fromPb(ListDatabaseInstanceRolesRequestPb pb) {
    ListDatabaseInstanceRolesRequest model = new ListDatabaseInstanceRolesRequest();
    model.setInstanceName(pb.getInstanceName());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListDatabaseInstanceRolesRequestSerializer
      extends JsonSerializer<ListDatabaseInstanceRolesRequest> {
    @Override
    public void serialize(
        ListDatabaseInstanceRolesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDatabaseInstanceRolesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDatabaseInstanceRolesRequestDeserializer
      extends JsonDeserializer<ListDatabaseInstanceRolesRequest> {
    @Override
    public ListDatabaseInstanceRolesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDatabaseInstanceRolesRequestPb pb =
          mapper.readValue(p, ListDatabaseInstanceRolesRequestPb.class);
      return ListDatabaseInstanceRolesRequest.fromPb(pb);
    }
  }
}

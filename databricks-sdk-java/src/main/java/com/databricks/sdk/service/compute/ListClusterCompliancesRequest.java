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
import java.util.Objects;

/** List cluster policy compliance */
@Generated
@JsonSerialize(using = ListClusterCompliancesRequest.ListClusterCompliancesRequestSerializer.class)
@JsonDeserialize(
    using = ListClusterCompliancesRequest.ListClusterCompliancesRequestDeserializer.class)
public class ListClusterCompliancesRequest {
  /**
   * Use this field to specify the maximum number of results to be returned by the server. The
   * server may further constrain the maximum number of results returned in a single page.
   */
  private Long pageSize;

  /**
   * A page token that can be used to navigate to the next page or previous page as returned by
   * `next_page_token` or `prev_page_token`.
   */
  private String pageToken;

  /** Canonical unique identifier for the cluster policy. */
  private String policyId;

  public ListClusterCompliancesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListClusterCompliancesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListClusterCompliancesRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClusterCompliancesRequest that = (ListClusterCompliancesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClusterCompliancesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("policyId", policyId)
        .toString();
  }

  ListClusterCompliancesRequestPb toPb() {
    ListClusterCompliancesRequestPb pb = new ListClusterCompliancesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setPolicyId(policyId);

    return pb;
  }

  static ListClusterCompliancesRequest fromPb(ListClusterCompliancesRequestPb pb) {
    ListClusterCompliancesRequest model = new ListClusterCompliancesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class ListClusterCompliancesRequestSerializer
      extends JsonSerializer<ListClusterCompliancesRequest> {
    @Override
    public void serialize(
        ListClusterCompliancesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClusterCompliancesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClusterCompliancesRequestDeserializer
      extends JsonDeserializer<ListClusterCompliancesRequest> {
    @Override
    public ListClusterCompliancesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClusterCompliancesRequestPb pb =
          mapper.readValue(p, ListClusterCompliancesRequestPb.class);
      return ListClusterCompliancesRequest.fromPb(pb);
    }
  }
}

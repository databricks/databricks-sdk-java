// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** List job policy compliance */
@Generated
@JsonSerialize(using = ListJobComplianceRequest.ListJobComplianceRequestSerializer.class)
@JsonDeserialize(using = ListJobComplianceRequest.ListJobComplianceRequestDeserializer.class)
public class ListJobComplianceRequest {
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

  public ListJobComplianceRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListJobComplianceRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListJobComplianceRequest setPolicyId(String policyId) {
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
    ListJobComplianceRequest that = (ListJobComplianceRequest) o;
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
    return new ToStringer(ListJobComplianceRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("policyId", policyId)
        .toString();
  }

  ListJobComplianceRequestPb toPb() {
    ListJobComplianceRequestPb pb = new ListJobComplianceRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setPolicyId(policyId);

    return pb;
  }

  static ListJobComplianceRequest fromPb(ListJobComplianceRequestPb pb) {
    ListJobComplianceRequest model = new ListJobComplianceRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class ListJobComplianceRequestSerializer
      extends JsonSerializer<ListJobComplianceRequest> {
    @Override
    public void serialize(
        ListJobComplianceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListJobComplianceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListJobComplianceRequestDeserializer
      extends JsonDeserializer<ListJobComplianceRequest> {
    @Override
    public ListJobComplianceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListJobComplianceRequestPb pb = mapper.readValue(p, ListJobComplianceRequestPb.class);
      return ListJobComplianceRequest.fromPb(pb);
    }
  }
}

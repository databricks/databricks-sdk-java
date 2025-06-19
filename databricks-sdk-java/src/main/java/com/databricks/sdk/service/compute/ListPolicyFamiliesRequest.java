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

/** List policy families */
@Generated
@JsonSerialize(using = ListPolicyFamiliesRequest.ListPolicyFamiliesRequestSerializer.class)
@JsonDeserialize(using = ListPolicyFamiliesRequest.ListPolicyFamiliesRequestDeserializer.class)
public class ListPolicyFamiliesRequest {
  /** Maximum number of policy families to return. */
  private Long maxResults;

  /** A token that can be used to get the next page of results. */
  private String pageToken;

  public ListPolicyFamiliesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPolicyFamiliesRequest setPageToken(String pageToken) {
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
    ListPolicyFamiliesRequest that = (ListPolicyFamiliesRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListPolicyFamiliesRequestPb toPb() {
    ListPolicyFamiliesRequestPb pb = new ListPolicyFamiliesRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListPolicyFamiliesRequest fromPb(ListPolicyFamiliesRequestPb pb) {
    ListPolicyFamiliesRequest model = new ListPolicyFamiliesRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListPolicyFamiliesRequestSerializer
      extends JsonSerializer<ListPolicyFamiliesRequest> {
    @Override
    public void serialize(
        ListPolicyFamiliesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPolicyFamiliesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPolicyFamiliesRequestDeserializer
      extends JsonDeserializer<ListPolicyFamiliesRequest> {
    @Override
    public ListPolicyFamiliesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPolicyFamiliesRequestPb pb = mapper.readValue(p, ListPolicyFamiliesRequestPb.class);
      return ListPolicyFamiliesRequest.fromPb(pb);
    }
  }
}

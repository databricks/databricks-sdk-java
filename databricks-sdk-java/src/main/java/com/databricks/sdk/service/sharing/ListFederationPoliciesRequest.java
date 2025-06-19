// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** List recipient federation policies */
@Generated
@JsonSerialize(using = ListFederationPoliciesRequest.ListFederationPoliciesRequestSerializer.class)
@JsonDeserialize(
    using = ListFederationPoliciesRequest.ListFederationPoliciesRequestDeserializer.class)
public class ListFederationPoliciesRequest {
  /** */
  private Long maxResults;

  /** */
  private String pageToken;

  /**
   * Name of the recipient. This is the name of the recipient for which the policies are being
   * listed.
   */
  private String recipientName;

  public ListFederationPoliciesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListFederationPoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListFederationPoliciesRequest setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFederationPoliciesRequest that = (ListFederationPoliciesRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFederationPoliciesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("recipientName", recipientName)
        .toString();
  }

  ListFederationPoliciesRequestPb toPb() {
    ListFederationPoliciesRequestPb pb = new ListFederationPoliciesRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setRecipientName(recipientName);

    return pb;
  }

  static ListFederationPoliciesRequest fromPb(ListFederationPoliciesRequestPb pb) {
    ListFederationPoliciesRequest model = new ListFederationPoliciesRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setRecipientName(pb.getRecipientName());

    return model;
  }

  public static class ListFederationPoliciesRequestSerializer
      extends JsonSerializer<ListFederationPoliciesRequest> {
    @Override
    public void serialize(
        ListFederationPoliciesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFederationPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFederationPoliciesRequestDeserializer
      extends JsonDeserializer<ListFederationPoliciesRequest> {
    @Override
    public ListFederationPoliciesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFederationPoliciesRequestPb pb =
          mapper.readValue(p, ListFederationPoliciesRequestPb.class);
      return ListFederationPoliciesRequest.fromPb(pb);
    }
  }
}

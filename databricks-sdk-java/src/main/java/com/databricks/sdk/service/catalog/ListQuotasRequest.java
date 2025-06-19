// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** List all resource quotas under a metastore. */
@Generated
@JsonSerialize(using = ListQuotasRequest.ListQuotasRequestSerializer.class)
@JsonDeserialize(using = ListQuotasRequest.ListQuotasRequestDeserializer.class)
public class ListQuotasRequest {
  /** The number of quotas to return. */
  private Long maxResults;

  /** Opaque token for the next page of results. */
  private String pageToken;

  public ListQuotasRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListQuotasRequest setPageToken(String pageToken) {
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
    ListQuotasRequest that = (ListQuotasRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQuotasRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListQuotasRequestPb toPb() {
    ListQuotasRequestPb pb = new ListQuotasRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListQuotasRequest fromPb(ListQuotasRequestPb pb) {
    ListQuotasRequest model = new ListQuotasRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListQuotasRequestSerializer extends JsonSerializer<ListQuotasRequest> {
    @Override
    public void serialize(ListQuotasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQuotasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQuotasRequestDeserializer extends JsonDeserializer<ListQuotasRequest> {
    @Override
    public ListQuotasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQuotasRequestPb pb = mapper.readValue(p, ListQuotasRequestPb.class);
      return ListQuotasRequest.fromPb(pb);
    }
  }
}

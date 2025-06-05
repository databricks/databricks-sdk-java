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

/** List Model Versions */
@Generated
@JsonSerialize(using = ListModelVersionsRequest.ListModelVersionsRequestSerializer.class)
@JsonDeserialize(using = ListModelVersionsRequest.ListModelVersionsRequestDeserializer.class)
public class ListModelVersionsRequest {
  /** The full three-level name of the registered model under which to list model versions */
  private String fullName;

  /**
   * Whether to include model versions in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  /**
   * Maximum number of model versions to return. If not set, the page length is set to a server
   * configured value (100, as of 1/3/2024). - when set to a value greater than 0, the page length
   * is the minimum of this value and a server configured value(1000, as of 1/3/2024); - when set to
   * 0, the page length is set to a server configured value (100, as of 1/3/2024) (recommended); -
   * when set to a value less than 0, an invalid parameter error is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListModelVersionsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ListModelVersionsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListModelVersionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListModelVersionsRequest setPageToken(String pageToken) {
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
    ListModelVersionsRequest that = (ListModelVersionsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelVersionsRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListModelVersionsRequestPb toPb() {
    ListModelVersionsRequestPb pb = new ListModelVersionsRequestPb();
    pb.setFullName(fullName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListModelVersionsRequest fromPb(ListModelVersionsRequestPb pb) {
    ListModelVersionsRequest model = new ListModelVersionsRequest();
    model.setFullName(pb.getFullName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListModelVersionsRequestSerializer
      extends JsonSerializer<ListModelVersionsRequest> {
    @Override
    public void serialize(
        ListModelVersionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListModelVersionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListModelVersionsRequestDeserializer
      extends JsonDeserializer<ListModelVersionsRequest> {
    @Override
    public ListModelVersionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListModelVersionsRequestPb pb = mapper.readValue(p, ListModelVersionsRequestPb.class);
      return ListModelVersionsRequest.fromPb(pb);
    }
  }
}

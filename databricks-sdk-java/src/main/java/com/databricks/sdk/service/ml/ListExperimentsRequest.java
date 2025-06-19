// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** List experiments */
@Generated
@JsonSerialize(using = ListExperimentsRequest.ListExperimentsRequestSerializer.class)
@JsonDeserialize(using = ListExperimentsRequest.ListExperimentsRequestDeserializer.class)
public class ListExperimentsRequest {
  /**
   * Maximum number of experiments desired. If `max_results` is unspecified, return all experiments.
   * If `max_results` is too large, it'll be automatically capped at 1000. Callers of this endpoint
   * are encouraged to pass max_results explicitly and leverage page_token to iterate through
   * experiments.
   */
  private Long maxResults;

  /** Token indicating the page of experiments to fetch */
  private String pageToken;

  /**
   * Qualifier for type of experiments to be returned. If unspecified, return only active
   * experiments.
   */
  private ViewType viewType;

  public ListExperimentsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListExperimentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListExperimentsRequest setViewType(ViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  public ViewType getViewType() {
    return viewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExperimentsRequest that = (ListExperimentsRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(viewType, that.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, viewType);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExperimentsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("viewType", viewType)
        .toString();
  }

  ListExperimentsRequestPb toPb() {
    ListExperimentsRequestPb pb = new ListExperimentsRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setViewType(viewType);

    return pb;
  }

  static ListExperimentsRequest fromPb(ListExperimentsRequestPb pb) {
    ListExperimentsRequest model = new ListExperimentsRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setViewType(pb.getViewType());

    return model;
  }

  public static class ListExperimentsRequestSerializer
      extends JsonSerializer<ListExperimentsRequest> {
    @Override
    public void serialize(
        ListExperimentsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExperimentsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExperimentsRequestDeserializer
      extends JsonDeserializer<ListExperimentsRequest> {
    @Override
    public ListExperimentsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExperimentsRequestPb pb = mapper.readValue(p, ListExperimentsRequestPb.class);
      return ListExperimentsRequest.fromPb(pb);
    }
  }
}

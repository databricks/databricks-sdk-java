// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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

/** List pipeline updates */
@Generated
@JsonSerialize(using = ListUpdatesRequest.ListUpdatesRequestSerializer.class)
@JsonDeserialize(using = ListUpdatesRequest.ListUpdatesRequestDeserializer.class)
public class ListUpdatesRequest {
  /** Max number of entries to return in a single page. */
  private Long maxResults;

  /** Page token returned by previous call */
  private String pageToken;

  /** The pipeline to return updates for. */
  private String pipelineId;

  /** If present, returns updates until and including this update_id. */
  private String untilUpdateId;

  public ListUpdatesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListUpdatesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListUpdatesRequest setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public ListUpdatesRequest setUntilUpdateId(String untilUpdateId) {
    this.untilUpdateId = untilUpdateId;
    return this;
  }

  public String getUntilUpdateId() {
    return untilUpdateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUpdatesRequest that = (ListUpdatesRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(untilUpdateId, that.untilUpdateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken, pipelineId, untilUpdateId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUpdatesRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("pipelineId", pipelineId)
        .add("untilUpdateId", untilUpdateId)
        .toString();
  }

  ListUpdatesRequestPb toPb() {
    ListUpdatesRequestPb pb = new ListUpdatesRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setPipelineId(pipelineId);
    pb.setUntilUpdateId(untilUpdateId);

    return pb;
  }

  static ListUpdatesRequest fromPb(ListUpdatesRequestPb pb) {
    ListUpdatesRequest model = new ListUpdatesRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setPipelineId(pb.getPipelineId());
    model.setUntilUpdateId(pb.getUntilUpdateId());

    return model;
  }

  public static class ListUpdatesRequestSerializer extends JsonSerializer<ListUpdatesRequest> {
    @Override
    public void serialize(ListUpdatesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListUpdatesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListUpdatesRequestDeserializer extends JsonDeserializer<ListUpdatesRequest> {
    @Override
    public ListUpdatesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListUpdatesRequestPb pb = mapper.readValue(p, ListUpdatesRequestPb.class);
      return ListUpdatesRequest.fromPb(pb);
    }
  }
}

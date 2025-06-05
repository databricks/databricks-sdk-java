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

/** Get metric history for a run */
@Generated
@JsonSerialize(using = GetHistoryRequest.GetHistoryRequestSerializer.class)
@JsonDeserialize(using = GetHistoryRequest.GetHistoryRequestDeserializer.class)
public class GetHistoryRequest {
  /**
   * Maximum number of Metric records to return per paginated request. Default is set to 25,000. If
   * set higher than 25,000, a request Exception will be raised.
   */
  private Long maxResults;

  /** Name of the metric. */
  private String metricKey;

  /** Token indicating the page of metric histories to fetch. */
  private String pageToken;

  /** ID of the run from which to fetch metric values. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run from which to fetch metric values. This field
   * will be removed in a future MLflow version.
   */
  private String runUuid;

  public GetHistoryRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetHistoryRequest setMetricKey(String metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public String getMetricKey() {
    return metricKey;
  }

  public GetHistoryRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetHistoryRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public GetHistoryRequest setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetHistoryRequest that = (GetHistoryRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(metricKey, that.metricKey)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, metricKey, pageToken, runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(GetHistoryRequest.class)
        .add("maxResults", maxResults)
        .add("metricKey", metricKey)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }

  GetHistoryRequestPb toPb() {
    GetHistoryRequestPb pb = new GetHistoryRequestPb();
    pb.setMaxResults(maxResults);
    pb.setMetricKey(metricKey);
    pb.setPageToken(pageToken);
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);

    return pb;
  }

  static GetHistoryRequest fromPb(GetHistoryRequestPb pb) {
    GetHistoryRequest model = new GetHistoryRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setMetricKey(pb.getMetricKey());
    model.setPageToken(pb.getPageToken());
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());

    return model;
  }

  public static class GetHistoryRequestSerializer extends JsonSerializer<GetHistoryRequest> {
    @Override
    public void serialize(GetHistoryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetHistoryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetHistoryRequestDeserializer extends JsonDeserializer<GetHistoryRequest> {
    @Override
    public GetHistoryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetHistoryRequestPb pb = mapper.readValue(p, GetHistoryRequestPb.class);
      return GetHistoryRequest.fromPb(pb);
    }
  }
}

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

/** Get a single job run */
@Generated
@JsonSerialize(using = GetRunRequest.GetRunRequestSerializer.class)
@JsonDeserialize(using = GetRunRequest.GetRunRequestDeserializer.class)
public class GetRunRequest {
  /** Whether to include the repair history in the response. */
  private Boolean includeHistory;

  /** Whether to include resolved parameter values in the response. */
  private Boolean includeResolvedValues;

  /**
   * Use `next_page_token` returned from the previous GetRun response to request the next page of
   * the run's array properties.
   */
  private String pageToken;

  /**
   * The canonical identifier of the run for which to retrieve the metadata. This field is required.
   */
  private Long runId;

  public GetRunRequest setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  public Boolean getIncludeHistory() {
    return includeHistory;
  }

  public GetRunRequest setIncludeResolvedValues(Boolean includeResolvedValues) {
    this.includeResolvedValues = includeResolvedValues;
    return this;
  }

  public Boolean getIncludeResolvedValues() {
    return includeResolvedValues;
  }

  public GetRunRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetRunRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunRequest that = (GetRunRequest) o;
    return Objects.equals(includeHistory, that.includeHistory)
        && Objects.equals(includeResolvedValues, that.includeResolvedValues)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeHistory, includeResolvedValues, pageToken, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunRequest.class)
        .add("includeHistory", includeHistory)
        .add("includeResolvedValues", includeResolvedValues)
        .add("pageToken", pageToken)
        .add("runId", runId)
        .toString();
  }

  GetRunRequestPb toPb() {
    GetRunRequestPb pb = new GetRunRequestPb();
    pb.setIncludeHistory(includeHistory);
    pb.setIncludeResolvedValues(includeResolvedValues);
    pb.setPageToken(pageToken);
    pb.setRunId(runId);

    return pb;
  }

  static GetRunRequest fromPb(GetRunRequestPb pb) {
    GetRunRequest model = new GetRunRequest();
    model.setIncludeHistory(pb.getIncludeHistory());
    model.setIncludeResolvedValues(pb.getIncludeResolvedValues());
    model.setPageToken(pb.getPageToken());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class GetRunRequestSerializer extends JsonSerializer<GetRunRequest> {
    @Override
    public void serialize(GetRunRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRunRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRunRequestDeserializer extends JsonDeserializer<GetRunRequest> {
    @Override
    public GetRunRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRunRequestPb pb = mapper.readValue(p, GetRunRequestPb.class);
      return GetRunRequest.fromPb(pb);
    }
  }
}

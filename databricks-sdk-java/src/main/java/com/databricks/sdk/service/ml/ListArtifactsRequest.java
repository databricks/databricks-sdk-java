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

/** List artifacts */
@Generated
@JsonSerialize(using = ListArtifactsRequest.ListArtifactsRequestSerializer.class)
@JsonDeserialize(using = ListArtifactsRequest.ListArtifactsRequestDeserializer.class)
public class ListArtifactsRequest {
  /**
   * The token indicating the page of artifact results to fetch. `page_token` is not supported when
   * listing artifacts in UC Volumes. A maximum of 1000 artifacts will be retrieved for UC Volumes.
   * Please call `/api/2.0/fs/directories{directory_path}` for listing artifacts in UC Volumes,
   * which supports pagination. See [List directory contents | Files
   * API](/api/workspace/files/listdirectorycontents).
   */
  private String pageToken;

  /** Filter artifacts matching this path (a relative path from the root artifact directory). */
  private String path;

  /** ID of the run whose artifacts to list. Must be provided. */
  private String runId;

  /**
   * [Deprecated, use `run_id` instead] ID of the run whose artifacts to list. This field will be
   * removed in a future MLflow version.
   */
  private String runUuid;

  public ListArtifactsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListArtifactsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ListArtifactsRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ListArtifactsRequest setRunUuid(String runUuid) {
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
    ListArtifactsRequest that = (ListArtifactsRequest) o;
    return Objects.equals(pageToken, that.pageToken)
        && Objects.equals(path, that.path)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, path, runId, runUuid);
  }

  @Override
  public String toString() {
    return new ToStringer(ListArtifactsRequest.class)
        .add("pageToken", pageToken)
        .add("path", path)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }

  ListArtifactsRequestPb toPb() {
    ListArtifactsRequestPb pb = new ListArtifactsRequestPb();
    pb.setPageToken(pageToken);
    pb.setPath(path);
    pb.setRunId(runId);
    pb.setRunUuid(runUuid);

    return pb;
  }

  static ListArtifactsRequest fromPb(ListArtifactsRequestPb pb) {
    ListArtifactsRequest model = new ListArtifactsRequest();
    model.setPageToken(pb.getPageToken());
    model.setPath(pb.getPath());
    model.setRunId(pb.getRunId());
    model.setRunUuid(pb.getRunUuid());

    return model;
  }

  public static class ListArtifactsRequestSerializer extends JsonSerializer<ListArtifactsRequest> {
    @Override
    public void serialize(
        ListArtifactsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListArtifactsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListArtifactsRequestDeserializer
      extends JsonDeserializer<ListArtifactsRequest> {
    @Override
    public ListArtifactsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListArtifactsRequestPb pb = mapper.readValue(p, ListArtifactsRequestPb.class);
      return ListArtifactsRequest.fromPb(pb);
    }
  }
}

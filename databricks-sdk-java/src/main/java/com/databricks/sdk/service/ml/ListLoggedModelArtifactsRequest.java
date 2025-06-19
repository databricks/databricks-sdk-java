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

/** List artifacts for a logged model */
@Generated
@JsonSerialize(
    using = ListLoggedModelArtifactsRequest.ListLoggedModelArtifactsRequestSerializer.class)
@JsonDeserialize(
    using = ListLoggedModelArtifactsRequest.ListLoggedModelArtifactsRequestDeserializer.class)
public class ListLoggedModelArtifactsRequest {
  /** Filter artifacts matching this path (a relative path from the root artifact directory). */
  private String artifactDirectoryPath;

  /** The ID of the logged model for which to list the artifacts. */
  private String modelId;

  /**
   * Token indicating the page of artifact results to fetch. `page_token` is not supported when
   * listing artifacts in UC Volumes. A maximum of 1000 artifacts will be retrieved for UC Volumes.
   * Please call `/api/2.0/fs/directories{directory_path}` for listing artifacts in UC Volumes,
   * which supports pagination. See [List directory contents | Files
   * API](/api/workspace/files/listdirectorycontents).
   */
  private String pageToken;

  public ListLoggedModelArtifactsRequest setArtifactDirectoryPath(String artifactDirectoryPath) {
    this.artifactDirectoryPath = artifactDirectoryPath;
    return this;
  }

  public String getArtifactDirectoryPath() {
    return artifactDirectoryPath;
  }

  public ListLoggedModelArtifactsRequest setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public ListLoggedModelArtifactsRequest setPageToken(String pageToken) {
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
    ListLoggedModelArtifactsRequest that = (ListLoggedModelArtifactsRequest) o;
    return Objects.equals(artifactDirectoryPath, that.artifactDirectoryPath)
        && Objects.equals(modelId, that.modelId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactDirectoryPath, modelId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListLoggedModelArtifactsRequest.class)
        .add("artifactDirectoryPath", artifactDirectoryPath)
        .add("modelId", modelId)
        .add("pageToken", pageToken)
        .toString();
  }

  ListLoggedModelArtifactsRequestPb toPb() {
    ListLoggedModelArtifactsRequestPb pb = new ListLoggedModelArtifactsRequestPb();
    pb.setArtifactDirectoryPath(artifactDirectoryPath);
    pb.setModelId(modelId);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListLoggedModelArtifactsRequest fromPb(ListLoggedModelArtifactsRequestPb pb) {
    ListLoggedModelArtifactsRequest model = new ListLoggedModelArtifactsRequest();
    model.setArtifactDirectoryPath(pb.getArtifactDirectoryPath());
    model.setModelId(pb.getModelId());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListLoggedModelArtifactsRequestSerializer
      extends JsonSerializer<ListLoggedModelArtifactsRequest> {
    @Override
    public void serialize(
        ListLoggedModelArtifactsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListLoggedModelArtifactsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListLoggedModelArtifactsRequestDeserializer
      extends JsonDeserializer<ListLoggedModelArtifactsRequest> {
    @Override
    public ListLoggedModelArtifactsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListLoggedModelArtifactsRequestPb pb =
          mapper.readValue(p, ListLoggedModelArtifactsRequestPb.class);
      return ListLoggedModelArtifactsRequest.fromPb(pb);
    }
  }
}

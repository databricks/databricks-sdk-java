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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListArtifactsResponse.ListArtifactsResponseSerializer.class)
@JsonDeserialize(using = ListArtifactsResponse.ListArtifactsResponseDeserializer.class)
public class ListArtifactsResponse {
  /** The file location and metadata for artifacts. */
  private Collection<FileInfo> files;

  /** The token that can be used to retrieve the next page of artifact results. */
  private String nextPageToken;

  /** The root artifact directory for the run. */
  private String rootUri;

  public ListArtifactsResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  public Collection<FileInfo> getFiles() {
    return files;
  }

  public ListArtifactsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListArtifactsResponse setRootUri(String rootUri) {
    this.rootUri = rootUri;
    return this;
  }

  public String getRootUri() {
    return rootUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListArtifactsResponse that = (ListArtifactsResponse) o;
    return Objects.equals(files, that.files)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(rootUri, that.rootUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, nextPageToken, rootUri);
  }

  @Override
  public String toString() {
    return new ToStringer(ListArtifactsResponse.class)
        .add("files", files)
        .add("nextPageToken", nextPageToken)
        .add("rootUri", rootUri)
        .toString();
  }

  ListArtifactsResponsePb toPb() {
    ListArtifactsResponsePb pb = new ListArtifactsResponsePb();
    pb.setFiles(files);
    pb.setNextPageToken(nextPageToken);
    pb.setRootUri(rootUri);

    return pb;
  }

  static ListArtifactsResponse fromPb(ListArtifactsResponsePb pb) {
    ListArtifactsResponse model = new ListArtifactsResponse();
    model.setFiles(pb.getFiles());
    model.setNextPageToken(pb.getNextPageToken());
    model.setRootUri(pb.getRootUri());

    return model;
  }

  public static class ListArtifactsResponseSerializer
      extends JsonSerializer<ListArtifactsResponse> {
    @Override
    public void serialize(
        ListArtifactsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListArtifactsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListArtifactsResponseDeserializer
      extends JsonDeserializer<ListArtifactsResponse> {
    @Override
    public ListArtifactsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListArtifactsResponsePb pb = mapper.readValue(p, ListArtifactsResponsePb.class);
      return ListArtifactsResponse.fromPb(pb);
    }
  }
}

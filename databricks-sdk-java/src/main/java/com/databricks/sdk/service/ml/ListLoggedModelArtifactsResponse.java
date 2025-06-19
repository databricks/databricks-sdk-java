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
@JsonSerialize(
    using = ListLoggedModelArtifactsResponse.ListLoggedModelArtifactsResponseSerializer.class)
@JsonDeserialize(
    using = ListLoggedModelArtifactsResponse.ListLoggedModelArtifactsResponseDeserializer.class)
public class ListLoggedModelArtifactsResponse {
  /** File location and metadata for artifacts. */
  private Collection<FileInfo> files;

  /** Token that can be used to retrieve the next page of artifact results */
  private String nextPageToken;

  /** Root artifact directory for the logged model. */
  private String rootUri;

  public ListLoggedModelArtifactsResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  public Collection<FileInfo> getFiles() {
    return files;
  }

  public ListLoggedModelArtifactsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListLoggedModelArtifactsResponse setRootUri(String rootUri) {
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
    ListLoggedModelArtifactsResponse that = (ListLoggedModelArtifactsResponse) o;
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
    return new ToStringer(ListLoggedModelArtifactsResponse.class)
        .add("files", files)
        .add("nextPageToken", nextPageToken)
        .add("rootUri", rootUri)
        .toString();
  }

  ListLoggedModelArtifactsResponsePb toPb() {
    ListLoggedModelArtifactsResponsePb pb = new ListLoggedModelArtifactsResponsePb();
    pb.setFiles(files);
    pb.setNextPageToken(nextPageToken);
    pb.setRootUri(rootUri);

    return pb;
  }

  static ListLoggedModelArtifactsResponse fromPb(ListLoggedModelArtifactsResponsePb pb) {
    ListLoggedModelArtifactsResponse model = new ListLoggedModelArtifactsResponse();
    model.setFiles(pb.getFiles());
    model.setNextPageToken(pb.getNextPageToken());
    model.setRootUri(pb.getRootUri());

    return model;
  }

  public static class ListLoggedModelArtifactsResponseSerializer
      extends JsonSerializer<ListLoggedModelArtifactsResponse> {
    @Override
    public void serialize(
        ListLoggedModelArtifactsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListLoggedModelArtifactsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListLoggedModelArtifactsResponseDeserializer
      extends JsonDeserializer<ListLoggedModelArtifactsResponse> {
    @Override
    public ListLoggedModelArtifactsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListLoggedModelArtifactsResponsePb pb =
          mapper.readValue(p, ListLoggedModelArtifactsResponsePb.class);
      return ListLoggedModelArtifactsResponse.fromPb(pb);
    }
  }
}

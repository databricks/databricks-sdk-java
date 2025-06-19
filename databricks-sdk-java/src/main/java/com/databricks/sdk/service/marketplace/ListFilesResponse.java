// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ListFilesResponse.ListFilesResponseSerializer.class)
@JsonDeserialize(using = ListFilesResponse.ListFilesResponseDeserializer.class)
public class ListFilesResponse {
  /** */
  private Collection<FileInfo> fileInfos;

  /** */
  private String nextPageToken;

  public ListFilesResponse setFileInfos(Collection<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
    return this;
  }

  public Collection<FileInfo> getFileInfos() {
    return fileInfos;
  }

  public ListFilesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFilesResponse that = (ListFilesResponse) o;
    return Objects.equals(fileInfos, that.fileInfos)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfos, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFilesResponse.class)
        .add("fileInfos", fileInfos)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListFilesResponsePb toPb() {
    ListFilesResponsePb pb = new ListFilesResponsePb();
    pb.setFileInfos(fileInfos);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListFilesResponse fromPb(ListFilesResponsePb pb) {
    ListFilesResponse model = new ListFilesResponse();
    model.setFileInfos(pb.getFileInfos());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListFilesResponseSerializer extends JsonSerializer<ListFilesResponse> {
    @Override
    public void serialize(ListFilesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFilesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFilesResponseDeserializer extends JsonDeserializer<ListFilesResponse> {
    @Override
    public ListFilesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFilesResponsePb pb = mapper.readValue(p, ListFilesResponsePb.class);
      return ListFilesResponse.fromPb(pb);
    }
  }
}

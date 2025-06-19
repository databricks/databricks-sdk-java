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
import java.util.Objects;

/** List files */
@Generated
@JsonSerialize(using = ListFilesRequest.ListFilesRequestSerializer.class)
@JsonDeserialize(using = ListFilesRequest.ListFilesRequestDeserializer.class)
public class ListFilesRequest {
  /** */
  private FileParent fileParent;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListFilesRequest setFileParent(FileParent fileParent) {
    this.fileParent = fileParent;
    return this;
  }

  public FileParent getFileParent() {
    return fileParent;
  }

  public ListFilesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListFilesRequest setPageToken(String pageToken) {
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
    ListFilesRequest that = (ListFilesRequest) o;
    return Objects.equals(fileParent, that.fileParent)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParent, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFilesRequest.class)
        .add("fileParent", fileParent)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListFilesRequestPb toPb() {
    ListFilesRequestPb pb = new ListFilesRequestPb();
    pb.setFileParent(fileParent);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListFilesRequest fromPb(ListFilesRequestPb pb) {
    ListFilesRequest model = new ListFilesRequest();
    model.setFileParent(pb.getFileParent());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListFilesRequestSerializer extends JsonSerializer<ListFilesRequest> {
    @Override
    public void serialize(ListFilesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFilesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFilesRequestDeserializer extends JsonDeserializer<ListFilesRequest> {
    @Override
    public ListFilesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFilesRequestPb pb = mapper.readValue(p, ListFilesRequestPb.class);
      return ListFilesRequest.fromPb(pb);
    }
  }
}

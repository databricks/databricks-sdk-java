// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** List contents */
@Generated
@JsonSerialize(using = ListWorkspaceRequest.ListWorkspaceRequestSerializer.class)
@JsonDeserialize(using = ListWorkspaceRequest.ListWorkspaceRequestDeserializer.class)
public class ListWorkspaceRequest {
  /** UTC timestamp in milliseconds */
  private Long notebooksModifiedAfter;

  /** The absolute path of the notebook or directory. */
  private String path;

  public ListWorkspaceRequest setNotebooksModifiedAfter(Long notebooksModifiedAfter) {
    this.notebooksModifiedAfter = notebooksModifiedAfter;
    return this;
  }

  public Long getNotebooksModifiedAfter() {
    return notebooksModifiedAfter;
  }

  public ListWorkspaceRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceRequest that = (ListWorkspaceRequest) o;
    return Objects.equals(notebooksModifiedAfter, that.notebooksModifiedAfter)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebooksModifiedAfter, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceRequest.class)
        .add("notebooksModifiedAfter", notebooksModifiedAfter)
        .add("path", path)
        .toString();
  }

  ListWorkspaceRequestPb toPb() {
    ListWorkspaceRequestPb pb = new ListWorkspaceRequestPb();
    pb.setNotebooksModifiedAfter(notebooksModifiedAfter);
    pb.setPath(path);

    return pb;
  }

  static ListWorkspaceRequest fromPb(ListWorkspaceRequestPb pb) {
    ListWorkspaceRequest model = new ListWorkspaceRequest();
    model.setNotebooksModifiedAfter(pb.getNotebooksModifiedAfter());
    model.setPath(pb.getPath());

    return model;
  }

  public static class ListWorkspaceRequestSerializer extends JsonSerializer<ListWorkspaceRequest> {
    @Override
    public void serialize(
        ListWorkspaceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListWorkspaceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListWorkspaceRequestDeserializer
      extends JsonDeserializer<ListWorkspaceRequest> {
    @Override
    public ListWorkspaceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListWorkspaceRequestPb pb = mapper.readValue(p, ListWorkspaceRequestPb.class);
      return ListWorkspaceRequest.fromPb(pb);
    }
  }
}

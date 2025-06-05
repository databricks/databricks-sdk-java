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

/** Delete a file */
@Generated
@JsonSerialize(using = DeleteFileRequest.DeleteFileRequestSerializer.class)
@JsonDeserialize(using = DeleteFileRequest.DeleteFileRequestDeserializer.class)
public class DeleteFileRequest {
  /** */
  private String fileId;

  public DeleteFileRequest setFileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  public String getFileId() {
    return fileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteFileRequest that = (DeleteFileRequest) o;
    return Objects.equals(fileId, that.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFileRequest.class).add("fileId", fileId).toString();
  }

  DeleteFileRequestPb toPb() {
    DeleteFileRequestPb pb = new DeleteFileRequestPb();
    pb.setFileId(fileId);

    return pb;
  }

  static DeleteFileRequest fromPb(DeleteFileRequestPb pb) {
    DeleteFileRequest model = new DeleteFileRequest();
    model.setFileId(pb.getFileId());

    return model;
  }

  public static class DeleteFileRequestSerializer extends JsonSerializer<DeleteFileRequest> {
    @Override
    public void serialize(DeleteFileRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteFileRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteFileRequestDeserializer extends JsonDeserializer<DeleteFileRequest> {
    @Override
    public DeleteFileRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteFileRequestPb pb = mapper.readValue(p, DeleteFileRequestPb.class);
      return DeleteFileRequest.fromPb(pb);
    }
  }
}

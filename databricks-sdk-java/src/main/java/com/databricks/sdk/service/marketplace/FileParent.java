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

@Generated
@JsonSerialize(using = FileParent.FileParentSerializer.class)
@JsonDeserialize(using = FileParent.FileParentDeserializer.class)
public class FileParent {
  /** */
  private FileParentType fileParentType;

  /** TODO make the following fields required */
  private String parentId;

  public FileParent setFileParentType(FileParentType fileParentType) {
    this.fileParentType = fileParentType;
    return this;
  }

  public FileParentType getFileParentType() {
    return fileParentType;
  }

  public FileParent setParentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  public String getParentId() {
    return parentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileParent that = (FileParent) o;
    return Objects.equals(fileParentType, that.fileParentType)
        && Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParentType, parentId);
  }

  @Override
  public String toString() {
    return new ToStringer(FileParent.class)
        .add("fileParentType", fileParentType)
        .add("parentId", parentId)
        .toString();
  }

  FileParentPb toPb() {
    FileParentPb pb = new FileParentPb();
    pb.setFileParentType(fileParentType);
    pb.setParentId(parentId);

    return pb;
  }

  static FileParent fromPb(FileParentPb pb) {
    FileParent model = new FileParent();
    model.setFileParentType(pb.getFileParentType());
    model.setParentId(pb.getParentId());

    return model;
  }

  public static class FileParentSerializer extends JsonSerializer<FileParent> {
    @Override
    public void serialize(FileParent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileParentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileParentDeserializer extends JsonDeserializer<FileParent> {
    @Override
    public FileParent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileParentPb pb = mapper.readValue(p, FileParentPb.class);
      return FileParent.fromPb(pb);
    }
  }
}

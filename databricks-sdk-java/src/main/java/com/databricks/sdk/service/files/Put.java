// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = Put.PutSerializer.class)
@JsonDeserialize(using = Put.PutDeserializer.class)
public class Put {
  /** This parameter might be absent, and instead a posted file will be used. */
  private String contents;

  /** The flag that specifies whether to overwrite existing file/files. */
  private Boolean overwrite;

  /** The path of the new file. The path should be the absolute DBFS path. */
  private String path;

  public Put setContents(String contents) {
    this.contents = contents;
    return this;
  }

  public String getContents() {
    return contents;
  }

  public Put setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public Put setPath(String path) {
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
    Put that = (Put) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(overwrite, that.overwrite)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(Put.class)
        .add("contents", contents)
        .add("overwrite", overwrite)
        .add("path", path)
        .toString();
  }

  PutPb toPb() {
    PutPb pb = new PutPb();
    pb.setContents(contents);
    pb.setOverwrite(overwrite);
    pb.setPath(path);

    return pb;
  }

  static Put fromPb(PutPb pb) {
    Put model = new Put();
    model.setContents(pb.getContents());
    model.setOverwrite(pb.getOverwrite());
    model.setPath(pb.getPath());

    return model;
  }

  public static class PutSerializer extends JsonSerializer<Put> {
    @Override
    public void serialize(Put value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutDeserializer extends JsonDeserializer<Put> {
    @Override
    public Put deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutPb pb = mapper.readValue(p, PutPb.class);
      return Put.fromPb(pb);
    }
  }
}

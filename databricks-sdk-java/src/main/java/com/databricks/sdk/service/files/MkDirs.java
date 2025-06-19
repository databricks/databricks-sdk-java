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
@JsonSerialize(using = MkDirs.MkDirsSerializer.class)
@JsonDeserialize(using = MkDirs.MkDirsDeserializer.class)
public class MkDirs {
  /** The path of the new directory. The path should be the absolute DBFS path. */
  private String path;

  public MkDirs setPath(String path) {
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
    MkDirs that = (MkDirs) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(MkDirs.class).add("path", path).toString();
  }

  MkDirsPb toPb() {
    MkDirsPb pb = new MkDirsPb();
    pb.setPath(path);

    return pb;
  }

  static MkDirs fromPb(MkDirsPb pb) {
    MkDirs model = new MkDirs();
    model.setPath(pb.getPath());

    return model;
  }

  public static class MkDirsSerializer extends JsonSerializer<MkDirs> {
    @Override
    public void serialize(MkDirs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MkDirsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MkDirsDeserializer extends JsonDeserializer<MkDirs> {
    @Override
    public MkDirs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MkDirsPb pb = mapper.readValue(p, MkDirsPb.class);
      return MkDirs.fromPb(pb);
    }
  }
}

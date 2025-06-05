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

@Generated
@JsonSerialize(using = Mkdirs.MkdirsSerializer.class)
@JsonDeserialize(using = Mkdirs.MkdirsDeserializer.class)
public class Mkdirs {
  /**
   * The absolute path of the directory. If the parent directories do not exist, it will also create
   * them. If the directory already exists, this command will do nothing and succeed.
   */
  private String path;

  public Mkdirs setPath(String path) {
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
    Mkdirs that = (Mkdirs) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    return new ToStringer(Mkdirs.class).add("path", path).toString();
  }

  MkdirsPb toPb() {
    MkdirsPb pb = new MkdirsPb();
    pb.setPath(path);

    return pb;
  }

  static Mkdirs fromPb(MkdirsPb pb) {
    Mkdirs model = new Mkdirs();
    model.setPath(pb.getPath());

    return model;
  }

  public static class MkdirsSerializer extends JsonSerializer<Mkdirs> {
    @Override
    public void serialize(Mkdirs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MkdirsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MkdirsDeserializer extends JsonDeserializer<Mkdirs> {
    @Override
    public Mkdirs deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MkdirsPb pb = mapper.readValue(p, MkdirsPb.class);
      return Mkdirs.fromPb(pb);
    }
  }
}

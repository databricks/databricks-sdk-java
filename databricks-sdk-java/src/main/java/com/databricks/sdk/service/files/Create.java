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
@JsonSerialize(using = Create.CreateSerializer.class)
@JsonDeserialize(using = Create.CreateDeserializer.class)
public class Create {
  /** The flag that specifies whether to overwrite existing file/files. */
  private Boolean overwrite;

  /** The path of the new file. The path should be the absolute DBFS path. */
  private String path;

  public Create setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public Create setPath(String path) {
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
    Create that = (Create) o;
    return Objects.equals(overwrite, that.overwrite) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(Create.class).add("overwrite", overwrite).add("path", path).toString();
  }

  CreatePb toPb() {
    CreatePb pb = new CreatePb();
    pb.setOverwrite(overwrite);
    pb.setPath(path);

    return pb;
  }

  static Create fromPb(CreatePb pb) {
    Create model = new Create();
    model.setOverwrite(pb.getOverwrite());
    model.setPath(pb.getPath());

    return model;
  }

  public static class CreateSerializer extends JsonSerializer<Create> {
    @Override
    public void serialize(Create value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDeserializer extends JsonDeserializer<Create> {
    @Override
    public Create deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePb pb = mapper.readValue(p, CreatePb.class);
      return Create.fromPb(pb);
    }
  }
}

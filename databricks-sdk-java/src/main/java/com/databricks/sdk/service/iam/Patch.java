// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = Patch.PatchSerializer.class)
@JsonDeserialize(using = Patch.PatchDeserializer.class)
public class Patch {
  /** Type of patch operation. */
  private PatchOp op;

  /** Selection of patch operation */
  private String path;

  /** Value to modify */
  private Object value;

  public Patch setOp(PatchOp op) {
    this.op = op;
    return this;
  }

  public PatchOp getOp() {
    return op;
  }

  public Patch setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Patch setValue(Object value) {
    this.value = value;
    return this;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Patch that = (Patch) o;
    return Objects.equals(op, that.op)
        && Objects.equals(path, that.path)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Patch.class)
        .add("op", op)
        .add("path", path)
        .add("value", value)
        .toString();
  }

  PatchPb toPb() {
    PatchPb pb = new PatchPb();
    pb.setOp(op);
    pb.setPath(path);
    pb.setValue(value);

    return pb;
  }

  static Patch fromPb(PatchPb pb) {
    Patch model = new Patch();
    model.setOp(pb.getOp());
    model.setPath(pb.getPath());
    model.setValue(pb.getValue());

    return model;
  }

  public static class PatchSerializer extends JsonSerializer<Patch> {
    @Override
    public void serialize(Patch value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchDeserializer extends JsonDeserializer<Patch> {
    @Override
    public Patch deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchPb pb = mapper.readValue(p, PatchPb.class);
      return Patch.fromPb(pb);
    }
  }
}

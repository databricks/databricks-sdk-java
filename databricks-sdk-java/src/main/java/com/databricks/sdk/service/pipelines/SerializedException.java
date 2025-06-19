// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = SerializedException.SerializedExceptionSerializer.class)
@JsonDeserialize(using = SerializedException.SerializedExceptionDeserializer.class)
public class SerializedException {
  /** Runtime class of the exception */
  private String className;

  /** Exception message */
  private String message;

  /** Stack trace consisting of a list of stack frames */
  private Collection<StackFrame> stack;

  public SerializedException setClassName(String className) {
    this.className = className;
    return this;
  }

  public String getClassName() {
    return className;
  }

  public SerializedException setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public SerializedException setStack(Collection<StackFrame> stack) {
    this.stack = stack;
    return this;
  }

  public Collection<StackFrame> getStack() {
    return stack;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SerializedException that = (SerializedException) o;
    return Objects.equals(className, that.className)
        && Objects.equals(message, that.message)
        && Objects.equals(stack, that.stack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, message, stack);
  }

  @Override
  public String toString() {
    return new ToStringer(SerializedException.class)
        .add("className", className)
        .add("message", message)
        .add("stack", stack)
        .toString();
  }

  SerializedExceptionPb toPb() {
    SerializedExceptionPb pb = new SerializedExceptionPb();
    pb.setClassName(className);
    pb.setMessage(message);
    pb.setStack(stack);

    return pb;
  }

  static SerializedException fromPb(SerializedExceptionPb pb) {
    SerializedException model = new SerializedException();
    model.setClassName(pb.getClassName());
    model.setMessage(pb.getMessage());
    model.setStack(pb.getStack());

    return model;
  }

  public static class SerializedExceptionSerializer extends JsonSerializer<SerializedException> {
    @Override
    public void serialize(SerializedException value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SerializedExceptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SerializedExceptionDeserializer
      extends JsonDeserializer<SerializedException> {
    @Override
    public SerializedException deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SerializedExceptionPb pb = mapper.readValue(p, SerializedExceptionPb.class);
      return SerializedException.fromPb(pb);
    }
  }
}

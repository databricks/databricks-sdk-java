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
import java.util.Objects;

@Generated
@JsonSerialize(using = StackFrame.StackFrameSerializer.class)
@JsonDeserialize(using = StackFrame.StackFrameDeserializer.class)
public class StackFrame {
  /** Class from which the method call originated */
  private String declaringClass;

  /** File where the method is defined */
  private String fileName;

  /** Line from which the method was called */
  private Long lineNumber;

  /** Name of the method which was called */
  private String methodName;

  public StackFrame setDeclaringClass(String declaringClass) {
    this.declaringClass = declaringClass;
    return this;
  }

  public String getDeclaringClass() {
    return declaringClass;
  }

  public StackFrame setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public StackFrame setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  public Long getLineNumber() {
    return lineNumber;
  }

  public StackFrame setMethodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  public String getMethodName() {
    return methodName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StackFrame that = (StackFrame) o;
    return Objects.equals(declaringClass, that.declaringClass)
        && Objects.equals(fileName, that.fileName)
        && Objects.equals(lineNumber, that.lineNumber)
        && Objects.equals(methodName, that.methodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declaringClass, fileName, lineNumber, methodName);
  }

  @Override
  public String toString() {
    return new ToStringer(StackFrame.class)
        .add("declaringClass", declaringClass)
        .add("fileName", fileName)
        .add("lineNumber", lineNumber)
        .add("methodName", methodName)
        .toString();
  }

  StackFramePb toPb() {
    StackFramePb pb = new StackFramePb();
    pb.setDeclaringClass(declaringClass);
    pb.setFileName(fileName);
    pb.setLineNumber(lineNumber);
    pb.setMethodName(methodName);

    return pb;
  }

  static StackFrame fromPb(StackFramePb pb) {
    StackFrame model = new StackFrame();
    model.setDeclaringClass(pb.getDeclaringClass());
    model.setFileName(pb.getFileName());
    model.setLineNumber(pb.getLineNumber());
    model.setMethodName(pb.getMethodName());

    return model;
  }

  public static class StackFrameSerializer extends JsonSerializer<StackFrame> {
    @Override
    public void serialize(StackFrame value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StackFramePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StackFrameDeserializer extends JsonDeserializer<StackFrame> {
    @Override
    public StackFrame deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StackFramePb pb = mapper.readValue(p, StackFramePb.class);
      return StackFrame.fromPb(pb);
    }
  }
}

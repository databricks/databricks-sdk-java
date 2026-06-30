// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SerializedException {
  /** Runtime class of the exception */
  @JsonProperty("class_name")
  private String className;

  /** Exception message */
  @JsonProperty("message")
  private String message;

  /** Stack trace consisting of a list of stack frames */
  @JsonProperty("stack")
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
}

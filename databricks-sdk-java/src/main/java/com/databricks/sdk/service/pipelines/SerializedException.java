// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SerializedException class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>className</code>.</p>
   *
   * @param className a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.SerializedException} object
   */
  public SerializedException setClassName(String className) {
    this.className = className;
    return this;
  }

  /**
   * <p>Getter for the field <code>className</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClassName() {
    return className;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.SerializedException} object
   */
  public SerializedException setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * <p>Setter for the field <code>stack</code>.</p>
   *
   * @param stack a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.SerializedException} object
   */
  public SerializedException setStack(Collection<StackFrame> stack) {
    this.stack = stack;
    return this;
  }

  /**
   * <p>Getter for the field <code>stack</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<StackFrame> getStack() {
    return stack;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SerializedException that = (SerializedException) o;
    return Objects.equals(className, that.className)
        && Objects.equals(message, that.message)
        && Objects.equals(stack, that.stack);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(className, message, stack);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SerializedException.class)
        .add("className", className)
        .add("message", message)
        .add("stack", stack)
        .toString();
  }
}

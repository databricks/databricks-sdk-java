// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>StackFrame class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StackFrame {
  /** Class from which the method call originated */
  @JsonProperty("declaring_class")
  private String declaringClass;

  /** File where the method is defined */
  @JsonProperty("file_name")
  private String fileName;

  /** Line from which the method was called */
  @JsonProperty("line_number")
  private Long lineNumber;

  /** Name of the method which was called */
  @JsonProperty("method_name")
  private String methodName;

  /**
   * <p>Setter for the field <code>declaringClass</code>.</p>
   *
   * @param declaringClass a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StackFrame} object
   */
  public StackFrame setDeclaringClass(String declaringClass) {
    this.declaringClass = declaringClass;
    return this;
  }

  /**
   * <p>Getter for the field <code>declaringClass</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeclaringClass() {
    return declaringClass;
  }

  /**
   * <p>Setter for the field <code>fileName</code>.</p>
   *
   * @param fileName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StackFrame} object
   */
  public StackFrame setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fileName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * <p>Setter for the field <code>lineNumber</code>.</p>
   *
   * @param lineNumber a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.StackFrame} object
   */
  public StackFrame setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * <p>Getter for the field <code>lineNumber</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLineNumber() {
    return lineNumber;
  }

  /**
   * <p>Setter for the field <code>methodName</code>.</p>
   *
   * @param methodName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StackFrame} object
   */
  public StackFrame setMethodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * <p>Getter for the field <code>methodName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMethodName() {
    return methodName;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(declaringClass, fileName, lineNumber, methodName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StackFrame.class)
        .add("declaringClass", declaringClass)
        .add("fileName", fileName)
        .add("lineNumber", lineNumber)
        .add("methodName", methodName)
        .toString();
  }
}

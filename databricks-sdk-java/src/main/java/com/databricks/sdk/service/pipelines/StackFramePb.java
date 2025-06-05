// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class StackFramePb {
  @JsonProperty("declaring_class")
  private String declaringClass;

  @JsonProperty("file_name")
  private String fileName;

  @JsonProperty("line_number")
  private Long lineNumber;

  @JsonProperty("method_name")
  private String methodName;

  public StackFramePb setDeclaringClass(String declaringClass) {
    this.declaringClass = declaringClass;
    return this;
  }

  public String getDeclaringClass() {
    return declaringClass;
  }

  public StackFramePb setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public StackFramePb setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  public Long getLineNumber() {
    return lineNumber;
  }

  public StackFramePb setMethodName(String methodName) {
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
    StackFramePb that = (StackFramePb) o;
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
    return new ToStringer(StackFramePb.class)
        .add("declaringClass", declaringClass)
        .add("fileName", fileName)
        .add("lineNumber", lineNumber)
        .add("methodName", methodName)
        .toString();
  }
}

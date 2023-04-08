// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}

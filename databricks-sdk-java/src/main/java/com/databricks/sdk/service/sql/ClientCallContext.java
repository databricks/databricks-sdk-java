// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Client code that triggered the request */
@Generated
public class ClientCallContext {
  /** File name that contains the last line that triggered the request. */
  @JsonProperty("file_name")
  private EncodedText fileName;

  /** Last line number within a file or notebook cell that triggered the request. */
  @JsonProperty("line_number")
  private Long lineNumber;

  public ClientCallContext setFileName(EncodedText fileName) {
    this.fileName = fileName;
    return this;
  }

  public EncodedText getFileName() {
    return fileName;
  }

  public ClientCallContext setLineNumber(Long lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  public Long getLineNumber() {
    return lineNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientCallContext that = (ClientCallContext) o;
    return Objects.equals(fileName, that.fileName) && Objects.equals(lineNumber, that.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, lineNumber);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientCallContext.class)
        .add("fileName", fileName)
        .add("lineNumber", lineNumber)
        .toString();
  }
}

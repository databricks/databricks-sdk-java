// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EncodedText {
  /** Carry text data in different form. */
  @JsonProperty("encoding")
  private EncodedTextEncoding encoding;

  /** text data */
  @JsonProperty("text")
  private String text;

  public EncodedText setEncoding(EncodedTextEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

  public EncodedTextEncoding getEncoding() {
    return encoding;
  }

  public EncodedText setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EncodedText that = (EncodedText) o;
    return Objects.equals(encoding, that.encoding) && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, text);
  }

  @Override
  public String toString() {
    return new ToStringer(EncodedText.class).add("encoding", encoding).add("text", text).toString();
  }
}

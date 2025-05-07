// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * copied from proto3 / Google Well Known Types, source:
 * https://github.com/protocolbuffers/protobuf/blob/450d24ca820750c5db5112a6f0b0c2efb9758021/src/google/protobuf/struct.proto
 * `Struct` represents a structured data value, consisting of fields which map to dynamically typed
 * values. In some languages, `Struct` might be supported by a native representation. For example,
 * in scripting languages like JS a struct is represented as an object. The details of that
 * representation are described together with the proto support for the language.
 *
 * <p>The JSON representation for `Struct` is JSON object.
 */
@Generated
public class Struct {
  /** Data entry, corresponding to a row in a vector index. */
  @JsonProperty("fields")
  private Collection<MapStringValueEntry> fields;

  public Struct setFields(Collection<MapStringValueEntry> fields) {
    this.fields = fields;
    return this;
  }

  public Collection<MapStringValueEntry> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Struct that = (Struct) o;
    return Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    return new ToStringer(Struct.class).add("fields", fields).toString();
  }
}

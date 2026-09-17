// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ConfluentSchemaRegistryOptions {
  /** Required: subject name to resolve in the registry. */
  @JsonProperty("subject")
  private String subject;

  public ConfluentSchemaRegistryOptions setSubject(String subject) {
    this.subject = subject;
    return this;
  }

  public String getSubject() {
    return subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConfluentSchemaRegistryOptions that = (ConfluentSchemaRegistryOptions) o;
    return Objects.equals(subject, that.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }

  @Override
  public String toString() {
    return new ToStringer(ConfluentSchemaRegistryOptions.class).add("subject", subject).toString();
  }
}

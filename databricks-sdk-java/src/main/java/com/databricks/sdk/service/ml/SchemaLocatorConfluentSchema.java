// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Confluent Schema Registry schema locator. The value to provide for `subject` depends on the
 * naming strategy configured in your registry: - TopicNameStrategy (default): "{topic}-key" or
 * "{topic}-value" e.g. for topic "transactions" use "transactions-value" for the payload and
 * "transactions-key" for the key. - RecordNameStrategy: the fully-qualified record name e.g.
 * "com.example.Payment" for Avro, the bare message name (without package) for Protobuf, or the
 * `title` field value for JSON. - TopicRecordNameStrategy: "{topic}-{fully-qualified-record-name}"
 * e.g. "transactions-com.example.Payment".
 */
@Generated
public class SchemaLocatorConfluentSchema {
  /** The Confluent schema registry subject name. */
  @JsonProperty("subject")
  private String subject;

  public SchemaLocatorConfluentSchema setSubject(String subject) {
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
    SchemaLocatorConfluentSchema that = (SchemaLocatorConfluentSchema) o;
    return Objects.equals(subject, that.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaLocatorConfluentSchema.class).add("subject", subject).toString();
  }
}

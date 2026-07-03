// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A Protocol Buffer schema paired with the name of the message within it that describes the Kafka
 * payload. A .proto file may declare multiple messages; message_name disambiguates.
 */
@Generated
public class ProtoSchemaSpec {
  /**
   * The fully-qualified name of the message within schema_text that describes the Kafka payload
   * (e.g. "Event" or "com.example.Event" if schema_text declares a package). Identifies which
   * message is used to decode each Kafka record — a .proto file may declare multiple messages but
   * only one represents the payload. Must not be empty.
   */
  @JsonProperty("message_name")
  private String messageName;

  /**
   * The raw .proto file text (proto2 and proto3 syntax supported, see
   * https://protobuf.dev/programming-guides/proto3/ and
   * https://protobuf.dev/programming-guides/proto2/).
   */
  @JsonProperty("schema_text")
  private String schemaText;

  public ProtoSchemaSpec setMessageName(String messageName) {
    this.messageName = messageName;
    return this;
  }

  public String getMessageName() {
    return messageName;
  }

  public ProtoSchemaSpec setSchemaText(String schemaText) {
    this.schemaText = schemaText;
    return this;
  }

  public String getSchemaText() {
    return schemaText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProtoSchemaSpec that = (ProtoSchemaSpec) o;
    return Objects.equals(messageName, that.messageName)
        && Objects.equals(schemaText, that.schemaText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageName, schemaText);
  }

  @Override
  public String toString() {
    return new ToStringer(ProtoSchemaSpec.class)
        .add("messageName", messageName)
        .add("schemaText", schemaText)
        .toString();
  }
}

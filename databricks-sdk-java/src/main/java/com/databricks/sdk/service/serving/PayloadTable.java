// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = PayloadTable.PayloadTableSerializer.class)
@JsonDeserialize(using = PayloadTable.PayloadTableDeserializer.class)
public class PayloadTable {
  /** */
  private String name;

  /** */
  private String status;

  /** */
  private String statusMessage;

  public PayloadTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PayloadTable setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public PayloadTable setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PayloadTable that = (PayloadTable) o;
    return Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, statusMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(PayloadTable.class)
        .add("name", name)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .toString();
  }

  PayloadTablePb toPb() {
    PayloadTablePb pb = new PayloadTablePb();
    pb.setName(name);
    pb.setStatus(status);
    pb.setStatusMessage(statusMessage);

    return pb;
  }

  static PayloadTable fromPb(PayloadTablePb pb) {
    PayloadTable model = new PayloadTable();
    model.setName(pb.getName());
    model.setStatus(pb.getStatus());
    model.setStatusMessage(pb.getStatusMessage());

    return model;
  }

  public static class PayloadTableSerializer extends JsonSerializer<PayloadTable> {
    @Override
    public void serialize(PayloadTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PayloadTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PayloadTableDeserializer extends JsonDeserializer<PayloadTable> {
    @Override
    public PayloadTable deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PayloadTablePb pb = mapper.readValue(p, PayloadTablePb.class);
      return PayloadTable.fromPb(pb);
    }
  }
}

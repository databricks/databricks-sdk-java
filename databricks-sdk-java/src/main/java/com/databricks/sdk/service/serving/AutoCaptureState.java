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
@JsonSerialize(using = AutoCaptureState.AutoCaptureStateSerializer.class)
@JsonDeserialize(using = AutoCaptureState.AutoCaptureStateDeserializer.class)
public class AutoCaptureState {
  /** */
  private PayloadTable payloadTable;

  public AutoCaptureState setPayloadTable(PayloadTable payloadTable) {
    this.payloadTable = payloadTable;
    return this;
  }

  public PayloadTable getPayloadTable() {
    return payloadTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoCaptureState that = (AutoCaptureState) o;
    return Objects.equals(payloadTable, that.payloadTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadTable);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoCaptureState.class).add("payloadTable", payloadTable).toString();
  }

  AutoCaptureStatePb toPb() {
    AutoCaptureStatePb pb = new AutoCaptureStatePb();
    pb.setPayloadTable(payloadTable);

    return pb;
  }

  static AutoCaptureState fromPb(AutoCaptureStatePb pb) {
    AutoCaptureState model = new AutoCaptureState();
    model.setPayloadTable(pb.getPayloadTable());

    return model;
  }

  public static class AutoCaptureStateSerializer extends JsonSerializer<AutoCaptureState> {
    @Override
    public void serialize(AutoCaptureState value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AutoCaptureStatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AutoCaptureStateDeserializer extends JsonDeserializer<AutoCaptureState> {
    @Override
    public AutoCaptureState deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AutoCaptureStatePb pb = mapper.readValue(p, AutoCaptureStatePb.class);
      return AutoCaptureState.fromPb(pb);
    }
  }
}

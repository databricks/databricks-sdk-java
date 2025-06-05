// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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
@JsonSerialize(using = NetworkWarning.NetworkWarningSerializer.class)
@JsonDeserialize(using = NetworkWarning.NetworkWarningDeserializer.class)
public class NetworkWarning {
  /** Details of the warning. */
  private String warningMessage;

  /** The AWS resource associated with this warning: a subnet or a security group. */
  private WarningType warningType;

  public NetworkWarning setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  public String getWarningMessage() {
    return warningMessage;
  }

  public NetworkWarning setWarningType(WarningType warningType) {
    this.warningType = warningType;
    return this;
  }

  public WarningType getWarningType() {
    return warningType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkWarning that = (NetworkWarning) o;
    return Objects.equals(warningMessage, that.warningMessage)
        && Objects.equals(warningType, that.warningType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningMessage, warningType);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkWarning.class)
        .add("warningMessage", warningMessage)
        .add("warningType", warningType)
        .toString();
  }

  NetworkWarningPb toPb() {
    NetworkWarningPb pb = new NetworkWarningPb();
    pb.setWarningMessage(warningMessage);
    pb.setWarningType(warningType);

    return pb;
  }

  static NetworkWarning fromPb(NetworkWarningPb pb) {
    NetworkWarning model = new NetworkWarning();
    model.setWarningMessage(pb.getWarningMessage());
    model.setWarningType(pb.getWarningType());

    return model;
  }

  public static class NetworkWarningSerializer extends JsonSerializer<NetworkWarning> {
    @Override
    public void serialize(NetworkWarning value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NetworkWarningPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NetworkWarningDeserializer extends JsonDeserializer<NetworkWarning> {
    @Override
    public NetworkWarning deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NetworkWarningPb pb = mapper.readValue(p, NetworkWarningPb.class);
      return NetworkWarning.fromPb(pb);
    }
  }
}

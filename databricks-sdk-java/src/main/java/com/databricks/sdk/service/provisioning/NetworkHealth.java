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
@JsonSerialize(using = NetworkHealth.NetworkHealthSerializer.class)
@JsonDeserialize(using = NetworkHealth.NetworkHealthDeserializer.class)
public class NetworkHealth {
  /** Details of the error. */
  private String errorMessage;

  /**
   * The AWS resource associated with this error: credentials, VPC, subnet, security group, or
   * network ACL.
   */
  private ErrorType errorType;

  public NetworkHealth setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public NetworkHealth setErrorType(ErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

  public ErrorType getErrorType() {
    return errorType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkHealth that = (NetworkHealth) o;
    return Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(errorType, that.errorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorType);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkHealth.class)
        .add("errorMessage", errorMessage)
        .add("errorType", errorType)
        .toString();
  }

  NetworkHealthPb toPb() {
    NetworkHealthPb pb = new NetworkHealthPb();
    pb.setErrorMessage(errorMessage);
    pb.setErrorType(errorType);

    return pb;
  }

  static NetworkHealth fromPb(NetworkHealthPb pb) {
    NetworkHealth model = new NetworkHealth();
    model.setErrorMessage(pb.getErrorMessage());
    model.setErrorType(pb.getErrorType());

    return model;
  }

  public static class NetworkHealthSerializer extends JsonSerializer<NetworkHealth> {
    @Override
    public void serialize(NetworkHealth value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NetworkHealthPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NetworkHealthDeserializer extends JsonDeserializer<NetworkHealth> {
    @Override
    public NetworkHealth deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NetworkHealthPb pb = mapper.readValue(p, NetworkHealthPb.class);
      return NetworkHealth.fromPb(pb);
    }
  }
}

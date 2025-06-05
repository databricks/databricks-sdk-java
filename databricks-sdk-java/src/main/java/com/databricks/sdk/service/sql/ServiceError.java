// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = ServiceError.ServiceErrorSerializer.class)
@JsonDeserialize(using = ServiceError.ServiceErrorDeserializer.class)
public class ServiceError {
  /** */
  private ServiceErrorCode errorCode;

  /** A brief summary of the error condition. */
  private String message;

  public ServiceError setErrorCode(ServiceErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ServiceErrorCode getErrorCode() {
    return errorCode;
  }

  public ServiceError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServiceError that = (ServiceError) o;
    return Objects.equals(errorCode, that.errorCode) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    return new ToStringer(ServiceError.class)
        .add("errorCode", errorCode)
        .add("message", message)
        .toString();
  }

  ServiceErrorPb toPb() {
    ServiceErrorPb pb = new ServiceErrorPb();
    pb.setErrorCode(errorCode);
    pb.setMessage(message);

    return pb;
  }

  static ServiceError fromPb(ServiceErrorPb pb) {
    ServiceError model = new ServiceError();
    model.setErrorCode(pb.getErrorCode());
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class ServiceErrorSerializer extends JsonSerializer<ServiceError> {
    @Override
    public void serialize(ServiceError value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServiceErrorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServiceErrorDeserializer extends JsonDeserializer<ServiceError> {
    @Override
    public ServiceError deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServiceErrorPb pb = mapper.readValue(p, ServiceErrorPb.class);
      return ServiceError.fromPb(pb);
    }
  }
}

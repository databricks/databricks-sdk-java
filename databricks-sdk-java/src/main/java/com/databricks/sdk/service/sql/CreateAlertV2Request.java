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

/** Create an alert */
@Generated
@JsonSerialize(using = CreateAlertV2Request.CreateAlertV2RequestSerializer.class)
@JsonDeserialize(using = CreateAlertV2Request.CreateAlertV2RequestDeserializer.class)
public class CreateAlertV2Request {
  /** */
  private AlertV2 alert;

  public CreateAlertV2Request setAlert(AlertV2 alert) {
    this.alert = alert;
    return this;
  }

  public AlertV2 getAlert() {
    return alert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertV2Request that = (CreateAlertV2Request) o;
    return Objects.equals(alert, that.alert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertV2Request.class).add("alert", alert).toString();
  }

  CreateAlertV2RequestPb toPb() {
    CreateAlertV2RequestPb pb = new CreateAlertV2RequestPb();
    pb.setAlert(alert);

    return pb;
  }

  static CreateAlertV2Request fromPb(CreateAlertV2RequestPb pb) {
    CreateAlertV2Request model = new CreateAlertV2Request();
    model.setAlert(pb.getAlert());

    return model;
  }

  public static class CreateAlertV2RequestSerializer extends JsonSerializer<CreateAlertV2Request> {
    @Override
    public void serialize(
        CreateAlertV2Request value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAlertV2RequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAlertV2RequestDeserializer
      extends JsonDeserializer<CreateAlertV2Request> {
    @Override
    public CreateAlertV2Request deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAlertV2RequestPb pb = mapper.readValue(p, CreateAlertV2RequestPb.class);
      return CreateAlertV2Request.fromPb(pb);
    }
  }
}

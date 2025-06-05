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
@JsonSerialize(using = CreateAlertRequest.CreateAlertRequestSerializer.class)
@JsonDeserialize(using = CreateAlertRequest.CreateAlertRequestDeserializer.class)
public class CreateAlertRequest {
  /** */
  private CreateAlertRequestAlert alert;

  /**
   * If true, automatically resolve alert display name conflicts. Otherwise, fail the request if the
   * alert's display name conflicts with an existing alert's display name.
   */
  private Boolean autoResolveDisplayName;

  public CreateAlertRequest setAlert(CreateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public CreateAlertRequestAlert getAlert() {
    return alert;
  }

  public CreateAlertRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertRequest that = (CreateAlertRequest) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, autoResolveDisplayName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertRequest.class)
        .add("alert", alert)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .toString();
  }

  CreateAlertRequestPb toPb() {
    CreateAlertRequestPb pb = new CreateAlertRequestPb();
    pb.setAlert(alert);
    pb.setAutoResolveDisplayName(autoResolveDisplayName);

    return pb;
  }

  static CreateAlertRequest fromPb(CreateAlertRequestPb pb) {
    CreateAlertRequest model = new CreateAlertRequest();
    model.setAlert(pb.getAlert());
    model.setAutoResolveDisplayName(pb.getAutoResolveDisplayName());

    return model;
  }

  public static class CreateAlertRequestSerializer extends JsonSerializer<CreateAlertRequest> {
    @Override
    public void serialize(CreateAlertRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAlertRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAlertRequestDeserializer extends JsonDeserializer<CreateAlertRequest> {
    @Override
    public CreateAlertRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAlertRequestPb pb = mapper.readValue(p, CreateAlertRequestPb.class);
      return CreateAlertRequest.fromPb(pb);
    }
  }
}

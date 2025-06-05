// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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

/** Update an app */
@Generated
@JsonSerialize(using = UpdateAppRequest.UpdateAppRequestSerializer.class)
@JsonDeserialize(using = UpdateAppRequest.UpdateAppRequestDeserializer.class)
public class UpdateAppRequest {
  /** */
  private App app;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens.
   * It must be unique within the workspace.
   */
  private String name;

  public UpdateAppRequest setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public UpdateAppRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAppRequest that = (UpdateAppRequest) o;
    return Objects.equals(app, that.app) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAppRequest.class).add("app", app).add("name", name).toString();
  }

  UpdateAppRequestPb toPb() {
    UpdateAppRequestPb pb = new UpdateAppRequestPb();
    pb.setApp(app);
    pb.setName(name);

    return pb;
  }

  static UpdateAppRequest fromPb(UpdateAppRequestPb pb) {
    UpdateAppRequest model = new UpdateAppRequest();
    model.setApp(pb.getApp());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateAppRequestSerializer extends JsonSerializer<UpdateAppRequest> {
    @Override
    public void serialize(UpdateAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateAppRequestDeserializer extends JsonDeserializer<UpdateAppRequest> {
    @Override
    public UpdateAppRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateAppRequestPb pb = mapper.readValue(p, UpdateAppRequestPb.class);
      return UpdateAppRequest.fromPb(pb);
    }
  }
}

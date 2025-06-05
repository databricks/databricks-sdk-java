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

/** Create an app */
@Generated
@JsonSerialize(using = CreateAppRequest.CreateAppRequestSerializer.class)
@JsonDeserialize(using = CreateAppRequest.CreateAppRequestDeserializer.class)
public class CreateAppRequest {
  /** */
  private App app;

  /** If true, the app will not be started after creation. */
  private Boolean noCompute;

  public CreateAppRequest setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public CreateAppRequest setNoCompute(Boolean noCompute) {
    this.noCompute = noCompute;
    return this;
  }

  public Boolean getNoCompute() {
    return noCompute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAppRequest that = (CreateAppRequest) o;
    return Objects.equals(app, that.app) && Objects.equals(noCompute, that.noCompute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, noCompute);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppRequest.class)
        .add("app", app)
        .add("noCompute", noCompute)
        .toString();
  }

  CreateAppRequestPb toPb() {
    CreateAppRequestPb pb = new CreateAppRequestPb();
    pb.setApp(app);
    pb.setNoCompute(noCompute);

    return pb;
  }

  static CreateAppRequest fromPb(CreateAppRequestPb pb) {
    CreateAppRequest model = new CreateAppRequest();
    model.setApp(pb.getApp());
    model.setNoCompute(pb.getNoCompute());

    return model;
  }

  public static class CreateAppRequestSerializer extends JsonSerializer<CreateAppRequest> {
    @Override
    public void serialize(CreateAppRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAppRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAppRequestDeserializer extends JsonDeserializer<CreateAppRequest> {
    @Override
    public CreateAppRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAppRequestPb pb = mapper.readValue(p, CreateAppRequestPb.class);
      return CreateAppRequest.fromPb(pb);
    }
  }
}

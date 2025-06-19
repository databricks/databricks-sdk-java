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

@Generated
@JsonSerialize(using = AppResource.AppResourceSerializer.class)
@JsonDeserialize(using = AppResource.AppResourceDeserializer.class)
public class AppResource {
  /** Description of the App Resource. */
  private String description;

  /** */
  private AppResourceJob job;

  /** Name of the App Resource. */
  private String name;

  /** */
  private AppResourceSecret secret;

  /** */
  private AppResourceServingEndpoint servingEndpoint;

  /** */
  private AppResourceSqlWarehouse sqlWarehouse;

  /** */
  private AppResourceUcSecurable ucSecurable;

  public AppResource setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppResource setJob(AppResourceJob job) {
    this.job = job;
    return this;
  }

  public AppResourceJob getJob() {
    return job;
  }

  public AppResource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResource setSecret(AppResourceSecret secret) {
    this.secret = secret;
    return this;
  }

  public AppResourceSecret getSecret() {
    return secret;
  }

  public AppResource setServingEndpoint(AppResourceServingEndpoint servingEndpoint) {
    this.servingEndpoint = servingEndpoint;
    return this;
  }

  public AppResourceServingEndpoint getServingEndpoint() {
    return servingEndpoint;
  }

  public AppResource setSqlWarehouse(AppResourceSqlWarehouse sqlWarehouse) {
    this.sqlWarehouse = sqlWarehouse;
    return this;
  }

  public AppResourceSqlWarehouse getSqlWarehouse() {
    return sqlWarehouse;
  }

  public AppResource setUcSecurable(AppResourceUcSecurable ucSecurable) {
    this.ucSecurable = ucSecurable;
    return this;
  }

  public AppResourceUcSecurable getUcSecurable() {
    return ucSecurable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResource that = (AppResource) o;
    return Objects.equals(description, that.description)
        && Objects.equals(job, that.job)
        && Objects.equals(name, that.name)
        && Objects.equals(secret, that.secret)
        && Objects.equals(servingEndpoint, that.servingEndpoint)
        && Objects.equals(sqlWarehouse, that.sqlWarehouse)
        && Objects.equals(ucSecurable, that.ucSecurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, job, name, secret, servingEndpoint, sqlWarehouse, ucSecurable);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResource.class)
        .add("description", description)
        .add("job", job)
        .add("name", name)
        .add("secret", secret)
        .add("servingEndpoint", servingEndpoint)
        .add("sqlWarehouse", sqlWarehouse)
        .add("ucSecurable", ucSecurable)
        .toString();
  }

  AppResourcePb toPb() {
    AppResourcePb pb = new AppResourcePb();
    pb.setDescription(description);
    pb.setJob(job);
    pb.setName(name);
    pb.setSecret(secret);
    pb.setServingEndpoint(servingEndpoint);
    pb.setSqlWarehouse(sqlWarehouse);
    pb.setUcSecurable(ucSecurable);

    return pb;
  }

  static AppResource fromPb(AppResourcePb pb) {
    AppResource model = new AppResource();
    model.setDescription(pb.getDescription());
    model.setJob(pb.getJob());
    model.setName(pb.getName());
    model.setSecret(pb.getSecret());
    model.setServingEndpoint(pb.getServingEndpoint());
    model.setSqlWarehouse(pb.getSqlWarehouse());
    model.setUcSecurable(pb.getUcSecurable());

    return model;
  }

  public static class AppResourceSerializer extends JsonSerializer<AppResource> {
    @Override
    public void serialize(AppResource value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppResourcePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppResourceDeserializer extends JsonDeserializer<AppResource> {
    @Override
    public AppResource deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppResourcePb pb = mapper.readValue(p, AppResourcePb.class);
      return AppResource.fromPb(pb);
    }
  }
}

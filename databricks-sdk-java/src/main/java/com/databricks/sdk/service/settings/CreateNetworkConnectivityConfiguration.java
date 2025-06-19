// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Properties of the new network connectivity configuration. */
@Generated
@JsonSerialize(
    using =
        CreateNetworkConnectivityConfiguration.CreateNetworkConnectivityConfigurationSerializer
            .class)
@JsonDeserialize(
    using =
        CreateNetworkConnectivityConfiguration.CreateNetworkConnectivityConfigurationDeserializer
            .class)
public class CreateNetworkConnectivityConfiguration {
  /**
   * The name of the network connectivity configuration. The name can contain alphanumeric
   * characters, hyphens, and underscores. The length must be between 3 and 30 characters. The name
   * must match the regular expression ^[0-9a-zA-Z-_]{3,30}$
   */
  private String name;

  /**
   * The region for the network connectivity configuration. Only workspaces in the same region can
   * be attached to the network connectivity configuration.
   */
  private String region;

  public CreateNetworkConnectivityConfiguration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateNetworkConnectivityConfiguration setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkConnectivityConfiguration that = (CreateNetworkConnectivityConfiguration) o;
    return Objects.equals(name, that.name) && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfiguration.class)
        .add("name", name)
        .add("region", region)
        .toString();
  }

  CreateNetworkConnectivityConfigurationPb toPb() {
    CreateNetworkConnectivityConfigurationPb pb = new CreateNetworkConnectivityConfigurationPb();
    pb.setName(name);
    pb.setRegion(region);

    return pb;
  }

  static CreateNetworkConnectivityConfiguration fromPb(
      CreateNetworkConnectivityConfigurationPb pb) {
    CreateNetworkConnectivityConfiguration model = new CreateNetworkConnectivityConfiguration();
    model.setName(pb.getName());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class CreateNetworkConnectivityConfigurationSerializer
      extends JsonSerializer<CreateNetworkConnectivityConfiguration> {
    @Override
    public void serialize(
        CreateNetworkConnectivityConfiguration value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateNetworkConnectivityConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateNetworkConnectivityConfigurationDeserializer
      extends JsonDeserializer<CreateNetworkConnectivityConfiguration> {
    @Override
    public CreateNetworkConnectivityConfiguration deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateNetworkConnectivityConfigurationPb pb =
          mapper.readValue(p, CreateNetworkConnectivityConfigurationPb.class);
      return CreateNetworkConnectivityConfiguration.fromPb(pb);
    }
  }
}

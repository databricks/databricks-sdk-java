// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateCatalog.CreateCatalogSerializer.class)
@JsonDeserialize(using = CreateCatalog.CreateCatalogDeserializer.class)
public class CreateCatalog {
  /** User-provided free-form text description. */
  private String comment;

  /** The name of the connection to an external data source. */
  private String connectionName;

  /** Name of catalog. */
  private String name;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> options;

  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  /**
   * The name of delta sharing provider.
   *
   * <p>A Delta Sharing catalog is a catalog that is based on a Delta share on a remote sharing
   * server.
   */
  private String providerName;

  /** The name of the share under the share provider. */
  private String shareName;

  /** Storage root URL for managed tables within catalog. */
  private String storageRoot;

  public CreateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateCatalog setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public CreateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCatalog setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CreateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateCatalog setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public CreateCatalog setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public CreateCatalog setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCatalog that = (CreateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, connectionName, name, options, properties, providerName, shareName, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCatalog.class)
        .add("comment", comment)
        .add("connectionName", connectionName)
        .add("name", name)
        .add("options", options)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("storageRoot", storageRoot)
        .toString();
  }

  CreateCatalogPb toPb() {
    CreateCatalogPb pb = new CreateCatalogPb();
    pb.setComment(comment);
    pb.setConnectionName(connectionName);
    pb.setName(name);
    pb.setOptions(options);
    pb.setProperties(properties);
    pb.setProviderName(providerName);
    pb.setShareName(shareName);
    pb.setStorageRoot(storageRoot);

    return pb;
  }

  static CreateCatalog fromPb(CreateCatalogPb pb) {
    CreateCatalog model = new CreateCatalog();
    model.setComment(pb.getComment());
    model.setConnectionName(pb.getConnectionName());
    model.setName(pb.getName());
    model.setOptions(pb.getOptions());
    model.setProperties(pb.getProperties());
    model.setProviderName(pb.getProviderName());
    model.setShareName(pb.getShareName());
    model.setStorageRoot(pb.getStorageRoot());

    return model;
  }

  public static class CreateCatalogSerializer extends JsonSerializer<CreateCatalog> {
    @Override
    public void serialize(CreateCatalog value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCatalogPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCatalogDeserializer extends JsonDeserializer<CreateCatalog> {
    @Override
    public CreateCatalog deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCatalogPb pb = mapper.readValue(p, CreateCatalogPb.class);
      return CreateCatalog.fromPb(pb);
    }
  }
}

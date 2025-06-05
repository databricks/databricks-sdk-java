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

/**
 * This represents the setting configuration for the default namespace in the Databricks workspace.
 * Setting the default catalog for the workspace determines the catalog that is used when queries do
 * not reference a fully qualified 3 level name. For example, if the default catalog is set to
 * 'retail_prod' then a query 'SELECT * FROM myTable' would reference the object
 * 'retail_prod.default.myTable' (the schema 'default' is always assumed). This setting requires a
 * restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only
 * applies when using Unity Catalog-enabled compute.
 */
@Generated
@JsonSerialize(using = DefaultNamespaceSetting.DefaultNamespaceSettingSerializer.class)
@JsonDeserialize(using = DefaultNamespaceSetting.DefaultNamespaceSettingDeserializer.class)
public class DefaultNamespaceSetting {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  private String etag;

  /** */
  private StringMessage namespace;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  private String settingName;

  public DefaultNamespaceSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DefaultNamespaceSetting setNamespace(StringMessage namespace) {
    this.namespace = namespace;
    return this;
  }

  public StringMessage getNamespace() {
    return namespace;
  }

  public DefaultNamespaceSetting setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultNamespaceSetting that = (DefaultNamespaceSetting) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(namespace, that.namespace)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, namespace, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultNamespaceSetting.class)
        .add("etag", etag)
        .add("namespace", namespace)
        .add("settingName", settingName)
        .toString();
  }

  DefaultNamespaceSettingPb toPb() {
    DefaultNamespaceSettingPb pb = new DefaultNamespaceSettingPb();
    pb.setEtag(etag);
    pb.setNamespace(namespace);
    pb.setSettingName(settingName);

    return pb;
  }

  static DefaultNamespaceSetting fromPb(DefaultNamespaceSettingPb pb) {
    DefaultNamespaceSetting model = new DefaultNamespaceSetting();
    model.setEtag(pb.getEtag());
    model.setNamespace(pb.getNamespace());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class DefaultNamespaceSettingSerializer
      extends JsonSerializer<DefaultNamespaceSetting> {
    @Override
    public void serialize(
        DefaultNamespaceSetting value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DefaultNamespaceSettingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DefaultNamespaceSettingDeserializer
      extends JsonDeserializer<DefaultNamespaceSetting> {
    @Override
    public DefaultNamespaceSetting deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DefaultNamespaceSettingPb pb = mapper.readValue(p, DefaultNamespaceSettingPb.class);
      return DefaultNamespaceSetting.fromPb(pb);
    }
  }
}

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

/** Details required to update a setting. */
@Generated
@JsonSerialize(
    using =
        UpdateDefaultNamespaceSettingRequest.UpdateDefaultNamespaceSettingRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateDefaultNamespaceSettingRequest.UpdateDefaultNamespaceSettingRequestDeserializer.class)
public class UpdateDefaultNamespaceSettingRequest {
  /** This should always be set to true for Settings API. Added for AIP compliance. */
  private Boolean allowMissing;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  private String fieldMask;

  /**
   * This represents the setting configuration for the default namespace in the Databricks
   * workspace. Setting the default catalog for the workspace determines the catalog that is used
   * when queries do not reference a fully qualified 3 level name. For example, if the default
   * catalog is set to 'retail_prod' then a query 'SELECT * FROM myTable' would reference the object
   * 'retail_prod.default.myTable' (the schema 'default' is always assumed). This setting requires a
   * restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only
   * applies when using Unity Catalog-enabled compute.
   */
  private DefaultNamespaceSetting setting;

  public UpdateDefaultNamespaceSettingRequest setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateDefaultNamespaceSettingRequest setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public UpdateDefaultNamespaceSettingRequest setSetting(DefaultNamespaceSetting setting) {
    this.setting = setting;
    return this;
  }

  public DefaultNamespaceSetting getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDefaultNamespaceSettingRequest that = (UpdateDefaultNamespaceSettingRequest) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, fieldMask, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultNamespaceSettingRequest.class)
        .add("allowMissing", allowMissing)
        .add("fieldMask", fieldMask)
        .add("setting", setting)
        .toString();
  }

  UpdateDefaultNamespaceSettingRequestPb toPb() {
    UpdateDefaultNamespaceSettingRequestPb pb = new UpdateDefaultNamespaceSettingRequestPb();
    pb.setAllowMissing(allowMissing);
    pb.setFieldMask(fieldMask);
    pb.setSetting(setting);

    return pb;
  }

  static UpdateDefaultNamespaceSettingRequest fromPb(UpdateDefaultNamespaceSettingRequestPb pb) {
    UpdateDefaultNamespaceSettingRequest model = new UpdateDefaultNamespaceSettingRequest();
    model.setAllowMissing(pb.getAllowMissing());
    model.setFieldMask(pb.getFieldMask());
    model.setSetting(pb.getSetting());

    return model;
  }

  public static class UpdateDefaultNamespaceSettingRequestSerializer
      extends JsonSerializer<UpdateDefaultNamespaceSettingRequest> {
    @Override
    public void serialize(
        UpdateDefaultNamespaceSettingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateDefaultNamespaceSettingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateDefaultNamespaceSettingRequestDeserializer
      extends JsonDeserializer<UpdateDefaultNamespaceSettingRequest> {
    @Override
    public UpdateDefaultNamespaceSettingRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateDefaultNamespaceSettingRequestPb pb =
          mapper.readValue(p, UpdateDefaultNamespaceSettingRequestPb.class);
      return UpdateDefaultNamespaceSettingRequest.fromPb(pb);
    }
  }
}

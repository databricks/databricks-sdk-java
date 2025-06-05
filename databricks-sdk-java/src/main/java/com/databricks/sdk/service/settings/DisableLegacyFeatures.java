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

@Generated
@JsonSerialize(using = DisableLegacyFeatures.DisableLegacyFeaturesSerializer.class)
@JsonDeserialize(using = DisableLegacyFeatures.DisableLegacyFeaturesDeserializer.class)
public class DisableLegacyFeatures {
  /** */
  private BooleanMessage disableLegacyFeatures;

  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  private String etag;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  private String settingName;

  public DisableLegacyFeatures setDisableLegacyFeatures(BooleanMessage disableLegacyFeatures) {
    this.disableLegacyFeatures = disableLegacyFeatures;
    return this;
  }

  public BooleanMessage getDisableLegacyFeatures() {
    return disableLegacyFeatures;
  }

  public DisableLegacyFeatures setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DisableLegacyFeatures setSettingName(String settingName) {
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
    DisableLegacyFeatures that = (DisableLegacyFeatures) o;
    return Objects.equals(disableLegacyFeatures, that.disableLegacyFeatures)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableLegacyFeatures, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableLegacyFeatures.class)
        .add("disableLegacyFeatures", disableLegacyFeatures)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }

  DisableLegacyFeaturesPb toPb() {
    DisableLegacyFeaturesPb pb = new DisableLegacyFeaturesPb();
    pb.setDisableLegacyFeatures(disableLegacyFeatures);
    pb.setEtag(etag);
    pb.setSettingName(settingName);

    return pb;
  }

  static DisableLegacyFeatures fromPb(DisableLegacyFeaturesPb pb) {
    DisableLegacyFeatures model = new DisableLegacyFeatures();
    model.setDisableLegacyFeatures(pb.getDisableLegacyFeatures());
    model.setEtag(pb.getEtag());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class DisableLegacyFeaturesSerializer
      extends JsonSerializer<DisableLegacyFeatures> {
    @Override
    public void serialize(
        DisableLegacyFeatures value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DisableLegacyFeaturesPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DisableLegacyFeaturesDeserializer
      extends JsonDeserializer<DisableLegacyFeatures> {
    @Override
    public DisableLegacyFeatures deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DisableLegacyFeaturesPb pb = mapper.readValue(p, DisableLegacyFeaturesPb.class);
      return DisableLegacyFeatures.fromPb(pb);
    }
  }
}

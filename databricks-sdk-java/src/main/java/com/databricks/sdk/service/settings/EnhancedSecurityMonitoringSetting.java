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
@JsonSerialize(
    using = EnhancedSecurityMonitoringSetting.EnhancedSecurityMonitoringSettingSerializer.class)
@JsonDeserialize(
    using = EnhancedSecurityMonitoringSetting.EnhancedSecurityMonitoringSettingDeserializer.class)
public class EnhancedSecurityMonitoringSetting {
  /** SHIELD feature: ESM */
  private EnhancedSecurityMonitoring enhancedSecurityMonitoringWorkspace;

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

  public EnhancedSecurityMonitoringSetting setEnhancedSecurityMonitoringWorkspace(
      EnhancedSecurityMonitoring enhancedSecurityMonitoringWorkspace) {
    this.enhancedSecurityMonitoringWorkspace = enhancedSecurityMonitoringWorkspace;
    return this;
  }

  public EnhancedSecurityMonitoring getEnhancedSecurityMonitoringWorkspace() {
    return enhancedSecurityMonitoringWorkspace;
  }

  public EnhancedSecurityMonitoringSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public EnhancedSecurityMonitoringSetting setSettingName(String settingName) {
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
    EnhancedSecurityMonitoringSetting that = (EnhancedSecurityMonitoringSetting) o;
    return Objects.equals(
            enhancedSecurityMonitoringWorkspace, that.enhancedSecurityMonitoringWorkspace)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedSecurityMonitoringWorkspace, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnhancedSecurityMonitoringSetting.class)
        .add("enhancedSecurityMonitoringWorkspace", enhancedSecurityMonitoringWorkspace)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }

  EnhancedSecurityMonitoringSettingPb toPb() {
    EnhancedSecurityMonitoringSettingPb pb = new EnhancedSecurityMonitoringSettingPb();
    pb.setEnhancedSecurityMonitoringWorkspace(enhancedSecurityMonitoringWorkspace);
    pb.setEtag(etag);
    pb.setSettingName(settingName);

    return pb;
  }

  static EnhancedSecurityMonitoringSetting fromPb(EnhancedSecurityMonitoringSettingPb pb) {
    EnhancedSecurityMonitoringSetting model = new EnhancedSecurityMonitoringSetting();
    model.setEnhancedSecurityMonitoringWorkspace(pb.getEnhancedSecurityMonitoringWorkspace());
    model.setEtag(pb.getEtag());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class EnhancedSecurityMonitoringSettingSerializer
      extends JsonSerializer<EnhancedSecurityMonitoringSetting> {
    @Override
    public void serialize(
        EnhancedSecurityMonitoringSetting value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnhancedSecurityMonitoringSettingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnhancedSecurityMonitoringSettingDeserializer
      extends JsonDeserializer<EnhancedSecurityMonitoringSetting> {
    @Override
    public EnhancedSecurityMonitoringSetting deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnhancedSecurityMonitoringSettingPb pb =
          mapper.readValue(p, EnhancedSecurityMonitoringSettingPb.class);
      return EnhancedSecurityMonitoringSetting.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = AutomaticClusterUpdateSetting.AutomaticClusterUpdateSettingSerializer.class)
@JsonDeserialize(
    using = AutomaticClusterUpdateSetting.AutomaticClusterUpdateSettingDeserializer.class)
public class AutomaticClusterUpdateSetting {
  /** */
  private ClusterAutoRestartMessage automaticClusterUpdateWorkspace;

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

  public AutomaticClusterUpdateSetting setAutomaticClusterUpdateWorkspace(
      ClusterAutoRestartMessage automaticClusterUpdateWorkspace) {
    this.automaticClusterUpdateWorkspace = automaticClusterUpdateWorkspace;
    return this;
  }

  public ClusterAutoRestartMessage getAutomaticClusterUpdateWorkspace() {
    return automaticClusterUpdateWorkspace;
  }

  public AutomaticClusterUpdateSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AutomaticClusterUpdateSetting setSettingName(String settingName) {
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
    AutomaticClusterUpdateSetting that = (AutomaticClusterUpdateSetting) o;
    return Objects.equals(automaticClusterUpdateWorkspace, that.automaticClusterUpdateWorkspace)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticClusterUpdateWorkspace, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(AutomaticClusterUpdateSetting.class)
        .add("automaticClusterUpdateWorkspace", automaticClusterUpdateWorkspace)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }

  AutomaticClusterUpdateSettingPb toPb() {
    AutomaticClusterUpdateSettingPb pb = new AutomaticClusterUpdateSettingPb();
    pb.setAutomaticClusterUpdateWorkspace(automaticClusterUpdateWorkspace);
    pb.setEtag(etag);
    pb.setSettingName(settingName);

    return pb;
  }

  static AutomaticClusterUpdateSetting fromPb(AutomaticClusterUpdateSettingPb pb) {
    AutomaticClusterUpdateSetting model = new AutomaticClusterUpdateSetting();
    model.setAutomaticClusterUpdateWorkspace(pb.getAutomaticClusterUpdateWorkspace());
    model.setEtag(pb.getEtag());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class AutomaticClusterUpdateSettingSerializer
      extends JsonSerializer<AutomaticClusterUpdateSetting> {
    @Override
    public void serialize(
        AutomaticClusterUpdateSetting value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AutomaticClusterUpdateSettingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AutomaticClusterUpdateSettingDeserializer
      extends JsonDeserializer<AutomaticClusterUpdateSetting> {
    @Override
    public AutomaticClusterUpdateSetting deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AutomaticClusterUpdateSettingPb pb =
          mapper.readValue(p, AutomaticClusterUpdateSettingPb.class);
      return AutomaticClusterUpdateSetting.fromPb(pb);
    }
  }
}

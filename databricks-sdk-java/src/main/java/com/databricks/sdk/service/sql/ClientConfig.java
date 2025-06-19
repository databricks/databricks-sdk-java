// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = ClientConfig.ClientConfigSerializer.class)
@JsonDeserialize(using = ClientConfig.ClientConfigDeserializer.class)
public class ClientConfig {
  /** */
  private Boolean allowCustomJsVisualizations;

  /** */
  private Boolean allowDownloads;

  /** */
  private Boolean allowExternalShares;

  /** */
  private Boolean allowSubscriptions;

  /** */
  private String dateFormat;

  /** */
  private String dateTimeFormat;

  /** */
  private Boolean disablePublish;

  /** */
  private Boolean enableLegacyAutodetectTypes;

  /** */
  private Boolean featureShowPermissionsControl;

  /** */
  private Boolean hidePlotlyModeBar;

  public ClientConfig setAllowCustomJsVisualizations(Boolean allowCustomJsVisualizations) {
    this.allowCustomJsVisualizations = allowCustomJsVisualizations;
    return this;
  }

  public Boolean getAllowCustomJsVisualizations() {
    return allowCustomJsVisualizations;
  }

  public ClientConfig setAllowDownloads(Boolean allowDownloads) {
    this.allowDownloads = allowDownloads;
    return this;
  }

  public Boolean getAllowDownloads() {
    return allowDownloads;
  }

  public ClientConfig setAllowExternalShares(Boolean allowExternalShares) {
    this.allowExternalShares = allowExternalShares;
    return this;
  }

  public Boolean getAllowExternalShares() {
    return allowExternalShares;
  }

  public ClientConfig setAllowSubscriptions(Boolean allowSubscriptions) {
    this.allowSubscriptions = allowSubscriptions;
    return this;
  }

  public Boolean getAllowSubscriptions() {
    return allowSubscriptions;
  }

  public ClientConfig setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public ClientConfig setDateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
    return this;
  }

  public String getDateTimeFormat() {
    return dateTimeFormat;
  }

  public ClientConfig setDisablePublish(Boolean disablePublish) {
    this.disablePublish = disablePublish;
    return this;
  }

  public Boolean getDisablePublish() {
    return disablePublish;
  }

  public ClientConfig setEnableLegacyAutodetectTypes(Boolean enableLegacyAutodetectTypes) {
    this.enableLegacyAutodetectTypes = enableLegacyAutodetectTypes;
    return this;
  }

  public Boolean getEnableLegacyAutodetectTypes() {
    return enableLegacyAutodetectTypes;
  }

  public ClientConfig setFeatureShowPermissionsControl(Boolean featureShowPermissionsControl) {
    this.featureShowPermissionsControl = featureShowPermissionsControl;
    return this;
  }

  public Boolean getFeatureShowPermissionsControl() {
    return featureShowPermissionsControl;
  }

  public ClientConfig setHidePlotlyModeBar(Boolean hidePlotlyModeBar) {
    this.hidePlotlyModeBar = hidePlotlyModeBar;
    return this;
  }

  public Boolean getHidePlotlyModeBar() {
    return hidePlotlyModeBar;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientConfig that = (ClientConfig) o;
    return Objects.equals(allowCustomJsVisualizations, that.allowCustomJsVisualizations)
        && Objects.equals(allowDownloads, that.allowDownloads)
        && Objects.equals(allowExternalShares, that.allowExternalShares)
        && Objects.equals(allowSubscriptions, that.allowSubscriptions)
        && Objects.equals(dateFormat, that.dateFormat)
        && Objects.equals(dateTimeFormat, that.dateTimeFormat)
        && Objects.equals(disablePublish, that.disablePublish)
        && Objects.equals(enableLegacyAutodetectTypes, that.enableLegacyAutodetectTypes)
        && Objects.equals(featureShowPermissionsControl, that.featureShowPermissionsControl)
        && Objects.equals(hidePlotlyModeBar, that.hidePlotlyModeBar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowCustomJsVisualizations,
        allowDownloads,
        allowExternalShares,
        allowSubscriptions,
        dateFormat,
        dateTimeFormat,
        disablePublish,
        enableLegacyAutodetectTypes,
        featureShowPermissionsControl,
        hidePlotlyModeBar);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientConfig.class)
        .add("allowCustomJsVisualizations", allowCustomJsVisualizations)
        .add("allowDownloads", allowDownloads)
        .add("allowExternalShares", allowExternalShares)
        .add("allowSubscriptions", allowSubscriptions)
        .add("dateFormat", dateFormat)
        .add("dateTimeFormat", dateTimeFormat)
        .add("disablePublish", disablePublish)
        .add("enableLegacyAutodetectTypes", enableLegacyAutodetectTypes)
        .add("featureShowPermissionsControl", featureShowPermissionsControl)
        .add("hidePlotlyModeBar", hidePlotlyModeBar)
        .toString();
  }

  ClientConfigPb toPb() {
    ClientConfigPb pb = new ClientConfigPb();
    pb.setAllowCustomJsVisualizations(allowCustomJsVisualizations);
    pb.setAllowDownloads(allowDownloads);
    pb.setAllowExternalShares(allowExternalShares);
    pb.setAllowSubscriptions(allowSubscriptions);
    pb.setDateFormat(dateFormat);
    pb.setDateTimeFormat(dateTimeFormat);
    pb.setDisablePublish(disablePublish);
    pb.setEnableLegacyAutodetectTypes(enableLegacyAutodetectTypes);
    pb.setFeatureShowPermissionsControl(featureShowPermissionsControl);
    pb.setHidePlotlyModeBar(hidePlotlyModeBar);

    return pb;
  }

  static ClientConfig fromPb(ClientConfigPb pb) {
    ClientConfig model = new ClientConfig();
    model.setAllowCustomJsVisualizations(pb.getAllowCustomJsVisualizations());
    model.setAllowDownloads(pb.getAllowDownloads());
    model.setAllowExternalShares(pb.getAllowExternalShares());
    model.setAllowSubscriptions(pb.getAllowSubscriptions());
    model.setDateFormat(pb.getDateFormat());
    model.setDateTimeFormat(pb.getDateTimeFormat());
    model.setDisablePublish(pb.getDisablePublish());
    model.setEnableLegacyAutodetectTypes(pb.getEnableLegacyAutodetectTypes());
    model.setFeatureShowPermissionsControl(pb.getFeatureShowPermissionsControl());
    model.setHidePlotlyModeBar(pb.getHidePlotlyModeBar());

    return model;
  }

  public static class ClientConfigSerializer extends JsonSerializer<ClientConfig> {
    @Override
    public void serialize(ClientConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClientConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClientConfigDeserializer extends JsonDeserializer<ClientConfig> {
    @Override
    public ClientConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClientConfigPb pb = mapper.readValue(p, ClientConfigPb.class);
      return ClientConfig.fromPb(pb);
    }
  }
}

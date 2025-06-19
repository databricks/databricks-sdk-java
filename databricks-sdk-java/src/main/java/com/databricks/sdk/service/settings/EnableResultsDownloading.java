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
@JsonSerialize(using = EnableResultsDownloading.EnableResultsDownloadingSerializer.class)
@JsonDeserialize(using = EnableResultsDownloading.EnableResultsDownloadingDeserializer.class)
public class EnableResultsDownloading {
  /** */
  private BooleanMessage booleanVal;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  private String settingName;

  public EnableResultsDownloading setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public EnableResultsDownloading setSettingName(String settingName) {
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
    EnableResultsDownloading that = (EnableResultsDownloading) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableResultsDownloading.class)
        .add("booleanVal", booleanVal)
        .add("settingName", settingName)
        .toString();
  }

  EnableResultsDownloadingPb toPb() {
    EnableResultsDownloadingPb pb = new EnableResultsDownloadingPb();
    pb.setBooleanVal(booleanVal);
    pb.setSettingName(settingName);

    return pb;
  }

  static EnableResultsDownloading fromPb(EnableResultsDownloadingPb pb) {
    EnableResultsDownloading model = new EnableResultsDownloading();
    model.setBooleanVal(pb.getBooleanVal());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class EnableResultsDownloadingSerializer
      extends JsonSerializer<EnableResultsDownloading> {
    @Override
    public void serialize(
        EnableResultsDownloading value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnableResultsDownloadingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnableResultsDownloadingDeserializer
      extends JsonDeserializer<EnableResultsDownloading> {
    @Override
    public EnableResultsDownloading deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnableResultsDownloadingPb pb = mapper.readValue(p, EnableResultsDownloadingPb.class);
      return EnableResultsDownloading.fromPb(pb);
    }
  }
}

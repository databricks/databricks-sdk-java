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
@JsonSerialize(using = EnableExportNotebook.EnableExportNotebookSerializer.class)
@JsonDeserialize(using = EnableExportNotebook.EnableExportNotebookDeserializer.class)
public class EnableExportNotebook {
  /** */
  private BooleanMessage booleanVal;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  private String settingName;

  public EnableExportNotebook setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public EnableExportNotebook setSettingName(String settingName) {
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
    EnableExportNotebook that = (EnableExportNotebook) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableExportNotebook.class)
        .add("booleanVal", booleanVal)
        .add("settingName", settingName)
        .toString();
  }

  EnableExportNotebookPb toPb() {
    EnableExportNotebookPb pb = new EnableExportNotebookPb();
    pb.setBooleanVal(booleanVal);
    pb.setSettingName(settingName);

    return pb;
  }

  static EnableExportNotebook fromPb(EnableExportNotebookPb pb) {
    EnableExportNotebook model = new EnableExportNotebook();
    model.setBooleanVal(pb.getBooleanVal());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class EnableExportNotebookSerializer extends JsonSerializer<EnableExportNotebook> {
    @Override
    public void serialize(
        EnableExportNotebook value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnableExportNotebookPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnableExportNotebookDeserializer
      extends JsonDeserializer<EnableExportNotebook> {
    @Override
    public EnableExportNotebook deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnableExportNotebookPb pb = mapper.readValue(p, EnableExportNotebookPb.class);
      return EnableExportNotebook.fromPb(pb);
    }
  }
}

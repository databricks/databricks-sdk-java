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
@JsonSerialize(using = DashboardEmailSubscriptions.DashboardEmailSubscriptionsSerializer.class)
@JsonDeserialize(using = DashboardEmailSubscriptions.DashboardEmailSubscriptionsDeserializer.class)
public class DashboardEmailSubscriptions {
  /** */
  private BooleanMessage booleanVal;

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

  public DashboardEmailSubscriptions setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public DashboardEmailSubscriptions setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DashboardEmailSubscriptions setSettingName(String settingName) {
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
    DashboardEmailSubscriptions that = (DashboardEmailSubscriptions) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardEmailSubscriptions.class)
        .add("booleanVal", booleanVal)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }

  DashboardEmailSubscriptionsPb toPb() {
    DashboardEmailSubscriptionsPb pb = new DashboardEmailSubscriptionsPb();
    pb.setBooleanVal(booleanVal);
    pb.setEtag(etag);
    pb.setSettingName(settingName);

    return pb;
  }

  static DashboardEmailSubscriptions fromPb(DashboardEmailSubscriptionsPb pb) {
    DashboardEmailSubscriptions model = new DashboardEmailSubscriptions();
    model.setBooleanVal(pb.getBooleanVal());
    model.setEtag(pb.getEtag());
    model.setSettingName(pb.getSettingName());

    return model;
  }

  public static class DashboardEmailSubscriptionsSerializer
      extends JsonSerializer<DashboardEmailSubscriptions> {
    @Override
    public void serialize(
        DashboardEmailSubscriptions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardEmailSubscriptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardEmailSubscriptionsDeserializer
      extends JsonDeserializer<DashboardEmailSubscriptions> {
    @Override
    public DashboardEmailSubscriptions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardEmailSubscriptionsPb pb = mapper.readValue(p, DashboardEmailSubscriptionsPb.class);
      return DashboardEmailSubscriptions.fromPb(pb);
    }
  }
}

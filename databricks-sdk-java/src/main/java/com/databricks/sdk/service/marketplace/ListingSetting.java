// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ListingSetting.ListingSettingSerializer.class)
@JsonDeserialize(using = ListingSetting.ListingSettingDeserializer.class)
public class ListingSetting {
  /** */
  private Visibility visibility;

  public ListingSetting setVisibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingSetting that = (ListingSetting) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingSetting.class).add("visibility", visibility).toString();
  }

  ListingSettingPb toPb() {
    ListingSettingPb pb = new ListingSettingPb();
    pb.setVisibility(visibility);

    return pb;
  }

  static ListingSetting fromPb(ListingSettingPb pb) {
    ListingSetting model = new ListingSetting();
    model.setVisibility(pb.getVisibility());

    return model;
  }

  public static class ListingSettingSerializer extends JsonSerializer<ListingSetting> {
    @Override
    public void serialize(ListingSetting value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingSettingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingSettingDeserializer extends JsonDeserializer<ListingSetting> {
    @Override
    public ListingSetting deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingSettingPb pb = mapper.readValue(p, ListingSettingPb.class);
      return ListingSetting.fromPb(pb);
    }
  }
}

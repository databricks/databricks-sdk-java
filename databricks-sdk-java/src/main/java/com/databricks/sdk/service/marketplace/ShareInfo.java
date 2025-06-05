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
@JsonSerialize(using = ShareInfo.ShareInfoSerializer.class)
@JsonDeserialize(using = ShareInfo.ShareInfoDeserializer.class)
public class ShareInfo {
  /** */
  private String name;

  /** */
  private ListingShareType typeValue;

  public ShareInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ShareInfo setType(ListingShareType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ListingShareType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareInfo that = (ShareInfo) o;
    return Objects.equals(name, that.name) && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareInfo.class).add("name", name).add("typeValue", typeValue).toString();
  }

  ShareInfoPb toPb() {
    ShareInfoPb pb = new ShareInfoPb();
    pb.setName(name);
    pb.setType(typeValue);

    return pb;
  }

  static ShareInfo fromPb(ShareInfoPb pb) {
    ShareInfo model = new ShareInfo();
    model.setName(pb.getName());
    model.setType(pb.getType());

    return model;
  }

  public static class ShareInfoSerializer extends JsonSerializer<ShareInfo> {
    @Override
    public void serialize(ShareInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ShareInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ShareInfoDeserializer extends JsonDeserializer<ShareInfo> {
    @Override
    public ShareInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ShareInfoPb pb = mapper.readValue(p, ShareInfoPb.class);
      return ShareInfo.fromPb(pb);
    }
  }
}

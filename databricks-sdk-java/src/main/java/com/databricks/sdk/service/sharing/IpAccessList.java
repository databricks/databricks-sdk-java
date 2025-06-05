// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = IpAccessList.IpAccessListSerializer.class)
@JsonDeserialize(using = IpAccessList.IpAccessListDeserializer.class)
public class IpAccessList {
  /** Allowed IP Addresses in CIDR notation. Limit of 100. */
  private Collection<String> allowedIpAddresses;

  public IpAccessList setAllowedIpAddresses(Collection<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public Collection<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessList that = (IpAccessList) o;
    return Objects.equals(allowedIpAddresses, that.allowedIpAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIpAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(IpAccessList.class)
        .add("allowedIpAddresses", allowedIpAddresses)
        .toString();
  }

  IpAccessListPb toPb() {
    IpAccessListPb pb = new IpAccessListPb();
    pb.setAllowedIpAddresses(allowedIpAddresses);

    return pb;
  }

  static IpAccessList fromPb(IpAccessListPb pb) {
    IpAccessList model = new IpAccessList();
    model.setAllowedIpAddresses(pb.getAllowedIpAddresses());

    return model;
  }

  public static class IpAccessListSerializer extends JsonSerializer<IpAccessList> {
    @Override
    public void serialize(IpAccessList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      IpAccessListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class IpAccessListDeserializer extends JsonDeserializer<IpAccessList> {
    @Override
    public IpAccessList deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      IpAccessListPb pb = mapper.readValue(p, IpAccessListPb.class);
      return IpAccessList.fromPb(pb);
    }
  }
}

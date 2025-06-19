// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** A storage location in Adls Gen2 */
@Generated
@JsonSerialize(using = Adlsgen2Info.Adlsgen2InfoSerializer.class)
@JsonDeserialize(using = Adlsgen2Info.Adlsgen2InfoDeserializer.class)
public class Adlsgen2Info {
  /**
   * abfss destination, e.g.
   * `abfss://<container-name>@<storage-account-name>.dfs.core.windows.net/<directory-name>`.
   */
  private String destination;

  public Adlsgen2Info setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Adlsgen2Info that = (Adlsgen2Info) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(Adlsgen2Info.class).add("destination", destination).toString();
  }

  Adlsgen2InfoPb toPb() {
    Adlsgen2InfoPb pb = new Adlsgen2InfoPb();
    pb.setDestination(destination);

    return pb;
  }

  static Adlsgen2Info fromPb(Adlsgen2InfoPb pb) {
    Adlsgen2Info model = new Adlsgen2Info();
    model.setDestination(pb.getDestination());

    return model;
  }

  public static class Adlsgen2InfoSerializer extends JsonSerializer<Adlsgen2Info> {
    @Override
    public void serialize(Adlsgen2Info value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      Adlsgen2InfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class Adlsgen2InfoDeserializer extends JsonDeserializer<Adlsgen2Info> {
    @Override
    public Adlsgen2Info deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      Adlsgen2InfoPb pb = mapper.readValue(p, Adlsgen2InfoPb.class);
      return Adlsgen2Info.fromPb(pb);
    }
  }
}

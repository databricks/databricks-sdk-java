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
@JsonSerialize(using = Installation.InstallationSerializer.class)
@JsonDeserialize(using = Installation.InstallationDeserializer.class)
public class Installation {
  /** */
  private InstallationDetail installation;

  public Installation setInstallation(InstallationDetail installation) {
    this.installation = installation;
    return this;
  }

  public InstallationDetail getInstallation() {
    return installation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Installation that = (Installation) o;
    return Objects.equals(installation, that.installation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation);
  }

  @Override
  public String toString() {
    return new ToStringer(Installation.class).add("installation", installation).toString();
  }

  InstallationPb toPb() {
    InstallationPb pb = new InstallationPb();
    pb.setInstallation(installation);

    return pb;
  }

  static Installation fromPb(InstallationPb pb) {
    Installation model = new Installation();
    model.setInstallation(pb.getInstallation());

    return model;
  }

  public static class InstallationSerializer extends JsonSerializer<Installation> {
    @Override
    public void serialize(Installation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstallationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstallationDeserializer extends JsonDeserializer<Installation> {
    @Override
    public Installation deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstallationPb pb = mapper.readValue(p, InstallationPb.class);
      return Installation.fromPb(pb);
    }
  }
}

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = EditPolicy.EditPolicySerializer.class)
@JsonDeserialize(using = EditPolicy.EditPolicyDeserializer.class)
public class EditPolicy {
  /**
   * Policy definition document expressed in [Databricks Cluster Policy Definition Language].
   *
   * <p>[Databricks Cluster Policy Definition Language]:
   * https://docs.databricks.com/administration-guide/clusters/policy-definition.html
   */
  private String definition;

  /** Additional human-readable description of the cluster policy. */
  private String description;

  /**
   * A list of libraries to be installed on the next cluster restart that uses this policy. The
   * maximum number of libraries is 500.
   */
  private Collection<Library> libraries;

  /**
   * Max number of clusters per user that can be active using this policy. If not present, there is
   * no max limit.
   */
  private Long maxClustersPerUser;

  /**
   * Cluster Policy name requested by the user. This has to be unique. Length must be between 1 and
   * 100 characters.
   */
  private String name;

  /**
   * Policy definition JSON document expressed in [Databricks Policy Definition Language]. The JSON
   * document must be passed as a string and cannot be embedded in the requests.
   *
   * <p>You can use this to customize the policy definition inherited from the policy family. Policy
   * rules specified here are merged into the inherited policy definition.
   *
   * <p>[Databricks Policy Definition Language]:
   * https://docs.databricks.com/administration-guide/clusters/policy-definition.html
   */
  private String policyFamilyDefinitionOverrides;

  /**
   * ID of the policy family. The cluster policy's policy definition inherits the policy family's
   * policy definition.
   *
   * <p>Cannot be used with `definition`. Use `policy_family_definition_overrides` instead to
   * customize the policy definition.
   */
  private String policyFamilyId;

  /** The ID of the policy to update. */
  private String policyId;

  public EditPolicy setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public EditPolicy setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public EditPolicy setLibraries(Collection<Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<Library> getLibraries() {
    return libraries;
  }

  public EditPolicy setMaxClustersPerUser(Long maxClustersPerUser) {
    this.maxClustersPerUser = maxClustersPerUser;
    return this;
  }

  public Long getMaxClustersPerUser() {
    return maxClustersPerUser;
  }

  public EditPolicy setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EditPolicy setPolicyFamilyDefinitionOverrides(String policyFamilyDefinitionOverrides) {
    this.policyFamilyDefinitionOverrides = policyFamilyDefinitionOverrides;
    return this;
  }

  public String getPolicyFamilyDefinitionOverrides() {
    return policyFamilyDefinitionOverrides;
  }

  public EditPolicy setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  public EditPolicy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EditPolicy that = (EditPolicy) o;
    return Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(maxClustersPerUser, that.maxClustersPerUser)
        && Objects.equals(name, that.name)
        && Objects.equals(policyFamilyDefinitionOverrides, that.policyFamilyDefinitionOverrides)
        && Objects.equals(policyFamilyId, that.policyFamilyId)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        definition,
        description,
        libraries,
        maxClustersPerUser,
        name,
        policyFamilyDefinitionOverrides,
        policyFamilyId,
        policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(EditPolicy.class)
        .add("definition", definition)
        .add("description", description)
        .add("libraries", libraries)
        .add("maxClustersPerUser", maxClustersPerUser)
        .add("name", name)
        .add("policyFamilyDefinitionOverrides", policyFamilyDefinitionOverrides)
        .add("policyFamilyId", policyFamilyId)
        .add("policyId", policyId)
        .toString();
  }

  EditPolicyPb toPb() {
    EditPolicyPb pb = new EditPolicyPb();
    pb.setDefinition(definition);
    pb.setDescription(description);
    pb.setLibraries(libraries);
    pb.setMaxClustersPerUser(maxClustersPerUser);
    pb.setName(name);
    pb.setPolicyFamilyDefinitionOverrides(policyFamilyDefinitionOverrides);
    pb.setPolicyFamilyId(policyFamilyId);
    pb.setPolicyId(policyId);

    return pb;
  }

  static EditPolicy fromPb(EditPolicyPb pb) {
    EditPolicy model = new EditPolicy();
    model.setDefinition(pb.getDefinition());
    model.setDescription(pb.getDescription());
    model.setLibraries(pb.getLibraries());
    model.setMaxClustersPerUser(pb.getMaxClustersPerUser());
    model.setName(pb.getName());
    model.setPolicyFamilyDefinitionOverrides(pb.getPolicyFamilyDefinitionOverrides());
    model.setPolicyFamilyId(pb.getPolicyFamilyId());
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class EditPolicySerializer extends JsonSerializer<EditPolicy> {
    @Override
    public void serialize(EditPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditPolicyDeserializer extends JsonDeserializer<EditPolicy> {
    @Override
    public EditPolicy deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditPolicyPb pb = mapper.readValue(p, EditPolicyPb.class);
      return EditPolicy.fromPb(pb);
    }
  }
}

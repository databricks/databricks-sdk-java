// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = CreateScope.CreateScopeSerializer.class)
@JsonDeserialize(using = CreateScope.CreateScopeDeserializer.class)
public class CreateScope {
  /** The metadata for the secret scope if the type is `AZURE_KEYVAULT` */
  private AzureKeyVaultSecretScopeMetadata backendAzureKeyvault;

  /** The principal that is initially granted `MANAGE` permission to the created scope. */
  private String initialManagePrincipal;

  /** Scope name requested by the user. Scope names are unique. */
  private String scope;

  /**
   * The backend type the scope will be created with. If not specified, will default to `DATABRICKS`
   */
  private ScopeBackendType scopeBackendType;

  public CreateScope setBackendAzureKeyvault(
      AzureKeyVaultSecretScopeMetadata backendAzureKeyvault) {
    this.backendAzureKeyvault = backendAzureKeyvault;
    return this;
  }

  public AzureKeyVaultSecretScopeMetadata getBackendAzureKeyvault() {
    return backendAzureKeyvault;
  }

  public CreateScope setInitialManagePrincipal(String initialManagePrincipal) {
    this.initialManagePrincipal = initialManagePrincipal;
    return this;
  }

  public String getInitialManagePrincipal() {
    return initialManagePrincipal;
  }

  public CreateScope setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  public CreateScope setScopeBackendType(ScopeBackendType scopeBackendType) {
    this.scopeBackendType = scopeBackendType;
    return this;
  }

  public ScopeBackendType getScopeBackendType() {
    return scopeBackendType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateScope that = (CreateScope) o;
    return Objects.equals(backendAzureKeyvault, that.backendAzureKeyvault)
        && Objects.equals(initialManagePrincipal, that.initialManagePrincipal)
        && Objects.equals(scope, that.scope)
        && Objects.equals(scopeBackendType, that.scopeBackendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendAzureKeyvault, initialManagePrincipal, scope, scopeBackendType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScope.class)
        .add("backendAzureKeyvault", backendAzureKeyvault)
        .add("initialManagePrincipal", initialManagePrincipal)
        .add("scope", scope)
        .add("scopeBackendType", scopeBackendType)
        .toString();
  }

  CreateScopePb toPb() {
    CreateScopePb pb = new CreateScopePb();
    pb.setBackendAzureKeyvault(backendAzureKeyvault);
    pb.setInitialManagePrincipal(initialManagePrincipal);
    pb.setScope(scope);
    pb.setScopeBackendType(scopeBackendType);

    return pb;
  }

  static CreateScope fromPb(CreateScopePb pb) {
    CreateScope model = new CreateScope();
    model.setBackendAzureKeyvault(pb.getBackendAzureKeyvault());
    model.setInitialManagePrincipal(pb.getInitialManagePrincipal());
    model.setScope(pb.getScope());
    model.setScopeBackendType(pb.getScopeBackendType());

    return model;
  }

  public static class CreateScopeSerializer extends JsonSerializer<CreateScope> {
    @Override
    public void serialize(CreateScope value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateScopePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateScopeDeserializer extends JsonDeserializer<CreateScope> {
    @Override
    public CreateScope deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateScopePb pb = mapper.readValue(p, CreateScopePb.class);
      return CreateScope.fromPb(pb);
    }
  }
}

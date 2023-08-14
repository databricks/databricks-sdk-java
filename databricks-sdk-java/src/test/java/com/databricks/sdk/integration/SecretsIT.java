package com.databricks.sdk.integration;


import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.mixin.SecretsExt;
import com.databricks.sdk.service.workspace.GetSecretResponse;
import com.databricks.sdk.service.workspace.PutSecret;
import com.databricks.sdk.service.workspace.SecretScope;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static org.junit.jupiter.api.Assertions.assertEquals;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class SecretsIT {
//     Most likely secrets/get isn't enabled
//     16:06 [DEBUG] > POST /api/2.0/secrets/put
//    > {
//    >   "key" : "testKey-826",
//    >   "scope" : "testScope-826",
//    >   "string_value" : "**REDACTED**"
//    > }
//    < 200 OK
//    < { }
//    16:06 [DEBUG] > GET /api/2.0/secrets/get?key=testKey-826&scope=testScope-826
//    < 400 Bad Request
//    < {
//    <   "error_code" : "BAD_REQUEST",
//    <   "message" : "This operation is not allowed outside databricks notebooks."
//    < }
//    =================   Uncomment once enabled ==================
    @Test
    void createAndGetSecretsTest() {
        SecretsExt secretsExt = new SecretsExt(new ApiClient());
        int randomSuffix = (int) (Math.random() * 1000);
        String scope = "testScope-" + randomSuffix;
        String key = "testKey-" + randomSuffix;
        String value = "testValue-" + randomSuffix;

        try {
            secretsExt.createScope(scope);
            secretsExt.putSecret(new PutSecret().setScope(scope).setKey(key).setStringValue(value));
            String responseValue = secretsExt.get(scope, key);
            assertEquals(value, responseValue);
        } finally {
            secretsExt.deleteSecret(scope, key);
            secretsExt.deleteScope(scope);
        }
    }

    @Test
    void createAndListScopesTest() {
        SecretsExt secretsExt = new SecretsExt(new ApiClient());
        int randomSuffix = (int) (Math.random() * 1000);
        String scope = "testScope-" + randomSuffix;
        try {
            secretsExt.createScope(scope);
            Iterable<SecretScope> response = secretsExt.listScopes();
            boolean foundScope = false;
            for(SecretScope s: response) {
                if(s.getName().equals(scope)) {
                    foundScope = true;
                    break;
                }
            }
            assertEquals(true, foundScope);
        } finally {
            secretsExt.deleteScope(scope);
        }
    }
}

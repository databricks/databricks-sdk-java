package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.AzureServicePrincipalCredentialsProvider;
import com.databricks.sdk.client.oauth.OAuthM2MServicePrincipalCredentialsProvider;

import java.util.Arrays;
import java.util.List;

public class DefaultCredentialsProvider implements CredentialsProvider {
    private static List<CredentialsProvider> providers =
            Arrays.asList(
                    new PatCredentialsProvider(),
                    new BasicCredentialsProvider(),
                    new OAuthM2MServicePrincipalCredentialsProvider(),
                    new AzureServicePrincipalCredentialsProvider()
            );

    private String authType = "default";

    @Override
    public synchronized HeaderFactory configure(DatabricksConfig config) throws Exception {
        for (CredentialsProvider provider : providers) {
            if (config.getAuthType() != null
                    && !config.getAuthType().isEmpty()
                    && provider.authType() != config.getAuthType()) {
                continue;
            }
            HeaderFactory headerFactory = provider.configure(config);
            if (headerFactory == null) {
                continue;
            }
            authType = provider.authType();
            return headerFactory;
        }
        throw new DatabricksException("cannot configure default credentials");
    }

    public String authType() {
        return authType;
    }
}

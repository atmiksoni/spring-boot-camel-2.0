/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.cometd.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.cometd.bayeux.server.BayeuxServer.Extension;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The cometd component is a transport for working with the Jetty implementation
 * of the cometd/bayeux protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.cometd")
public class CometdComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the cometd component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The password for the keystore when using SSL.
     */
    private String sslKeyPassword;
    /**
     * The password when using SSL.
     */
    private String sslPassword;
    /**
     * The path to the keystore.
     */
    private String sslKeystore;
    /**
     * To use a custom configured SecurityPolicy to control authorization. The
     * option is a org.cometd.bayeux.server.SecurityPolicy type.
     */
    private String securityPolicy;
    /**
     * To use a list of custom BayeuxServer.Extension that allows modifying
     * incoming and outgoing requests.
     */
    private List<Extension> extensions;
    /**
     * To configure security using SSLContextParameters. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getSslPassword() {
        return sslPassword;
    }

    public void setSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
    }

    public String getSslKeystore() {
        return sslKeystore;
    }

    public void setSslKeystore(String sslKeystore) {
        this.sslKeystore = sslKeystore;
    }

    public String getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }
}
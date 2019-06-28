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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The sap-netweaver component integrates with the SAP NetWeaver Gateway using
 * HTTP transports.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NetWeaverEndpointBuilderFactory {


    /**
     * Builder for endpoint for the SAP NetWeaver component.
     */
    public interface NetWeaverEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedNetWeaverEndpointBuilder advanced() {
            return (AdvancedNetWeaverEndpointBuilder) this;
        }
        /**
         * Url to the SAP net-weaver gateway server.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder flatternMap(boolean flatternMap) {
            setProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder flatternMap(String flatternMap) {
            setProperty("flatternMap", flatternMap);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder json(boolean json) {
            setProperty("json", json);
            return this;
        }
        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder json(String json) {
            setProperty("json", json);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder jsonAsMap(boolean jsonAsMap) {
            setProperty("jsonAsMap", jsonAsMap);
            return this;
        }
        /**
         * To transform the JSON from a String to a Map in the message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder jsonAsMap(String jsonAsMap) {
            setProperty("jsonAsMap", jsonAsMap);
            return this;
        }
        /**
         * Password for account.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Username for account.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default NetWeaverEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SAP NetWeaver component.
     */
    public interface AdvancedNetWeaverEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NetWeaverEndpointBuilder basic() {
            return (NetWeaverEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNetWeaverEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNetWeaverEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNetWeaverEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNetWeaverEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The sap-netweaver component integrates with the SAP NetWeaver Gateway
     * using HTTP transports.
     * Maven coordinates: org.apache.camel:camel-sap-netweaver
     */
    default NetWeaverEndpointBuilder netWeaver(String path) {
        class NetWeaverEndpointBuilderImpl extends AbstractEndpointBuilder implements NetWeaverEndpointBuilder, AdvancedNetWeaverEndpointBuilder {
            public NetWeaverEndpointBuilderImpl(String path) {
                super("sap-netweaver", path);
            }
        }
        return new NetWeaverEndpointBuilderImpl(path);
    }
}
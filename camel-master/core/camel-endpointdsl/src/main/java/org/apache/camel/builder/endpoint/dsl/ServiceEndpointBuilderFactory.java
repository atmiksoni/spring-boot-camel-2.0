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
 * Represents an endpoint which is registered to a Service Registry such as
 * Consul, Etcd.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ServiceEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Service component.
     */
    public interface ServiceEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedServiceEndpointBuilder advanced() {
            return (AdvancedServiceEndpointBuilder) this;
        }
        /**
         * The endpoint uri to expose as service.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default ServiceEndpointBuilder delegateUri(String delegateUri) {
            setProperty("delegateUri", delegateUri);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Service component.
     */
    public interface AdvancedServiceEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default ServiceEndpointBuilder basic() {
            return (ServiceEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedServiceEndpointBuilder basicPropertyBinding(
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
        default AdvancedServiceEndpointBuilder basicPropertyBinding(
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
        default AdvancedServiceEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedServiceEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Represents an endpoint which is registered to a Service Registry such as
     * Consul, Etcd.
     * Maven coordinates: org.apache.camel:camel-service
     */
    default ServiceEndpointBuilder service(String path) {
        class ServiceEndpointBuilderImpl extends AbstractEndpointBuilder implements ServiceEndpointBuilder, AdvancedServiceEndpointBuilder {
            public ServiceEndpointBuilderImpl(String path) {
                super("service", path);
            }
        }
        return new ServiceEndpointBuilderImpl(path);
    }
}
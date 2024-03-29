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
 * To collect various metrics directly from Camel routes using the DropWizard
 * metrics library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MetricsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Metrics component.
     */
    public interface MetricsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMetricsEndpointBuilder advanced() {
            return (AdvancedMetricsEndpointBuilder) this;
        }
        /**
         * Type of metrics.
         * The option is a
         * <code>org.apache.camel.component.metrics.MetricsType</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder metricsType(MetricsType metricsType) {
            setProperty("metricsType", metricsType);
            return this;
        }
        /**
         * Type of metrics.
         * The option will be converted to a
         * <code>org.apache.camel.component.metrics.MetricsType</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder metricsType(String metricsType) {
            setProperty("metricsType", metricsType);
            return this;
        }
        /**
         * Name of metrics.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder metricsName(String metricsName) {
            setProperty("metricsName", metricsName);
            return this;
        }
        /**
         * Action when using timer type.
         * The option is a
         * <code>org.apache.camel.component.metrics.MetricsTimerAction</code>
         * type.
         * @group producer
         */
        default MetricsEndpointBuilder action(MetricsTimerAction action) {
            setProperty("action", action);
            return this;
        }
        /**
         * Action when using timer type.
         * The option will be converted to a
         * <code>org.apache.camel.component.metrics.MetricsTimerAction</code>
         * type.
         * @group producer
         */
        default MetricsEndpointBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder decrement(Long decrement) {
            setProperty("decrement", decrement);
            return this;
        }
        /**
         * Decrement value when using counter type.
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder decrement(String decrement) {
            setProperty("decrement", decrement);
            return this;
        }
        /**
         * Increment value when using counter type.
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder increment(Long increment) {
            setProperty("increment", increment);
            return this;
        }
        /**
         * Increment value when using counter type.
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder increment(String increment) {
            setProperty("increment", increment);
            return this;
        }
        /**
         * Mark when using meter type.
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder mark(Long mark) {
            setProperty("mark", mark);
            return this;
        }
        /**
         * Mark when using meter type.
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder mark(String mark) {
            setProperty("mark", mark);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * The option is a <code>java.lang.Object</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder subject(Object subject) {
            setProperty("subject", subject);
            return this;
        }
        /**
         * Subject value when using gauge type.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder subject(String subject) {
            setProperty("subject", subject);
            return this;
        }
        /**
         * Value value when using histogram type.
         * The option is a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder value(Long value) {
            setProperty("value", value);
            return this;
        }
        /**
         * Value value when using histogram type.
         * The option will be converted to a <code>java.lang.Long</code> type.
         * @group producer
         */
        default MetricsEndpointBuilder value(String value) {
            setProperty("value", value);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Metrics component.
     */
    public interface AdvancedMetricsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MetricsEndpointBuilder basic() {
            return (MetricsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMetricsEndpointBuilder basicPropertyBinding(
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
        default AdvancedMetricsEndpointBuilder basicPropertyBinding(
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
        default AdvancedMetricsEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMetricsEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.metrics.MetricsType</code> enum.
     */
    enum MetricsType {
        gauge,
        counter,
        histogram,
        meter,
        timer;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.metrics.MetricsTimerAction</code> enum.
     */
    enum MetricsTimerAction {
        start,
        stop;
    }
    /**
     * To collect various metrics directly from Camel routes using the
     * DropWizard metrics library.
     * Maven coordinates: org.apache.camel:camel-metrics
     */
    default MetricsEndpointBuilder metrics(String path) {
        class MetricsEndpointBuilderImpl extends AbstractEndpointBuilder implements MetricsEndpointBuilder, AdvancedMetricsEndpointBuilder {
            public MetricsEndpointBuilderImpl(String path) {
                super("metrics", path);
            }
        }
        return new MetricsEndpointBuilderImpl(path);
    }
}
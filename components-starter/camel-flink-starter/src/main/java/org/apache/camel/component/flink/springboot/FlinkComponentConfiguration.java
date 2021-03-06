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
package org.apache.camel.component.flink.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The flink component can be used to send DataSet jobs to Apache Flink cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.flink")
public class FlinkComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the flink component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * DataSet to compute against. The option is a
     * org.apache.flink.api.java.DataSet type.
     */
    private String dataSet;
    /**
     * Function performing action against a DataSet. The option is a
     * org.apache.camel.component.flink.DataSetCallback type.
     */
    private String dataSetCallback;
    /**
     * DataStream to compute against. The option is a
     * org.apache.flink.streaming.api.datastream.DataStream type.
     */
    private String dataStream;
    /**
     * Function performing action against a DataStream. The option is a
     * org.apache.camel.component.flink.DataStreamCallback type.
     */
    private String dataStreamCallback;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public String getDataSet() {
        return dataSet;
    }

    public void setDataSet(String dataSet) {
        this.dataSet = dataSet;
    }

    public String getDataSetCallback() {
        return dataSetCallback;
    }

    public void setDataSetCallback(String dataSetCallback) {
        this.dataSetCallback = dataSetCallback;
    }

    public String getDataStream() {
        return dataStream;
    }

    public void setDataStream(String dataStream) {
        this.dataStream = dataStream;
    }

    public String getDataStreamCallback() {
        return dataStreamCallback;
    }

    public void setDataStreamCallback(String dataStreamCallback) {
        this.dataStreamCallback = dataStreamCallback;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }
}
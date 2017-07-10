package com.cv.tlv.domain;

import com.cv.tlv.domain.enums.ProcessorTypeEnum;

/**
 * Created by cv on 10/7/17.
 */
public class RequestMessage {
    private ProcessorTypeEnum processorType;
    private Integer lengthOfPayload;
    private String payLoad;

    public RequestMessage(ProcessorTypeEnum processorType, Integer lengthOfPayload, String payLoad) {
        this.processorType = processorType;
        this.lengthOfPayload = lengthOfPayload;
        this.payLoad = payLoad;
    }

    public ProcessorTypeEnum getProcessorType() {
        return processorType;
    }

    public void setProcessorType(ProcessorTypeEnum processorType) {
        this.processorType = processorType;
    }

    public Integer getLengthOfPayload() {
        return lengthOfPayload;
    }

    public void setLengthOfPayload(Integer lengthOfPayload) {
        this.lengthOfPayload = lengthOfPayload;
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "processorType=" + processorType +
                ", lengthOfPayload=" + lengthOfPayload +
                ", payLoad='" + payLoad + '\'' +
                '}';
    }
}

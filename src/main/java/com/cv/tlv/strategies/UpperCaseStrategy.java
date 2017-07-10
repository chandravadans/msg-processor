package com.cv.tlv.strategies;

import com.cv.tlv.domain.RequestMessage;
import com.cv.tlv.domain.ResponseMessage;
import com.cv.tlv.exceptions.TLVException;

/**
 * Created by cv on 10/7/17.
 */
public class UpperCaseStrategy implements ProcessorStrategy {
    @Override
    public ResponseMessage process(RequestMessage requestMessage) throws TLVException {
        return null;
    }
}

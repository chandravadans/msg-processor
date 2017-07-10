package com.cv.tlv.processors;

import com.cv.tlv.domain.RequestMessage;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/**
 * Created by cv on 10/7/17.
 */
public class InputProcessor {
    private InputStream inputStream;

    public InputProcessor(InputStream inputStream) {

    }

    public List<RequestMessage> readMessages() {
        return Collections.emptyList();
    }
}

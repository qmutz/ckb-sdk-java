package org.nervos.ckb.methods.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by duanyytop on 2019-01-08.
 * Copyright © 2018 Nervos Foundation. All rights reserved.
 */
public class Input {

    /**
     * previous_output : {"hash":"0x0000000000000000000000000000000000000000000000000000000000000000","index":4294967295}
     * unlock : {"args":[],"binary":[1,0,0,0,0,0,0,0],"reference":null,"signed_args":[],"version":0}
     */

    @JsonProperty("previous_output")
    public PreviousOutput previousOutput;
    public Script unlock;

    public static class PreviousOutput {
        /**
         * hash : 0x0000000000000000000000000000000000000000000000000000000000000000
         * index : 4294967295
         */

        public String hash;
        public long index;

    }

}
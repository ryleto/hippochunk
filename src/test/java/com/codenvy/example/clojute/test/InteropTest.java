package com.codenvy.example.clojute.test;

import com.codenvy.example.clojure.App;

import org.junit.Test;

public class InteropTest {

    @Test
    public void testInteropCall() {
        App sample = new App();
        sample.main(new String[] {"Clojure"});
    }
}
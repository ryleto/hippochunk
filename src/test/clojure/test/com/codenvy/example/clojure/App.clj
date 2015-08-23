(ns test.com.codenvy.example.clojure.App
  (:use clojure.test
        com.codenvy.example.clojure.App))

(deftest test-main
  (let [result (with-out-str (-main))]
    (is
      (= "Hello, World!\n" result))))
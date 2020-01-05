(ns word-counter.core-test
  (:require [clojure.test :refer :all]
            [word-counter.core :as core]))


(deftest counting-words
  (is (= 1 (core/count-words "Hello")))
  (is (= 2 (core/count-words "Hello, world!")))
  (is (= 0 (core/count-words "")))
  ;; TODO throw Error
  (is (= 0 (core/count-words 1)))
  (is (= 0 (core/count-words nil)))
  )
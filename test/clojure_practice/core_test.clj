(ns clojure-practice.core-test
  (:require [clojure.test :refer :all]
            [clojure-practice.core :refer :all]))

(deftest fib-test
  (testing "Fibonacci numbers"
    (is (= (fib 0) 0))
    (is (= (fib 1) 1))
    (is (= (fib 2) 1))
    (is (= (fib 3) 2))
    (is (= (fib 31) 1346269))))

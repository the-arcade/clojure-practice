(ns clojure-practice.core)

(defn fib [n]
  (if (< n 1) 0 (if (= n 1) 1 (+ (fib (- n 1)) (fib (- n 2))))))

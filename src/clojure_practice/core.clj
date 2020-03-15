(ns clojure-practice.core)

; get a fibonacci number
(defn fib [n]
  (if (< n 1) 0 (if (= n 1) 1 (+ (fib (- n 1)) (fib (- n 2))))))

; calculate factorials
(defn fact-recursion [n]
  (if (= n 0) 1 (* n (fact-recursion (- n 1)))))
(defn fact-reduce [n]
  (reduce * (range 2 (+ n 1))))

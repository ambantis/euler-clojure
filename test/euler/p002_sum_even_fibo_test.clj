(ns euler.p002-sum-even-fibo-test
  (:use [clojure.test :as test]
        [euler.p002-sum-even-fibo :as p002]))

(deftest p002a-test
  (testing "sum of even Fibonacci numbers to 100 should equal 44"
    (is (= 44 (p002/fibo-even-sum 100)))))

(deftest p002b-test
  (testing "sum of even Fibonacci numbers to 4,000,000 should equal 4,613,732"
    (is (= 4613732 (p002/fibo-even-sum 4000000)))))

(ns euler.p003-max-prime-factor-test
  (:use [clojure.test]
        [euler.p003-max-prime-factor]))

(deftest p003a-test
  (testing "greatest prime factor of 13195 should be 29"
    (is (= 29 (largest-prime-factors 13195)))))

(deftest p003b-test
  (testing "greatest prime factor of 600851475143 should be 6857"
    (is (= 6857 (largest-prime-factors 600851475143)))))

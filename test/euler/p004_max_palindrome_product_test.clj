(ns euler.p004-max-palindrome-product-test
  (:use [clojure.test]
        [euler.p004-max-palindrome-product]))

(deftest p004a-test
  (testing "largest palindrome product of 2-digit numbers should be 9009"
    (is (= 9009 (max-palindrome-product-2-digit)))))

(deftest p004b-test
  (testing "largest palindrome product of 3-digit numbers should be 906609"
    (is (= 906609 (max-palindrome-product-3-digit)))))

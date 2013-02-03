(ns euler.p001-sum-multiples-3-5-test
  (:use [clojure.test :as test]
        [euler.p001-sum-multiples-3-5 :as p001]))

(deftest p001a-test
  (testing "sum of even multiples of 3 or 5 to 10 should equal 23"
    (is (= 23 (p001/sum-multiples-3-5 10)))))

(deftest p001b-test
  (testing "sum of even multiples of 3 or 5 to 1000 should equal 233168"
    (is (= 233168 (p001/sum-multiples-3-5 1000)))))

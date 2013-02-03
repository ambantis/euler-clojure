(ns euler.core
  (:require [euler.p001-sum-multiples-3-5 :as p001]
            [euler.p002-sum-even-fibo :as p002]
            [euler.p003-max-prime-factor :as p003]
            [euler.p004-max-palindrome-product :as p004]
            [euler.p005-smallest-multiple :as p005]))

(defn -main
  []
  (println "Problem #001")
  (println "============")
  (print "The sum of all the multiples of 3 or 5 below 1000 = ")
  (println (time (p001/sum-multiples-3-5 1000)))

  (println "Problem #002")
  (println "============")
  (print "The sum of even Fibonnaci numbers that do not exceed 4 million = ")
  (println (time (p002/fibo-even-sum 4000000)))

  (println "Problem #003")
  (println "============")
  (print "The largest prime factor of 600851475143 = ")
  (println (time (p003/largest-prime-factors 600851475143)))

  (println "Problem #004")
  (println "============")
  (print "The largest palindrome made from the product of two 3-digit numbers = ")
  (println (time (p004/max-palindrome-product-3-digit)))

  (println "Problem #005")
  (println "============")
  (print "The smallest even multiple of all numbers 1-20 = ")
  (println (time (p005/smallest-multiple-of-1-to-n 20))))

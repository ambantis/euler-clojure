(ns euler.p002-sum-even-fibo)

(comment 
"
Even Fibonacci numbers

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34 55, 89.
By considering the terms in the Fibonacci sequence whose values do not exceed four
million, find the sum of the even-valued terms.
")

(defn fibo-even-sum
  [ceiling]
  (loop [acc '(2 1)]
    (if (< (first acc) ceiling)
      (recur (conj acc (+ (first acc) (second acc))))
      (->> acc rest (filter even?) (reduce +)))))

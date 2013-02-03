(ns euler.p001-sum-multiples-3-5)

(comment
"
Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get
3, 5, 6, and 9. The sum of these multiples is 23. Find the sum of all the multiples
of 3 or 5 below 1000.
")

(defn mod-3-5?
  [n]
  (or
   (= 0 (mod n 3))
   (= 0 (mod n 5))
   ))

(defn sum-multiples-3-5
  [ceiling]
  (let [numbers (range 1 ceiling)]
    (reduce + (filter mod-3-5? numbers))))

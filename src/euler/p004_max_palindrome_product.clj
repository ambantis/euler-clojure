(ns euler.p004-max-palindrome-product)

(comment
"
Largest Palindrome Product

A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 × 99.  Find
the largest palindrome made from the product of two 3-digit numbers.
")

(defn is-palindrome?
  [n]
  (= (-> n str seq reverse) (-> n str seq)))

(defn max-palindrome-product-2-digit
  []
  (let [ls (for [x (range 1 100) y (range 1 100)] (list x y))]
    (->> ls (map #(* (first %) (second %))) (filter is-palindrome?) (reduce max))))

(defn max-palindrome-product-3-digit
  []
  (let [ls (for [x (range 100 1000) y (range 100 1000)] (list x y))]
    (->> ls (map #(* (first %) (second %))) (filter is-palindrome?) (reduce max))))

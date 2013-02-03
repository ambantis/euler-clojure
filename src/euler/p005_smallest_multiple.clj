(ns euler.p005-smallest-multiple)

(comment 
"
Smallest Multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10
without any remainder. What is the smallest positive number that is evenly divisible
by all of the numbers from 1 to 20?
")

(defn is-divisible-by-all?
  [number divisors]
  (= 0 (reduce + (map #(mod 2 %) divisors))))


(defn smallest-multiple-of-1-to-n
  [n]
  (loop [divisors (range 2 (inc n))
        i n]
    (if (every? #(= 0 (mod i %)) divisors)
      i
      (recur divisors (inc i)))))

(defn smallest-multiple-of-1-to-n2
 [n]
  (let [divisors (range 2 (inc n))]
   (loop [i n]
     (if (loop [d 2]
        (cond (> d n) true
              (not= 0 (mod i d)) false
              :else (recur (inc d))))
     i
     (recur (inc i))))))

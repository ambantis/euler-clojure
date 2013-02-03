(ns euler.p003-max-prime-factor)

(comment 
"
Largest Prime Factor

The prime factors of 13195 are 5, 7, 13, 29. 
What is the largest prime factor of 600851475143?
")

(defn rough-root
  [n]
  (loop [i 1]
    (if (< (* i i) n)
      (recur (inc i))
      i)))

(defn largest-prime-factors
  [n]
  (loop [acc '()
         i 2
         ceiling (rough-root n)
         rem n]
    (cond
     (= i ceiling) (first acc)
     (= 0 (mod rem i)) (recur (conj acc i) i ceiling (/ rem i))
     :else (recur acc (inc i) ceiling rem))))



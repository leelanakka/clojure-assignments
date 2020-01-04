(ns sumOfNNumbers)


(defn sum-of-n-numbers [n] (/ (* n (inc n)) 2))

(println (sum-of-n-numbers 10))

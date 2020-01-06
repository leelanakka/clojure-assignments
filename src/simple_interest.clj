(ns simple-interest)

(defn simple-interest [p t r] (/ (* p t r) 100))

(println (simple-interest 8000 1 9))

(ns temperature-C-F)

(defn temperature-C-F [celsius-temperature] (+ (* celsius-temperature (/ 9 5))32))

(println (temperature-C-F 100))

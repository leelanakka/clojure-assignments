(ns temperature-F-C)

(defn temperature-F-C [fahrenheit-temperature] (* (- fahrenheit-temperature 32) (/ 5 9)))

(println (temperature-F-C 100))

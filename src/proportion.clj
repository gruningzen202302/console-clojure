(ns proportion )

(defn solve-aureus [total]
  (let [phi (/ (+ 1.0 (Math/sqrt 5)) 2)
        a (/ total phi)
        b (- total a)]
    {:a a :b b}))


(println (solve-aureus 588))
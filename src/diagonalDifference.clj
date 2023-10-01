(ns diagonalDifference)

(def arr [[11 2 4] [4 5 6] [10 8 -12]])

arr



(defn repeat-n [n, arr]
  (dotimes [item  n]
    (cond 
      (= 2 item) 
      (println 
       (str 
        item 
        " - " 
        (nth arr item
             ))))))

(repeat-n 3 [10 20 30])

(defn sh-current [n arr]
  (dotimes [i n]
    (println (nth arr i))))


(sh-current 3 arr)


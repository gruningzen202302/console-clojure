(ns diagonalDifference)

(def arr [[11 2 4] 
          [4 5 6] 
          [10 8 -12]])

arr
(defn repeat-n [numtimes arr outer-item]
  (dotimes [item numtimes]
    (cond 
      (= outer-item item) 
      (println 
       (str 
        item 
        " - " 
        (nth arr item
             ))))))

(repeat-n 3 [10 20 30] 1)

(defn outer-mat [numtimes arra one]
  (dotimes [item numtimes]
    (repeat-n numtimes arra item)
    )
  )

(outer-mat 3 arr 1)

(defn sh-current [n arr]
  (dotimes [i n]
    (println (nth arr i))))


(sh-current 3 arr)


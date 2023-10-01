(ns diagonalDifference)

(def arr [[11 2 4] 
          [4 5 6] 
          [10 8 -12]])

arr
(defn repeat-n [numtimes arr outer-item]
  (dotimes [inner-item numtimes] 
    (let [ inner-vector (nth arr outer-item)] 
    (cond (= outer-item inner-item) 
          (nth inner-vector inner-item)
          :else 0
          )
      inner-vector)
))

(repeat-n 3 [10 [10 50 30] 30] 1)

(defn outer-mat [numtimes arra ]
  (dotimes [item numtimes]
    (repeat-n numtimes arra item)
    )
  )

(outer-mat 3 arr )

(defn sh-current [n arr]
  (dotimes [i n]
    (println (nth arr i))))


(sh-current 3 arr)


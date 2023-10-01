(ns diagonalDifference)

(def arr [[11 2 4] 
          [4 5 6] 
          [10 8 -12]])

(def arr02[
           [1 0 1]
           [0 1 0]
           [1 0 1]
           ])


arr

(defn get-sum [numtimes the-vector outer-item]
    (apply + the-vector))

(defn vertical [num outer-arr] 
    (vec (for [item (range num)] 
           (nth (nth outer-arr item) item)
           )
         )
    
  )

(apply + (vertical 3 arr)) 

(defn sum-array-difference [num outer-arr]
  (let [left-to-right (apply + (vertical num outer-arr))
        right-to-left (apply + (vertical num (reverse outer-arr)))]
    (- left-to-right right-to-left)
    )
  )

(Math/abs(sum-array-difference 3 arr))

(defn diagonalDifference [num arr]
  (let [result 
        (abs
        (apply +
               (for [item (range (count arr))] 
                 (- 
                  (nth (nth arr item) (- (- num 1) item)) 
                  (nth (nth arr item) item)
                  )
    )))] result))
  

(diagonalDifference 3 arr)

(for [item (range (count (nth arr 0)))]
  (println item))
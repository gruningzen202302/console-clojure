(ns diagonalDifference)

(def arr [[11 2 4] 
          [4 5 6] 
          [10 8 -12]])

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

(defn diagonalDifference [num outer-arr]
  (let [differ 
        (abs
        (apply +
               (for [item (range num)] 
                 (- 
                  (nth (nth outer-arr item) (- (- num 1) item)) 
                  (nth (nth outer-arr item) item)
                  )
    )))] differ))
  

(diagonalDifference 3 arr)
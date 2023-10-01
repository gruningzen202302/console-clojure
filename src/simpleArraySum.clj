(ns simpleArraySum)

;
; Complete the 'simpleArraySum' function below.
;
; The function is expected to return an INTEGER.
; The function accepts INTEGER_ARRAY ar as parameter.
;


(defn simpleArraySum [ar] (reduce + ar))

(simpleArraySum [1 2 3])
 

; BEGIN: 5j1v3z5j9v8d
(defn repeat-n [n, arr]
  (dotimes [item  n]
    (println item)))

(defn sh-current [n arr] 
  (dotimes [i n] 
    (println (nth arr i))))

(sh-current 3 '(3 6 1))

(defn tot-arr [num,arr]
  (let [n num]
    (loop [i 0 total 0]
      (if (< i n)
        (recur (inc i) (+ total (nth arr i)))
        total))))


  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (+ x 2))))
 

(repeat-n 3 '(3 6 1))
; END: 5j1v3z5j9v8d

;(defn the-sum [num, arr]
;  (repeat-n num)))









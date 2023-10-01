(ns simpleArraySum)
(defn simpleArraySum [ar] (reduce + ar))

(simpleArraySum [1 2 3])

(defn repeat-n [n, arr]
  (dotimes [item  n]
    (println item)))

(defn sh-current [n arr] 
  (dotimes [i n] 
    (println (nth arr i))))


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


(sh-current 3 [1 2 3])

(repeat-n 3 [3 6 1])


;(defn the-sum [num, arr]
;  (repeat-n num)))









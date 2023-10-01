(ns simpleArraySum)

;
; Complete the 'simpleArraySum' function below.
;
; The function is expected to return an INTEGER.
; The function accepts INTEGER_ARRAY ar as parameter.
;


(defn simpleArraySum [ar] (reduce + ar))

(defn simpleArraySumNotReduced [ar]
  (loop [nums ar, sum 0]
    (if-let [n (first nums)]
      (do
        (let [new-sum (+ sum n)]
          (recur (rest nums) new-sum))
      sum))))


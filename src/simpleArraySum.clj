

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

(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def ar-count (Integer/parseInt (clojure.string/trim (read-line))))

(def ar (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))

(def result (simpleArraySum ar))

(spit fptr (str result "\n") :append true)
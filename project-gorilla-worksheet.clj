;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;; **

;; @@
(ns blessed-waterfall
  (:require [gorilla-plot.core :as plot]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(slurp "/home/vex/")
;; @@

;; @@
(def primes_found (atom 1))

(defn find_primes [n]
  (loop [i 2 prime_list (transient )]
   ))
(while (> 10 @primes_found)
  )
(for [x (range 3 50 2)]
  x)

(def foo (transient (apply vector (range 3 50 2))))
(def bar (transient (map)))

(doall (map #(keyword (str %) (repeat ))  (range 3 50 2)))

(def my-set (apply sorted-set (range 3 50 2) ))
(my-set 3)
(apply print my-set)

(def my-bar (transient (apply sorted-set (range 3 50 2)))
  (loop [i 3 prime_list (transient (apply sorted-set (range 3 50 2)))]
    )
(count foo)



;; @@

;; @@
(def primes_found (atom 1))

(defn find_primes [n]
  (loop [i 2 prime_list (transient )]
   ))
(while (> 10 @primes_found)
  )
(for [x (range 3 50 2)]
  x)

(def foo (transient (apply vector (range 3 50 2))))
(def bar (transient (map)))
(doall (map #(keyword (str %) (repeat ))  (range 3 50 2)))
(def my-set (apply sorted-set (range 3 50 2) ))
(my-set 3)
(apply print my-set)
(def my-bar (transient (apply hash-set (range 3 50 2))))
  (loop [i 3 prime_list (transient (apply hash-set (range 3 50 2)))]
    (if (<= i 50)
      (while (-> i  (* j) (< 50))
        (get prime_list j)) )))
(count foo)

(while (< @j n)
  (disj prime_list @j)
  (+ (* j j) (* j ))
  (swap! j (+  j 2 )))

(if (< (+ (* j (- j 1)) (* j i)) n)
  (recur (+ i 2) (disj! (+ (* j (- j 1)) (* j i)) prime_list))
  prime_list)

(defn myfor [n]
  (loop [i 1]
  (if (< i n)
    (recur (+ i 2))
    i))) 

;; @@

;; @@
(def my-odd-list (cons 2 (range 3 50 2)))
(println my-odd-list)
;; @@
;; ->
;;; (2 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(let [n 50
      i 3]
	(let [test-set (apply sorted-set (range 3 50 2))
           j 0]
  		(let [rest-set (rest test-set)]
          (if (< j n);; (j^2)+(j*i)
            (do 
              (println test-set)
              (println rest-set)
              (println i (first rest-set) (* i (first rest-set)))
              (recur (disj test-set (* i (first rest-set)))
                    (inc j)))
          test-set))))
;; @@

;; @@
(def test-set (transient (apply vector (range 3 50 2))))
  ;(apply sorted-set (range 3 50 2))
(count test-set)
(nth test-set 0)
(get test-set (- (count test-set) 1))
;(print test-set)
;(first test-set)

(assoc! test-set 3 false)
;(next test-set)
()
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[clojure.lang.PersistentVector$TransientVector 0x10e8f7d1 &quot;clojure.lang.PersistentVector$TransientVector@10e8f7d1&quot;]</span>","value":"#object[clojure.lang.PersistentVector$TransientVector 0x10e8f7d1 \"clojure.lang.PersistentVector$TransientVector@10e8f7d1\"]"}
;; <=

;; @@
;(zipmap (map #(keyword (str %)) (range 3 20 2)) (range 3 20 2))
(defn keystr [k]
  (keyword (str k)))
(time (let [n 50
      oddlist (range 3 n 2)]
  
(loop [test-set  (zipmap (map keystr oddlist) oddlist)
       j 3
       i 3]
  (if (< (* j i) n)
    (do
      ;(println (get test-set (keystr j)) (get test-set (keystr (* j 3))))
      (recur (dissoc test-set (keystr (* i j)));(* (nth j test-set) (nth (* j 2) test-set)))
           	 (+ 2 j)
             i))
    (println  test-set);););(if (< j n))
  
  ))))
;; @@
;; ->
;;; {:37 37, :31 31, :11 11, :23 23, :13 13, :43 43, :7 7, :35 35, :47 47, :25 25, :17 17, :49 49, :19 19, :5 5, :41 41, :3 3, :29 29}
;;; &quot;Elapsed time: 65.126363 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(time (let [l (transient (apply vector (range 2 20 2)))
      i (atom 10)]
  (while (pos? @i)
    (do 
      (println (get l  @i))
      ;(disj l (* 3 %))
      (swap! i - 2)
      ))
        
        (println (persistent! l)))
  ;(iterate  2)
  )
;; @@
;; ->
;;; nil
;;; 18
;;; 14
;;; 10
;;; 6
;;; [2 4 6 8 10 12 14 16 18]
;;; &quot;Elapsed time: 5.359198 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
;(time 
(def prime_list 
  (let [primes 10
      n (* primes 10)
      smallest_odd 3 ;smallest odd prime, skipping all evens for efficiency
      ]
  ;I use a sorted-set for printing purpose. A transient! hash-set would yield log32n disj vs log2n disj
  (loop [ml (apply sorted-set (cons 2 (range smallest_odd n 2))) 
       i smallest_odd
       j smallest_odd]
    (cond
      (< (* i j) n)
          (do
            ;(println "i" i (* i j))
            (recur (disj ml (* i j)) ; disj is log32n faster when a hash-set.
                   (+ 2 i) 
                   j))
      (< j n) ;I need to have to inner loops similar to double/iner for loops, which yields On^2 
          (do
            ;(println (+ 2 j) (get ml (+ 2 j)))
            ;(println "j recur increase" (+ 2 j))
            
            (if (get ml (+ 2 j))
              (recur ml
                     smallest_odd ;reset i to smallest_odd, since we found another prime
                     (+ 2 j)) ;found j+2 as other prime
              (recur ml
                     i ;keep i, j+2 isn't a prime checking next odd #
                     (+ 2 j));(+ 2 @y));j 2))
           ))
      :else (take primes ml)))
  ))
;)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/prime_list</span>","value":"#'user/prime_list"}
;; <=

;; @@
(pprint (for [x (cons 1 prime_list)]
  [(map (partial * x) (cons 1 prime_list))]))
;; @@
;; ->
;;; ([(1 2 3 5 7 11 13 17 19 23 29)]
;;;  [(2 4 6 10 14 22 26 34 38 46 58)]
;;;  [(3 6 9 15 21 33 39 51 57 69 87)]
;;;  [(5 10 15 25 35 55 65 85 95 115 145)]
;;;  [(7 14 21 35 49 77 91 119 133 161 203)]
;;;  [(11 22 33 55 77 121 143 187 209 253 319)]
;;;  [(13 26 39 65 91 143 169 221 247 299 377)]
;;;  [(17 34 51 85 119 187 221 289 323 391 493)]
;;;  [(19 38 57 95 133 209 247 323 361 437 551)]
;;;  [(23 46 69 115 161 253 299 391 437 529 667)]
;;;  [(29 58 87 145 203 319 377 493 551 667 841)])
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
;(apply hash-map 
(def oddlist (range 3 20 2) )
(map #(keyword (str %))oddlist)
      (zipmap (map #(keyword (str %)) (range 3 20 2)) (range 3 20 2))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:3</span>","value":":3"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:3 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:5</span>","value":":5"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"[:5 5]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:7</span>","value":":7"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"[:7 7]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:9</span>","value":":9"},{"type":"html","content":"<span class='clj-long'>9</span>","value":"9"}],"value":"[:9 9]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:11</span>","value":":11"},{"type":"html","content":"<span class='clj-long'>11</span>","value":"11"}],"value":"[:11 11]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:13</span>","value":":13"},{"type":"html","content":"<span class='clj-long'>13</span>","value":"13"}],"value":"[:13 13]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:15</span>","value":":15"},{"type":"html","content":"<span class='clj-long'>15</span>","value":"15"}],"value":"[:15 15]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:17</span>","value":":17"},{"type":"html","content":"<span class='clj-long'>17</span>","value":"17"}],"value":"[:17 17]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:19</span>","value":":19"},{"type":"html","content":"<span class='clj-long'>19</span>","value":"19"}],"value":"[:19 19]"}],"value":"{:3 3, :5 5, :7 7, :9 9, :11 11, :13 13, :15 15, :17 17, :19 19}"}
;; <=

;; @@

;; @@
